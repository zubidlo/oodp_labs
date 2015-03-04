package lab_5.part_1;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Vector;

/**
 * Radio Buttons Choice.
 * Created by Martin Zuber on 04/03/2015.
 */
public class RadioButtonsChoice extends MultiChoice {

    private final JPanel panel;
    private final ArrayList<JRadioButton> radioButtons;

    /**
     * Creates Radio buttons choice from given choices.
     * @param choices given choices
     */
    RadioButtonsChoice(Vector<String> choices) {
        super(choices);
        panel = new JPanel(new GridLayout(choices.size(), 1));
        radioButtons = new ArrayList<JRadioButton>();

        for(String choice : choices) {

            JRadioButton radioButton = new JRadioButton(choice);
            radioButtons.add(radioButton);
            panel.add(radioButton);
        }
    }

    @Override
    JPanel getUI() {
        return panel;
    }

    @Override
    String[] getSelected() {
        ArrayList<String> selectedRadioButtons = new ArrayList<String>();

        for(JRadioButton radioButton : radioButtons)
            if(radioButton.isSelected()) selectedRadioButtons.add(radioButton.getText());

        return selectedRadioButtons.toArray(new String[selectedRadioButtons.size()]);
    }

    @Override
    void clearAll() {
        for(JRadioButton radioButton : radioButtons) radioButton.setSelected(false);
    }
}
