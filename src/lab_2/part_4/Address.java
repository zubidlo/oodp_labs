package lab_2.part_4;

import javax.swing.*;

class Address extends JPanel{

    protected String street, town;
    private final JTextField streetTF, townTF;
    private JButton addB;

    private Address() {

        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));

        JLabel streetL = new JLabel("Street");
        streetTF = new JTextField("", 20);
        add(streetL);
        add(streetTF);

        JLabel townL = new JLabel("Town");
        townTF = new JTextField("");
        add(townL);
        add(townTF);

    }

    /**
     * Creates address with street and town.
     * Can be called by descendant class only.
     * @param street street
     * @param town town
     */
    Address(String street, String town) {

        this();
        this.street = street;
        streetTF.setText(street);

        this.town = town;
        townTF.setText(town);
    }

    /**
     * Adds 'Add to list' button to panel
     */
    void addButton() {

        addB = new JButton("Add to list");
        add(addB);
    }

    /**
     * Returns 'Add to list' button.
     * @return reference to 'Add to list' button
     */
    JButton getButton() { return addB; }
}
