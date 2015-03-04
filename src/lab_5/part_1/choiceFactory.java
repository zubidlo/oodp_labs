package lab_5.part_1;

import java.util.*;

/**
 * Created by lecturer, refactored by Martin Zuber.
 */
class ChoiceFactory {

    MultiChoice getChoiceUI(Vector<String> choices) {

        if (choices.size() <= 3) return new CheckBoxChoice(choices);
        else if (choices.size() < 5) return new ListBoxChoice(choices);
        else return new RadioButtonsChoice(choices);
    }
}

