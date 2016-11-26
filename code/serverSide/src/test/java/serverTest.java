import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.restlet.data.MediaType;
import org.restlet.representation.*;
import org.restlet.resource.ClientResource;
import org.json.JSONObject ;
import org.restlet.ext.json.* ;


import java.io.IOException;

/**
 * Created by Crystal on 11/23/16.
 */
public class serverTest {
    Server Server = new Server();
    @Before
    public void setUp() throws Exception {
        Server.start(8080);

    }

    @After
    public void tearDown() throws Exception {
        Server.stop();

    }

    @Test
    public void helloWord() throws IOException{
        Representation representation = new ClientResource("http://localhost:8080/helloword").get();
//        Assert.assertEquals("application/json", representation.getMediaType().toString());
//        Assert.assertEquals("{\"rank\":\"helloworld\"}", representation.getText());
    }

    @Test
    public void postRank() throws IOException{
        ClientResource client  = new ClientResource("http://localhost:8080/helloword");
        JSONObject rank = new JSONObject();
        rank.put("rank", "89999");
        client.post(new JsonRepresentation(rank),MediaType.APPLICATION_JSON);

//        Assert.assertEquals("application/json", representation.getMediaType().toString());
//        Assert.assertEquals("{\"rank\":\"helloworld\"}", representation.getText());
    }
}
