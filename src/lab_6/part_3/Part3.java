package lab_6.part_3;

import utilities.FrameSkeleton;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * test program
 * Created by Martin Zuber on 12/03/2015.
 */
class Part3 extends FrameSkeleton {

    private MyPanel currentPanel;
    private final static PanelFactory panelFactory = new PanelFactory();

    class MyMenu extends JMenu implements ActionListener {

        private JMenuItem[] menuItems = {
                new JMenuItem("Absolute Value"),
                new JMenuItem("Cube Root"),
                new JMenuItem("Square Root"),
                new JMenuItem("To the power of"),
                new JMenuItem("Round")
        };

        MyMenu() {
            super("Junior Math");
            for(JMenuItem item : menuItems) {
                add(item);
                item.addActionListener(this);
            }
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            currentPanel = panelFactory.getPanel(e.getActionCommand());

            getContentPane().removeAll();
            getContentPane().add(currentPanel);
            revalidate();
        }
    }

    Part3() {
        super("Facade Design Pattern");
        getJMenuBar().add(new MyMenu());
        setSize(300,150);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Part3::new);
    }
}
