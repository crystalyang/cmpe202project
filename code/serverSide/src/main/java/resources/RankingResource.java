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
        //dbConnection();
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        try {
            String hql = "from Timer order by duration desc";

            Query query = session.createQuery(hql);
            query.setMaxResults(3);
            List<Timer> results = (List<Timer>) query.list();
            System.out.println("sql connect " + results.size());
        }catch(HibernateException he){
            System.err.println(he.getLocalizedMessage());
        }
    }


    @Post
    public void  post_request(JsonRepresentation jsonRep) throws IOException{



        JSONObject json = jsonRep.getJsonObject() ;
        int action =Integer.valueOf(json.getString("rank"));

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Timer timer = new Timer(action);
        session.save(timer);
        session.getTransaction().commit();

        System.out.println(action);



    }

//    public void dbConnection(){
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        session.beginTransaction();
//        try {
//            String hql = "from Timer order by duration desc";
//
//            Query query = session.createQuery(hql);
//            query.setMaxResults(3);
//            List<Timer> results = (List<Timer>) query.list();
//            System.out.println("sql connect " + results.size());
//        }catch(HibernateException he){
//            System.err.println(he.getLocalizedMessage());
//        }
//
//    }
}
