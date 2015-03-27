package lab_7.part_1;

/**
 *
 * Created by Martin Zuber on 27/03/2015.
 */
public class ProxyLocalServer extends WebServer{

    private WebServer realServer;

    @Override
    void getConnection() {

        if(realServer == null) realServer = new RealLocalServer();
        System.out.println("You are attempting to connect to " +
                "the web but have connected instead to a Proxy." +
                " All website activity will be monitored");
        realServer.getConnection();
    }
}
