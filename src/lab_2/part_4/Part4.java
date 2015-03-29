package lab_2.part_4;

import javax.swing.*;

public class Part4 {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Thread(new AddressGUI("Address Factory")));
    }
}
