package lab_8.part_3;

import utilities.FrameSkeleton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.*;
import java.util.List;

/**
 * part 3
 * Created by martin on 14/04/2015.
 */
public class Part3 extends FrameSkeleton {

    public static final ScorePanel soccerScorePanel = new ScorePanel("Soccer Score!");
    public static final ScorePanel basketballScorePanel = new ScorePanel("Basketball Score!");
    public static final ScorePanel rugbyScorePanel = new ScorePanel("Rugby Score!");
    public static final ScorePanel unrecognizedScorePanel = new ScorePanel("Unrecognized Score!");
    public static final List<ImageIcon> icons = Arrays.asList(Icons.SOCCER, Icons.BASKETBALL, Icons.RUGBY, Icons.UNKNOWN);

    private static final Chain chain = new Soccer(new Basketball(new Rugby(new Unknown(null))));
    private static final JComboBox<String> comboBox = new JComboBox(new String[]{"ball 1", "ball 2", "ball 3", "ball 4"});
    private static final int startSelectedIndex = 3;
    private static JLabel ballLabel = new JLabel(Icons.EMPTY);
    private static final JPanel decisionPanel = buildDecisionPanel();

    public Part3(final String title) {
        super(title);
        getContentPane().setBackground(Color.WHITE);
        getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        getContentPane().add(decisionPanel);
        getContentPane().add(soccerScorePanel);
        getContentPane().add(basketballScorePanel);
        getContentPane().add(rugbyScorePanel);
        getContentPane().add(unrecognizedScorePanel);
        pack();
        comboBox.setSelectedIndex(startSelectedIndex);
        processSelection(comboBox.getSelectedIndex());
        comboBox.addActionListener(this::consumeEvent);
        comboBox.requestFocus();
    }

    private void consumeEvent(ActionEvent e) {
        JComboBox<String> box;
        if(e.getSource() instanceof JComboBox) {
            box = (JComboBox) e.getSource();
            processSelection(box.getSelectedIndex());
        }
    }

    private void processSelection(int selectedIndex) {

        ImageIcon icon = icons.get(selectedIndex);
        ballLabel.setIcon(icon);
        pack();
        chain.sendToChain(icon);
    }

    private static JPanel buildDecisionPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(comboBox, BorderLayout.NORTH);
        panel.add(ballLabel, BorderLayout.CENTER);
        panel.setBackground(Color.WHITE);
        return panel;
    }

    private static ImageIcon loadIcon(final String filename) {
        URL url = Part3.class.getResource("/lab_8/part_3/images/" + filename + ".png");
        if(url == null)
            throw new RuntimeException("image:" + filename + " not found.");
        ImageIcon icon = new ImageIcon(url);
        icon.setDescription(filename);
        return icon;
    }

    public static void main(String[] args) {
        new Part3("chain of responsibility");

    }

    static class ScorePanel extends JPanel {

        private JLabel scoreLabel;

        public ScorePanel(String title) {
            setLayout(new BorderLayout());
            add(new JLabel(title), BorderLayout.NORTH);
            scoreLabel = new JLabel(Icons.EMPTY);
            add(scoreLabel, BorderLayout.CENTER);
            setBackground(Color.WHITE);
        }

        public JLabel getScoreLabel() {
            return scoreLabel;
        }
    }
}
