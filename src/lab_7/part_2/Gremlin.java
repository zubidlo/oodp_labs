package lab_7.part_2;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

import static java.lang.System.err;

/**
 * flyweight
 * Created by Martin Zuber on 27/03/2015.
 */
public class Gremlin {

    private static final String imageFilePath = "gremlin.jpg";
    private static ImageIcon image;
    private final String name;

    Gremlin(final String name) {
        this.name = name;
    }

    ImageIcon getImage() {
        if (image == null) {
            URL imgURL = getClass().getResource(imageFilePath);
            if(imgURL != null) image = new ImageIcon(imgURL);
            else err.println("Couldn't find file: " + imageFilePath);
        }
        return image;
    }

    String getName() {
        return name;
    }
}
