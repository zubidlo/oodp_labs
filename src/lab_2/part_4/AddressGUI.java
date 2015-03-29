package lab_2.part_4;

import utilities.FrameSkeleton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

final class AddressGUI extends FrameSkeleton implements Runnable, ActionListener {

    private final Vector<Address> addresses;
    private final AddressFactory addressFactory;
    private final JMenuItem UsaAddressMI, IrelandAddressMI, listAddresses;
    private JPanel currentPanel;

    AddressGUI(String title) {

        super(title);
        //addresses
        addresses = new Vector<Address>();
        addressFactory = new AddressFactory();

        //menu
        UsaAddressMI = new JMenuItem("new USA Address");
        IrelandAddressMI = new JMenuItem("new Ireland Address");
        listAddresses = new JMenuItem("List Addresses");
        JMenu menu = new JMenu("Addresses");
        menu.add(UsaAddressMI);
        menu.add(IrelandAddressMI);
        menu.add(listAddresses);
        getJMenuBar().add(menu);
        SwingUtilities.updateComponentTreeUI(this);
    }

    @Override
    public void run() {

        UsaAddressMI.addActionListener(this);
        IrelandAddressMI.addActionListener(this);
        listAddresses.addActionListener(this);

        addresses.add(addressFactory.getAddressByArguments("34 Long st.", "Village", "1232", "New York"));
        addresses.add(addressFactory.getAddressByArguments("300 Short st.", "Finglas", "Dublin"));
        addresses.add(addressFactory.getAddressByArguments("123 Dirty st.", "Big City", "0001", "Washington"));
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String command = e.getActionCommand();

        //show list
        if (command.equals("List Addresses")) {
            setCurrentPanel(getListPanel());
            return;
        }

        //add an address to list and show list
        if (command.equals("Add to list")) {

            //I don't know how many textFields is on the panel at this moment...so vector;
            Vector<String> fieldTexts = new Vector<String>();
            for(Component component : currentPanel.getComponents()) {
                if (component instanceof JTextField) {
                    fieldTexts.add(((JTextField) component).getText());
                }
            }

            //Now I know how many textFields... so to array now
            String[] args = fieldTexts.toArray(new String[fieldTexts.size()]);
            Address address = addressFactory.getAddressByArguments(args);
            addresses.add(address);
            setCurrentPanel(getListPanel());
            return;
        }

        //show new address form
        Address address = addressFactory.getAddressByCommand(command);
        address.getButton().addActionListener(this);
        setCurrentPanel(address);
    }

    private JPanel getListPanel() {

        JPanel panel = new JPanel();
        JTextArea textA = new JTextArea();
        for(Address address : addresses) { textA.append(address.toString()); }
        JScrollPane textScroll = new JScrollPane(textA);
        textScroll.setPreferredSize(new Dimension(200, 300));
        panel.add(textScroll);
        return panel;
    }

    private void setCurrentPanel(JPanel panel) {

        currentPanel = panel;
        getContentPane().removeAll();
        getContentPane().add(panel);
        pack();
    }
}
