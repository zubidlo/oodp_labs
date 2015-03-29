package lab_7.part_2;

import javax.swing.*;
import java.awt.*;

/**
 * Created by martin on 29/03/2015.
 */
public class GremlinPanel extends JPanel {

    private final Gremlin gremlin;

    private GremlinPanel(String name) {
        gremlin = new Gremlin(name);
        setLayout(new BorderLayout());
        add(new JButton(gremlin.getImage()), BorderLayout.CENTER);
        add(new JLabel(gremlin.getName()), BorderLayout.SOUTH);
    }

    @Override
    public String toString() {
        return String.format("gremlin name: %s, image object hash code: %s%n", gremlin.getName(), gremlin.getImage().hashCode());
    }
    public static GremlinPanel makeNewGremlin(String name) {
        return new GremlinPanel(name);
    }
}
