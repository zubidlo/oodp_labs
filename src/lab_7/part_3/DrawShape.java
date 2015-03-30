package lab_7.part_3;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * execute commands with undo
 * Created by martin on 29/03/2015.
 */
public class DrawShape {

    private final List<Command> history;
    private final DrawShapeGUI gui;

    public DrawShape(final DrawShapeGUI gui) {
        history = new ArrayList<>();
        this.gui = gui;
    }

    public void storeAndExecute(Command command) {
        history.add(command);
        execute(command);
    }

    public void undo() {
        if(history.size() > 1) {
            history.remove(history.size() - 1);
            execute(history.get(history.size() - 1));
        } else System.out.println("history of commands is empty");
    }

    private void execute(Command command) {
        gui.getContentPane().remove(gui.getCanvas());
        gui.setCanvas(command.execute());
        gui.getContentPane().add(gui.getCanvas(), BorderLayout.CENTER);
        gui.getCanvas().repaint();
        SwingUtilities.updateComponentTreeUI(gui);
    }
}
