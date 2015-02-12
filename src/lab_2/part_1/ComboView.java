package lab_2.part_1;

import javax.swing.*;
import java.awt.*;
import java.util.*;

/**
 * Created by martin on 12/02/2015.
 */
public class ComboView extends AbstractHobbyView {

    private final JComboBox<Hobby> comboBox;

    /**
     * Creates JFrame with given title and list of hobbies to combo box.
     * @param title  title of the frame
     * @param hobbies vector of hobbies
     */
    public ComboView(String title, Vector<Hobby> hobbies) {

        super(title);

        //create specific components
        comboBox = new JComboBox<Hobby>(hobbies);
        canvas.add(comboBox, BorderLayout.NORTH);
        pack();
    }

    /**
     * Puts given hobbies into combo box
     * @param hobbies hobbies to refill combo box with
     */
    @Override
    public void refillViewList(Vector<Hobby> hobbies) {

        comboBox.setModel(new DefaultComboBoxModel<Hobby>(hobbies));
    }
}
