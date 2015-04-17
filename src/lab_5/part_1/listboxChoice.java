package lab_5.part_1;

import java.util.*;
import javax.swing.*;

/**
 * Created by lecturer, refactored by Martin Zuber.
 */
class ListBoxChoice extends MultiChoice {

    private final JawtList list;
    private final JPanel panel;

    ListBoxChoice(Vector<String> choices) {
        super(choices);
        list = new JawtList();
        list.setMultipleMode(true);
        panel = new JPanel();

        choices.forEach(list::add);

        panel.add(list);
    }

    @Override
    JPanel  getUI() {
        return panel;
    }

    @Override
    String[] getSelected() {
        return list.getSelectedItems ();
    }

    @Override
    void clearAll() {
        for (int i = 0; i < choices.size(); i++) list.deselect(i);
    }
}

