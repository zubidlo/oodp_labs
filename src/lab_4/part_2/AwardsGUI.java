package lab_4.part_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * gui app
 * Created by martin on 24/02/2015.
 */
public class AwardsGUI {

    static JLabel textL, prizeL;
    static JComboBox<String> awardBodyC, positionC;

    public static void main(String[] args) {

        textL = new JLabel();
        prizeL = new JLabel();
        AwardGUIListener listener = new AwardGUIListener();

        String[] selection1 = {"Athletics", "HorseShow"};
        awardBodyC = new JComboBox<String>(selection1);
        awardBodyC.addActionListener(listener);

        String[] selection = {"First", "Second", "Third"};
        positionC = new JComboBox<String>(selection);
        positionC.addActionListener(listener);

        setLabels(0, 0);

        JPanel southPanel = new JPanel();
        southPanel.setBackground(Color.WHITE);
        southPanel.add(awardBodyC, BorderLayout.WEST);
        southPanel.add(positionC, BorderLayout.EAST);

        JFrame frame = new JFrame();
        frame.getContentPane().setBackground(Color.WHITE);
        frame.getContentPane().add(textL, BorderLayout.NORTH);
        frame.getContentPane().add(prizeL, BorderLayout.CENTER);
        frame.getContentPane().add(southPanel, BorderLayout.SOUTH);
        frame.setSize(230, 230);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        frame.getContentPane().requestFocus();
    }

    static void setLabels(int awardBodyChoosen, int positionChoosen) {

        AwardingBody awardBody = awardBodyChoosen == 0 ?
                new AthleticsAwardingBody() : new HorseShowAwardingBody();

        Prize prize = awardBody.getPrize(positionChoosen);

        AwardsGUI.textL.setText(awardBody.congrats());
        AwardsGUI.prizeL.setIcon(prize.getIcon());
    }
}

class AwardGUIListener implements ActionListener {

    private int awardBodyChoosen;
    private int positionChoosen;

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == AwardsGUI.awardBodyC) {

            awardBodyChoosen = AwardsGUI.awardBodyC.getSelectedIndex();
        }
        else if(e.getSource() == AwardsGUI.positionC) {

            positionChoosen = AwardsGUI.positionC.getSelectedIndex();
        }
        AwardsGUI.setLabels(awardBodyChoosen, positionChoosen);
    }
}
