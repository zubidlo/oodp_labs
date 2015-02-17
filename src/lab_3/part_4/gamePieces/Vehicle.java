package lab_3.part_4.gamePieces;

import static java.lang.System.*;
import javax.swing.*;
import java.net.*;

public abstract class Vehicle {

    /**
     * Returns this piece image.
     * @return image icon
     */
	public abstract ImageIcon getImage();

    /**
     * Creates new Icon from resource on given path.
     * @param path relative path from this class directory.
     * @return new ImageIcon or null.
     */
    ImageIcon createIcon(String path) {

        URL imgURL = getClass().getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            err.println("Couldn't find file: " + path);
            return null;
        }
    }
}
