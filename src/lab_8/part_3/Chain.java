package lab_8.part_3;

import javax.swing.*;
import javax.swing.text.html.ObjectView;

/**
 * Created by martin on 14/04/2015.
 */
public interface Chain {

    void addChain(Chain c);
    Chain getChain();
    void sendToChain(Object object);
}
