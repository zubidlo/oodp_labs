package lab_7.part_2;

import utilities.FrameSkeleton;
import utilities.Utils;

import javax.swing.*;
import java.awt.*;

/**
 * gremlin gui
 * Created by Martin Zuber on 27/03/2015.
 */
public class GremlinGUI extends FrameSkeleton {

    private JPanel jPanelCentre;

    private GremlinGUI() {
        super("Gremlins");
        JLabel jLabelGremlinName = new JLabel("new Gremlin name:");
        JTextField jTextFieldGremlinName = new JTextField("", 10);
        JButton jButtonGremlinName = new JButton("OK");
        jButtonGremlinName.addActionListener(e -> addNewGremlinToGrid(jTextFieldGremlinName.getText()));
        jPanelCentre = new JPanel(new FlowLayout());
        twentyGremlinsToPanel();
        JScrollPane jScrollPane = new JScrollPane(jPanelCentre);
        JPanel jPanelSouth = new JPanel(new FlowLayout(FlowLayout.CENTER));
        jPanelSouth.add(jLabelGremlinName);
        jPanelSouth.add(jTextFieldGremlinName);
        jPanelSouth.add(jButtonGremlinName);
        getContentPane().add(jScrollPane, BorderLayout.CENTER);
        getContentPane().add(jPanelSouth, BorderLayout.SOUTH);
        setSize(800, 220);
        setResizable(false);
    }

    private void addNewGremlinToGrid(String name) {
        GremlinPanel gremlinPanel = GremlinPanel.makeNewGremlin(name);
        jPanelCentre.add(gremlinPanel);
        System.out.print("added: " + gremlinPanel);
        revalidate();
    }

    private void twentyGremlinsToPanel() {
        for(int i = 0; i < 20; i++) {
            String randomName = String.valueOf(Character.toChars(Utils.rand(25) + 65));
            for (int j = 0; j < 7; j++)
                randomName += String.valueOf(Character.toChars(Utils.rand(25) + 97));
            jPanelCentre.add(GremlinPanel.makeNewGremlin(randomName));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GremlinGUI::new);
    }
}
