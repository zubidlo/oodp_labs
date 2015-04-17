package lab_5.part_1;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Vector;
import java.util.stream.Collectors;

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
        radioButtons = new ArrayList<>();

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
        return radioButtons.stream()
                .filter(radioButton -> radioButton.isSelected())
                .map(JRadioButton::getText)
                .toArray(size -> new String[size]);
    }

    @Override
    void clearAll() {
        for(JRadioButton radioButton : radioButtons) radioButton.setSelected(false);
    }
}
