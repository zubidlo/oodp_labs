package lab_5.part_1;

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

/**
 * Created by lecturer, by Martin Zuber.
 */
class PlotDialog extends Dialog implements ActionListener {

    private Button okButton;
    private MultiChoice multiChoice;

    PlotDialog(Frame frame, MultiChoice multiChoice) {

        super(frame, "Plotting:", true);
        this.multiChoice = multiChoice;
        okButton = new Button("okButton");
        Panel panel = new Panel();
        panel.add(okButton);
        String title = "";

        for (String item : Arrays.asList(multiChoice.getSelected()))
            title += item + ", ";

        if (title.length() > 2) title = title.substring(0, title.length() - 2);
        add(new Label(title), BorderLayout.CENTER);
        add(panel, BorderLayout.SOUTH);
        okButton.addActionListener(this);
        setBounds(100, 100, title.length() * 7, 200);
    }

    @Override
    public void actionPerformed(ActionEvent ev) {

        multiChoice.clearAll();
        dispose();
    }
}
