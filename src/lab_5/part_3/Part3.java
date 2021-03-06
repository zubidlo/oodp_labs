package lab_5.part_3;

import utilities.FrameSkeleton;

import javax.swing.*;
import java.awt.*;

/**
 * main GUI
 * Created by Martin Zuber on 04/03/2015.
 */
public class Part3 extends FrameSkeleton{

    private static RobotBuilder legoRobotBuilder, stickmanRobotBuilder;
    private static JPanel centerPanel;

    private Part3(String title) {
        super(title);
        legoRobotBuilder = new LegoRobotBuilder();
        stickmanRobotBuilder = new StickmanRobotBuilder();

        centerPanel = new JPanel(new BorderLayout());
        JPanel southPanel = new JPanel(new BorderLayout());
        JButton legoRobotB = new JButton(legoRobotBuilder.toString());
        JButton stickmanRobotB = new JButton(stickmanRobotBuilder.toString());
        southPanel.add(legoRobotB, BorderLayout.NORTH);
        southPanel.add(stickmanRobotB, BorderLayout.SOUTH);
        add(centerPanel, BorderLayout.CENTER);
        add(southPanel, BorderLayout.SOUTH);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        pack();

        legoRobotB.addActionListener( e -> letsMakeRobotTogether(new RobotDirector(legoRobotBuilder)));
        stickmanRobotB.addActionListener(e -> letsMakeRobotTogether(new RobotDirector(stickmanRobotBuilder)));
    }

    private void letsMakeRobotTogether(RobotDirector director) {
        remove(centerPanel);
        director.makeRobot();
        centerPanel = director.getRobot();
        add(centerPanel);
        pack();
    }

    public static void main(String[] args) {

        new Part3("Robot Builder");



    }
}
