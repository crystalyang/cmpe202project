import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;
import resources.RankingResource;

/**
 * Created by Crystal on 11/23/16.
 */
public class MyApplication extends Application{
    @Override
    public Restlet getInboundRoot(){
        Router router = new Router();
        router.attach("/getRank", RankingResource.class);
        return router;
    }

}
