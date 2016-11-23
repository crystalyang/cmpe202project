import org.restlet.Component;
import org.restlet.data.Protocol;

/**
 * Created by Crystal on 11/23/16.
 */
public class Server {
    Component component;

    public static  void main(String[] args){
        Server server = new Server();
        try{
            server.start(8080);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void start(int port) throws Exception{
        MyApplication app = new MyApplication();

        component = new Component();
        component.getServers().add(Protocol.HTTP, port);
        component.getDefaultHost().attach(app);
        component.start();
    }

    public void stop() throws Exception{
        component.stop();
    }
}
