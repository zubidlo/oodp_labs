package lab_5.part_1;

import java.awt.*;
import java.util.*;
import java.util.stream.Collectors;
import javax.swing.*;

/**
 * Created by lecturer, refactored by Martin Zuber.
 */
class CheckBoxChoice extends MultiChoice {

    private final JPanel panel;
    private final ArrayList<JCheckBox> checkBoxes;

    CheckBoxChoice(Vector<String> choices) {
        super(choices);
        panel = new JPanel();
        panel.setLayout(new GridLayout(choices.size(), 1));
        checkBoxes = new ArrayList<>();

        for (String choice : choices) {
            JCheckBox checkBox = new JCheckBox(choice);
            panel.add(checkBox);
            checkBoxes.add(checkBox);
        }
    }

    @Override
    JPanel getUI() {
       return panel;
    }

    @Override
    String[] getSelected() {
        return checkBoxes.stream()
                .filter(checkBox -> checkBox.isSelected())
                .map(JCheckBox::getText)
                .toArray(size -> new String[size]);
    }

    @Override
    void clearAll() {
        for(JCheckBox checkBox : checkBoxes) checkBox.setSelected(false);
    }
}

