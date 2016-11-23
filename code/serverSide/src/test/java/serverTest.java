import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.restlet.representation.Representation;
import org.restlet.resource.ClientResource;

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
        Assert.assertEquals("application/json", representation.getMediaType().toString());
        Assert.assertEquals("{\"rank\":\"helloworld\"}", representation.getText());
    }
}
