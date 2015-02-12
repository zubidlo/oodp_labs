package lab_2.part_4;

import javax.swing.*;
/**
 * Created by martin on 14/02/2015.
 */
public class Part4 {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Thread(new AddressGUI()));
    }
}
