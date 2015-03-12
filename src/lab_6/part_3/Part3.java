package lab_6.part_3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * test program
 * Created by Martin Zuber on 12/03/2015.
 */
class Part3 extends JFrame{

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
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(new MyMenu());
        setJMenuBar(menuBar);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(400, 200);
        requestFocus();
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Part3();
            }
        });
    }
}
