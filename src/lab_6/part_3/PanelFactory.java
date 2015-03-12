package lab_6.part_3;

import javax.swing.*;
import java.util.EventListener;

/**
 * panel factory
 * Created by Martin Zuber on 12/03/2015.
 */
class PanelFactory {

    static JPanel getPanel(String actionCommand) {
        return new MyPanel(actionCommand);
    }
}

class MyPanel extends JPanel implements EventListener {

    MyPanel(String actionCommand) {

    }
}
