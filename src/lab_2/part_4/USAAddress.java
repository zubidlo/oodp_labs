package lab_2.part_4;

import javax.swing.*;

final class USAAddress extends Address {

    private final String zipCode, state;

    /**
     * Creates USA address with given street, town, zip code and state.
     * @param street street
     * @param town town
     * @param zipCode zip code
     * @param state state
     */
    USAAddress(String street, String town, String zipCode, String state) {

        super(street, town);
        this.zipCode = zipCode;
        this.state = state;

        JLabel zipCodeL = new JLabel("Zip Code");
        JTextField zipCodeTF = new JTextField("");
        JLabel stateL = new JLabel("State");
        JTextField stateTF = new JTextField("");
        zipCodeTF.setText(zipCode);
        stateTF.setText(state);

        add(zipCodeL);
        add(zipCodeTF);
        add(stateL);
        add(stateTF);
        addButton();
    }

    /**
     * String representation of Usa address.
     * @return formatted text
     */
    @Override
    public String toString() {

        return String.format("USA address:%n  street:%s%n  town:%s%n  zip code:%s%n  state:%s%n%n",
                            street, town, zipCode, state);
    }
}
