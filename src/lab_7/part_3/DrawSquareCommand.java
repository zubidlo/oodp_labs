package lab_7.part_3;

import javax.swing.*;
import java.awt.*;

/**
 * specific command
 * Created by martin on 29/03/2015.
 */
public class DrawSquareCommand extends JPanel implements Command {

    @Override
    public JPanel execute() {
        System.out.println("DrawSquareCommand::execute");
        setBackground(Color.white);
        return this;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int[] xPoints = {10, 10, 200, 200};
        int[] yPoints = {10, 200, 200, 10};
        g.fillPolygon(xPoints, yPoints, 4);

    }
}
