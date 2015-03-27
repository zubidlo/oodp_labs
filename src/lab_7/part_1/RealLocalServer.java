package lab_7.part_1;

/**
 *
 * Created by Martin Zuber on 27/03/2015.
 */
public class RealLocalServer extends WebServer {

    @Override
    void getConnection() {
        System.out.println("You have connected to the real local server directly");
    }
}
