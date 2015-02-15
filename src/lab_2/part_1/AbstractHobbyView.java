package lab_2.part_1;

import javax.swing.*;
import java.awt.*;
import java.util.*;

abstract class AbstractHobbyView extends JFrame
        implements Runnable {

    //canvas
    protected final JPanel canvas;

    //array of buttons in this frame
    protected final Vector<JButton> buttons;

    //shared components
    protected final JTextField textField;
    protected final JButton refreshButton, addButton;

    /**
     * Creates JFrame with given title
     * @param title title of the frame
     */
    AbstractHobbyView(String title) {

        //create frame components
        canvas = new JPanel(new BorderLayout());
        textField = new JTextField("", 20);
        buttons = new Vector<JButton>();
        refreshButton = new JButton("refresh list");
        addButton = new JButton("add hobby");

        //buttons we want listen to
        buttons.add(refreshButton);
        buttons.add(addButton);

        //initialize JFrame
        setTitle(title);
        canvas.add(refreshButton, BorderLayout.EAST);
        canvas.add(textField, BorderLayout.WEST);
        canvas.add(addButton, BorderLayout.CENTER);
        getContentPane().add(canvas);
        canvas.requestFocusInWindow();
        pack();
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(true);
        setVisible(true);
    }

    /**
     * Returns the array of buttons for listener attachment.
     * @return list of buttons etc for which a listener is needed
     */
    Vector<JButton> getButtons() { return buttons; }

    /**
     * Modifies current view list of hobbies and validates the components, so changes are visible.
     * @param hobbies hobbies to refill list with
     */
    abstract void refillViewList(Vector<Hobby> hobbies);

    @Override
    public void run() {}
}
