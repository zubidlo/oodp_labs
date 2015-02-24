package lab_4.part_3;

import javax.swing.*;
import java.awt.*;

/**
 * Created by martin on 24/02/2015.
 */
class RegisterFrame extends JFrame {

    RegisterFrame() {

        super("Welcome");

        JLabel nameL = new JLabel("Name:");
        JLabel address1L = new JLabel("Address 1:");
        JLabel address2L = new JLabel("Address 2:");
        JLabel emailL = new JLabel("Email:");
        JTextField nameF = new JTextField();
        JTextField address1F = new JTextField();
        JTextField address2F = new JTextField();
        JTextField emailF = new JTextField();
        JButton okB = new JButton("OK");

        JPanel centerP = new JPanel(new GridLayout(4,4));
        centerP.setBackground(Color.WHITE);
        centerP.add(nameL);
        centerP.add(nameF);
        centerP.add(address1L);
        centerP.add(address1F);
        centerP.add(address2L);
        centerP.add(address2F);
        centerP.add(emailL);
        centerP.add(emailF);

        JPanel southP = new JPanel();
        southP.setBackground(Color.WHITE);
        southP.add(okB);

        getContentPane().add(centerP, BorderLayout.CENTER);
        getContentPane().add(southP, BorderLayout.SOUTH);

        setSize(250, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        getContentPane().requestFocus();
    }
}
