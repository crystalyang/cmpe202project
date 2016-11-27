package resources;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.*;
import org.json.JSONException;
import org.json.JSONObject;
import org.restlet.representation.*;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;
import org.restlet.ext.json.* ;


import java.io.IOException;
import java.util.List;

/**
 * Created by Crystal on 11/23/16.
 */
public class RankingResource extends ServerResource {
    @Get
    public Representation getRank() throws JSONException {
        //dbConnection();
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        String hql = "from Timer order by duration asc";

        Query query = session.createQuery(hql);
        query.setMaxResults(3);
        List<Timer> results = (List<Timer>) query.list();
        int[] top3 = new int[3];
        top3[0] = results.get(0).getDuration();
        top3[1] = results.get(1).getDuration();
        top3[2] = results.get(2).getDuration();

        JSONObject json = new JSONObject();
        json.put("ranks",top3);
        return new JsonRepresentation(json);
    }


    @Post
    public void  post_request(JsonRepresentation jsonRep) throws IOException{



        JSONObject json = jsonRep.getJsonObject() ;
        System.out.println(json);
        int action =json.getInt("rank");

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Timer timer = new Timer(action);
        session.save(timer);
        session.getTransaction().commit();

        System.out.println(action);



    }
}
