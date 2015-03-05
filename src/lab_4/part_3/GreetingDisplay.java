package lab_4.part_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * greeting display app
 * Created by martin on 24/02/2015.
 */
class GreetingDisplay extends JFrame {

    static JComboBox<String> userTypeC;

    public static void main(String[] args) {

        GreetingDisplayListener listener = new GreetingDisplayListener();

        String[] comboBoxSelection = {"Returning User", "New User"};
        userTypeC = new JComboBox<String>(comboBoxSelection);
        userTypeC.addActionListener(listener);

        JFrame frame = new JFrame();
        frame.getContentPane().add(userTypeC, BorderLayout.SOUTH);
        frame.setSize(200, 100);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        frame.getContentPane().requestFocus();
    }
}

class GreetingDisplayListener implements ActionListener {

    static SecuredApp securedApp = new SecuredApp();

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == GreetingDisplay.userTypeC) {
            securedApp.getGUI((String) GreetingDisplay.userTypeC.getSelectedItem());
        }
    }
}
