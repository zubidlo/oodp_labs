package lab_5.part_3;

import javax.swing.*;
import java.net.URL;

import static java.lang.System.err;

/**
 * Stickman robot builder based on robot builder interface
 * Created by Martin Zuber on 04/03/2015.
 */
class StickmanRobotBuilder implements RobotBuilder {

    private final Robot robot;

    StickmanRobotBuilder() {
        robot = new Robot();
    }

    @Override
    public void buildRobotHead() {
        robot.setRobotHead(makeIcon("StickmanHead.png"));
    }

    @Override
    public void buildRobotBody() {
        robot.setRobotBody(makeIcon("StickmanBody.png"));
    }

    @Override
    public void buildRobotLegs() {
        robot.setRobotLegs(makeIcon("StickmanLegs.png"));
    }

    @Override
    public Robot getRobot() {
        return robot;
    }

    @Override
    public String toString() {
        return "Stickman robot builder";
    }

    private Icon makeIcon(String path) {
        URL imgURL = getClass().getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            err.println("Couldn't find file: " + path);
            return null;
        }
    }
}
