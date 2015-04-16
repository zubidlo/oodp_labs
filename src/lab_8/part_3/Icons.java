package lab_8.part_3;

import javax.swing.*;
import java.net.URL;

/**
 * enum Icons
 * Created by martin on 16/04/2015.
 */
public class Icons {

    public static ImageIcon SOCCER = loadImage("soccer");
    public static ImageIcon BASKETBALL = loadImage("basketball");
    public static ImageIcon RUGBY = loadImage("rugby");
    public static ImageIcon UNKNOWN = loadImage("unknown");
    public static ImageIcon EMPTY = loadImage("empty");

    private static ImageIcon loadImage(String filename) {
        URL url = Icons.class.getResource("/lab_8/part_3/images/" + filename + ".png");
        if(url == null)
            throw new RuntimeException("image:" + filename + " not found.");
        ImageIcon icon = new ImageIcon(url);
        icon.setDescription(filename);
        return icon;
    }
}
