package lab_5.part_2;

import utilities.FrameSkeleton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * main GUI.
 * Created by Martin Zuber on 04/03/2015.
 */
class Part2 extends FrameSkeleton {

    private static final String[] decoratorChoices = {
            "blue border decorator",
            "red border decorator",
            "no border decorator"};

    private static LabelWithMouseListener label;
    private static JPanel centerPanel;

    private Part2(String title) {
        super(title);
        label = new SimpleLabel();
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
                validate();
            }
        });

        centerPanel.add(label);
        southPanel.add(chooseDecorator);
        getContentPane().add(centerPanel, BorderLayout.CENTER);
        getContentPane().add(southPanel, BorderLayout.SOUTH);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        pack();
    }

    public static void main(String[] arg) {

        Part2 part2 = new Part2("Decorator pattern");
    }
}
