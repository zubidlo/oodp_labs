package lab_6.part_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static lab_6.part_3.JuniorMathFacade.*;

/**
 * panel factory
 * Created by Martin Zuber on 12/03/2015.
 */
class PanelFactory {

    MyPanel getPanel(String actionCommand) {
        return new MyPanel(actionCommand);
    }
}

class MyPanel extends JPanel implements ActionListener {

    private JLabel infoL, resultL;
    private JTextField numXF, numYF;
    private String actionCommand;

    MyPanel(String actionCommand) {

        this.actionCommand = actionCommand;
        setLayout(new FlowLayout());
        infoL = new JLabel(actionCommand);
        add(infoL);
        numXF = new JTextField("0", 5);
        numXF.addActionListener(this);
        add(numXF);

        resultL = new JLabel("result: " + 0);

        if(actionCommand.equals("To the power of")) {
            numYF = new JTextField("0", 5);
            numYF.addActionListener(this);
            add(numYF);
        }
        add(resultL);
    }

    private void popUpError() {
        JOptionPane.showMessageDialog(null,
                "Error: That's not a number", "Error Massage",
                JOptionPane.ERROR_MESSAGE);
    }

    private String formatResult(double result) {
        return String.format("result: %.2f", result);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            double x = Double.valueOf(numXF.getText());
            switch (actionCommand) {
                case "Absolute Value":
                    resultL.setText(formatResult(absoluteValue((int) x)));
                    break;
                case "Cube Root":
                    resultL.setText(formatResult(cubeRoot(x)));
                    break;
                case "Square Root":
                    resultL.setText(formatResult(squareRoot(x)));
                    break;
                case "To the power of":
                    double y = Double.valueOf(numYF.getText());
                    resultL.setText(formatResult(xToThePowerOfy(x, y)));
                    break;
                case "Round":
                    resultL.setText(formatResult(roundDoubleToInteger(x)));
                    break;
            }
        }
        catch(NumberFormatException nfe) {
            popUpError();
        }
    }
}
