package resources;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

/**
 * Created by Crystal on 11/23/16.
 */
public class RankingResource extends ServerResource {
    @Get
    public Rank retrieve(){
        return new Rank("helloworld");
    }
}
