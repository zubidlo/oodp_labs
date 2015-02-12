package lab_2.part_1;
import javax.swing.*;
import java.awt.event.*;
import java.util.Vector;

/**
 * Created by martin on 12/02/2015.
 */
public class Controller implements ActionListener{

    //model
    private final HobbyList model;

    //views
    private final AbstractHobbyView[] views;

    /**
     * Creates hobby list application Controller with given dependencies (Model, Views)
     * Adds itself as listener to all buttons in all views.
     * @param model hobby list model
     * @param views front-end view JFrame windows
     */
    public Controller(HobbyList model, AbstractHobbyView...views) {

        this.model = model;
        this.views = views;

        //iterate over the views and add listener to each button in those and start the views
        for(AbstractHobbyView view : this.views) {
            Vector<JButton> buttons = view.getButtons();
            if (buttons.size() != 0) {
                //add listener to each button
                for(JButton button : buttons) {
                        button.addActionListener(this);
                }
            }
            //start view
            SwingUtilities.invokeLater(new Thread(view));
        }
    }

    /**
     * Invoked when an action occurs.
     * @param e event
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        JButton clickedButton = (JButton) e.getSource();
        AbstractHobbyView clickedView = (AbstractHobbyView) clickedButton.getTopLevelAncestor();
        String newHobbyName = clickedView.textField.getText();

        if(clickedButton.getText().equals("add hobby") && !newHobbyName.equals("")) {
            model.addHobby(new Hobby(newHobbyName));
            clickedView.textField.setText("");
        }
        else if(clickedButton.getText().equals("refresh list")) {
            for(AbstractHobbyView view : views) {
                view.refillViewList(model.getHobbies());
            }
        }
    }
}
