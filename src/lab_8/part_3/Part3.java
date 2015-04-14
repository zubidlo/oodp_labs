package lab_8.part_3;

import utilities.FrameSkeleton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.*;
import java.util.List;

/**
 * Created by martin on 14/04/2015.
 */
public class Part3 extends FrameSkeleton {

    private static final Chain chain = new Soccer(new Basketball(new Rugby(new Unknown(null))));
    private static final JComboBox<String> comboBox = new JComboBox(new String[]{"ball 1", "ball 2", "ball 3", "ball 4"});
    public static final List<ImageIcon> icons = new ArrayList<>();
    static {
        Arrays.asList("soccer", "basketball", "rugby", "unknown", "empty")
                .forEach(f -> icons.add(loadIcon(f)));
    }
    private static JLabel ballLabel = new JLabel(icons.get(4));
    private static final JPanel decisionPanel = buildDecisionPanel();
    public static final ScorePanel soccerScorePanel = new ScorePanel("Soccer Score!");
    public static final ScorePanel basketballScorePanel = new ScorePanel("Basketball Score!");
    public static final ScorePanel rugbyScorePanel = new ScorePanel("Rugby Score!");
    public static final ScorePanel unrecognizedScorePanel = new ScorePanel("Unrecognized Score!");

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
        comboBox.addActionListener(this::consumeEvent);
    }

    private void consumeEvent(ActionEvent e) {
        JComboBox<String> box;
        if(e.getSource() instanceof JComboBox) {
            box = (JComboBox) e.getSource();
            ImageIcon icon = icons.get(box.getSelectedIndex());
            ballLabel.setIcon(icon);
            pack();
            chain.sendToChain(icon);
        }
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
            scoreLabel = new JLabel(icons.get(4));
            add(scoreLabel, BorderLayout.CENTER);
            setBackground(Color.WHITE);
        }

        public JLabel getScoreLabel() {
            return scoreLabel;
        }
    }
}
