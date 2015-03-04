package lab_5.part_1;

import java.util.*;
import javax.swing.*;

/**
 * Created by lecturer, slightly refactored by Martin Zuber.
 */
abstract class MultiChoice {

    Vector<String> choices;

    MultiChoice(Vector<String> choices) {

        this.choices = choices;
    }

    abstract JPanel getUI();
    abstract String[] getSelected();
    abstract void clearAll();
}
