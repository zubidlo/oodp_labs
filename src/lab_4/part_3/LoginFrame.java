package lab_4.part_3;

import javax.swing.*;
import java.awt.*;

/**
 * Created by martin on 24/02/2015.
 */
class LoginFrame extends JFrame {

    LoginFrame() {

        super("Welcome back");

        JLabel usernameL = new JLabel("Username:");
        JLabel passwordL = new JLabel("Password:");
        JTextField usernameF = new JTextField();
        JPasswordField passwordF = new JPasswordField();
        JButton okB = new JButton("OK");

        JPanel centerP = new JPanel(new GridLayout(2,2));
        centerP.setBackground(Color.WHITE);
        centerP.add(usernameL);
        centerP.add(usernameF);
        centerP.add(passwordL);
        centerP.add(passwordF);

        JPanel southP = new JPanel();
        southP.setBackground(Color.WHITE);
        southP.add(okB);

        getContentPane().add(centerP, BorderLayout.CENTER);
        getContentPane().add(southP, BorderLayout.SOUTH);

        setSize(250, 120);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        getContentPane().requestFocus();
    }
}
