package lab_7.part_2;

/**
 * Created by Martin Zuber on 27/03/2015.
 */
public class GremlinGUI {

    public static void main(String[] args) {
        Gremlin g = new Gremlin("blea");
        System.out.println(g.getName());
        System.out.println(g.getImage().getIconHeight());
    }
}
