package lab_7.part_2;

import utilities.FrameSkeleton;

import javax.swing.*;

/**
 * Created by Martin Zuber on 27/03/2015.
 */
public class GremlinGUI extends FrameSkeleton {

    private GremlinGUI() {
        super("Gremlins");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GremlinGUI::new);
    }
}
