package lab_7.part_3;

import javax.swing.*;
import java.awt.*;

/**
 * specific command
 * Created by martin on 29/03/2015.
 */
public class DrawCircleCommand extends JPanel implements Command {

    @Override
    public JPanel execute() {
        System.out.println("DrawCircleCommand::execute");
        setBackground(Color.white);
        return this;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(10, 10, 200, 200);
    }
}
