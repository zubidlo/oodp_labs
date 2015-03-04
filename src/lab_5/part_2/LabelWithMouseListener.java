package lab_5.part_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Abstract label.
 * Created by Martin Zuber on 04/03/2015.
 */
abstract class LabelWithMouseListener extends JLabel implements MouseListener {

    LabelWithMouseListener() {
        setPreferredSize(new Dimension(300, 300));
        addMouseListener(this);
    }

    abstract void setBorder();
    abstract String getDescription();

    @Override
    public void mouseEntered(MouseEvent e) {
        setBorder();
    }

    @Override
    public void mouseExited(MouseEvent e) {}

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}
}
