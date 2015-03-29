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
    private final String name;
    private static ImageIcon image;

    Gremlin(String name) {
        this.name = name;
    }

    public ImageIcon getImage() {
        if (image == null) {
            URL imgURL = getClass().getResource(imageFilePath);
            if(imgURL != null) image = new ImageIcon(imgURL);
            else err.println("Couldn't find file: " + imageFilePath);
        }
        return image;
    }

    public String getName() {
        return name;
    }
}
