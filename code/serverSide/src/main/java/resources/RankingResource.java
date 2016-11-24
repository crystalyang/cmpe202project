package resources;
import org.json.JSONObject;
import org.restlet.representation.*;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;
import org.restlet.ext.json.* ;


import java.io.IOException;

/**
 * Created by Crystal on 11/23/16.
 */
public class RankingResource extends ServerResource {
    @Get
    public Rank getRank(){
        return new Rank("helloworld");
    }

    @Post
    public void  post_request(JsonRepresentation jsonRep) throws IOException{
        JSONObject json = jsonRep.getJsonObject() ;
        String action = json.getString("rank") ;
        System.out.println(action);



    }
}
