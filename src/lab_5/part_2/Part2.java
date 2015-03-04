package lab_5.part_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * main GUI.
 * Created by Martin Zuber on 04/03/2015.
 */
class Part2 {

    private static final String[] decoratorChoices = {
            "blue border decorator",
            "red border decorator",
            "no border decorator"};

    private static LabelWithMouseListener label;
    private static JFrame frame;
    private static JPanel centerPanel;

    public static void main(String[] arg) {

        label = new SimpleLabel();
        frame = new JFrame("Decorator Pattern");
        centerPanel = new JPanel();

        JPanel southPanel = new JPanel();
        JComboBox<String> chooseDecorator = new JComboBox<String>(decoratorChoices);
        chooseDecorator.setSelectedItem(null);
        chooseDecorator.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String selectedDecorator = (String) ((JComboBox<String>) e.getSource()).getSelectedItem();
                centerPanel.remove(label);

                if (selectedDecorator.equals(decoratorChoices[0]))
                    label = new BlueDecorator(new SimpleLabel());
                else if (selectedDecorator.equals(decoratorChoices[1]))
                    label = new RedDecorator(new SimpleLabel());
                else if (selectedDecorator.equals(decoratorChoices[2]))
                    label = new NoBorderDecorator(new SimpleLabel());

                centerPanel.add(label);
                frame.validate();
            }
        });

        centerPanel.add(label);
        southPanel.add(chooseDecorator);
        frame.getContentPane().add(centerPanel, BorderLayout.CENTER);
        frame.getContentPane().add(southPanel, BorderLayout.SOUTH);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.requestFocus();
        frame.setVisible(true);
    }
}
