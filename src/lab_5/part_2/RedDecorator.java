package lab_5.part_2;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;

/**
 * Red border decorator.
 * Created by Martin Zuber on 04/03/2015.
 */
class RedDecorator extends LabelDecorator {

    RedDecorator(LabelWithMouseListener componentToByDecorated) {
        super(componentToByDecorated);
    }

    @Override
    void setBorder() {
        Border border = BorderFactory.createLineBorder(Color.RED, 15);
        setBorder(new TitledBorder(border, getDescription()));
    }

    @Override
    String getDescription() {
        return super.getDescription() + " with nice red border";
    }
}
