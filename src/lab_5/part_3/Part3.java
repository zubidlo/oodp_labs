package lab_5.part_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * main GUI
 * Created by Martin Zuber on 04/03/2015.
 */
public class Part3 {

    private static RobotBuilder legoRobotBuilder, stickmanRobotBuilder;
    private static JFrame frame;
    private static JPanel centerPanel;

    public static void main(String[] args) {

        legoRobotBuilder = new LegoRobotBuilder();
        stickmanRobotBuilder = new StickmanRobotBuilder();

        frame = new JFrame("Robot Builders");
        centerPanel = new JPanel(new BorderLayout());
        JPanel southPanel = new JPanel(new BorderLayout());
        JButton legoRobotB = new JButton(legoRobotBuilder.toString());
        JButton stickmanRobotB = new JButton(stickmanRobotBuilder.toString());
        southPanel.add(legoRobotB, BorderLayout.NORTH);
        southPanel.add(stickmanRobotB, BorderLayout.SOUTH);
        frame.add(centerPanel, BorderLayout.CENTER);
        frame.add(southPanel, BorderLayout.SOUTH);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.requestFocus();
        frame.setVisible(true);

        legoRobotB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                letsMakeRobotTogether(new RobotDirector(legoRobotBuilder));
            }
        });

        stickmanRobotB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                letsMakeRobotTogether(new RobotDirector(stickmanRobotBuilder));
            }
        });

    }

    private static void letsMakeRobotTogether(RobotDirector director) {
        frame.remove(centerPanel);
        director.makeRobot();
        centerPanel = director.getRobot();
        frame.add(centerPanel);
        frame.pack();
    }
}
