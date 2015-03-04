package lab_5.part_2;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

/**
 * No border decorator.
 * Created by Martin Zuber on 04/03/2015.
 */
class NoBorderDecorator extends LabelDecorator {

    NoBorderDecorator(LabelWithMouseListener componentToByDecorated) {
        super(componentToByDecorated);
    }

    @Override
    void setBorder() {
        Border border = BorderFactory.createEmptyBorder();
        setBorder(new TitledBorder(border, getDescription()));
    }

    @Override
    String getDescription() {
        return super.getDescription() + " without any border";
    }
}
