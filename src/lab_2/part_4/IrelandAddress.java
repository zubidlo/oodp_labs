package lab_2.part_4;

import javax.swing.*;

final class IrelandAddress extends Address {

    private final String county;

    /**
     * Creates irish address with given street, town, county.
     * @param street street
     * @param town town
     * @param county county
     */
    IrelandAddress(String street, String town, String county) {

        super(street, town);
        this.county = county;

        JLabel countyL = new JLabel("County");
        JTextField countyTF = new JTextField("");
        countyTF.setText(county);

        add(countyL);
        add(countyTF);
        addButton();
    }

    /**
     * String representation of Ireland address.
     * @return formatted text
     */
    @Override
    public String toString() {

        return String.format("Ireland address:%n  street:%s%n  town:%s%n  county:%s%n%n",
                                street, town, county);
    }
}
