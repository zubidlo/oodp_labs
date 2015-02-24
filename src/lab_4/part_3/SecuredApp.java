package lab_4.part_3;

import javax.swing.*;

/**
 * secure gui
 * Created by martin on 24/02/2015.
 */
class SecuredApp extends AppWelcome {

    @Override
    JFrame getGUI(String userType) {

        if(userType.equals("Returning User")) return new LoginFrame();
        if(userType.equals("New User")) return new RegisterFrame();
        throw new RuntimeException("Bad argument!");
    }
}
