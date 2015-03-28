package utilities;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;

import static javax.swing.UIManager.*;

/**
 * JFrame skeleton
 * Created by martin on 28/03/2015.
 */
public class FrameSkeleton extends JFrame {

    private final static List<LookAndFeelInfo> lookAndFeelInfos
            = Arrays.asList(getInstalledLookAndFeels());

    public FrameSkeleton(String title) {
        super(title);
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(themesMenu());
        setJMenuBar(menuBar);
        setSize(400,400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    private JMenu themesMenu() {
        JMenu menuLookAndFeel = new JMenu("Themes");
        for (LookAndFeelInfo info : lookAndFeelInfos) {
            JMenuItem menuItem = new JMenuItem(info.getName());
            menuLookAndFeel.add(menuItem);
            menuItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    LookAndFeelInfo lookAndFeelInfo
                            = lookAndFeelInfos.stream()
                            .filter(i -> i.getName().equals(event.getActionCommand()))
                            .findFirst().orElse(lookAndFeelInfos.get(0));
                    try {
                        UIManager.setLookAndFeel(lookAndFeelInfo.getClassName());
                        SwingUtilities.updateComponentTreeUI(FrameSkeleton.this);
                        //pack();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        return menuLookAndFeel;
    }

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        new FrameSkeleton("skeleton");
    }
}
