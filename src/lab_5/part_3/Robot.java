package lab_5.part_3;

import javax.swing.*;
import java.awt.*;

/**
 * concrete robot based on robot interface
 * Created by Martin Zuber on 04/03/2015.
 */
class Robot extends JPanel implements RobotPlan{

    Robot() {
        setLayout(new BorderLayout());
    }

    @Override
    public void setRobotHead(Icon head) {
        JLabel headL = new JLabel();
        headL.setIcon(head);
        add(headL, BorderLayout.NORTH);
    }

    @Override
    public void setRobotBody(Icon body) {
        JLabel bodyL = new JLabel();
        bodyL.setIcon(body);
        add(bodyL, BorderLayout.CENTER);
    }

    @Override
    public void setRobotLegs(Icon legs) {
        JLabel legsL = new JLabel();
        legsL.setIcon(legs);
        add(legsL, BorderLayout.SOUTH);
    }
}
