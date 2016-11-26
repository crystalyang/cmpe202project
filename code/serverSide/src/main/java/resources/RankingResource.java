package resources;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.*;
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
    public void getRank(){
        dbConnection();
    }

    @Post
    public void  post_request(JsonRepresentation jsonRep) throws IOException{
        JSONObject json = jsonRep.getJsonObject() ;
        String action = json.getString("rank") ;
        System.out.println(action);



    }

    public void dbConnection(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        try {
            String hql = "from Timer ";

            Query query = session.createQuery(hql);
            List<Timer> results = (List<Timer>) query.list();
            System.out.println("sql connect " + results.size());
        }catch(HibernateException he){
            System.err.println(he.getLocalizedMessage());
        }

    }
}
