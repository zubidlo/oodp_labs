package lab_4.part_2;

import javax.swing.*;
import java.net.URL;
import static java.lang.System.*;

/**
 * Abstract prize
 */
abstract class Prize extends ImageIcon{

    private Icon icon;

    protected Icon getIcon() {
        return icon;
    }
    /**
     * creates icon or null with error message to console
     * @param path relative path to icon
     * @return icon
     */
    protected void makeIcon(String path) {

        URL imgURL = getClass().getResource(path);
        if (imgURL != null) icon = new ImageIcon(imgURL);
        else err.println("Couldn't find file: " + path);
    }
}
