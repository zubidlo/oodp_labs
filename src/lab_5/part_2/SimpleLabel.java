package lab_5.part_2;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

/**
 * simple label
 * Created by Martin Zuber on 04/03/2015.
 */
class SimpleLabel extends LabelWithMouseListener {

    @Override
    void setBorder() {
        Border border = BorderFactory.createEtchedBorder();
        setBorder(new TitledBorder(border, getDescription()));
    }

    @Override
    String getDescription() {
        return "this is simple label";
    }
}
