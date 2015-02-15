package lab_2.part_1;

import javax.swing.*;
import java.awt.*;
import java.util.*;

class ComboView extends AbstractHobbyView {

    private final JComboBox<Hobby> comboBox;

    /**
     * Creates JFrame with given title and list of hobbies to combo box.
     * @param title  title of the frame
     * @param hobbies vector of hobbies
     */
    ComboView(String title, Vector<Hobby> hobbies) {

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
    void refillViewList(Vector<Hobby> hobbies) {

        comboBox.setModel(new DefaultComboBoxModel<Hobby>(hobbies));
    }
}
