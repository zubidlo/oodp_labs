package lab_2.part_4;

/**
 * Created by martin on 14/02/2015.
 */
class AddressFactory {

    /**
     * Creates new Address JPanel based on menu item clicked
     * @param command 'new USA Address' or 'new Ireland Address'
     * @return new Address
     * @throws IllegalArgumentException if command is other then required
     */
    Address getAddressByCommand(String command) throws IllegalArgumentException{

        if(command.equals("new USA Address")) { return new USAAddress("", "", "", ""); }
        if(command.equals("new Ireland Address")) { return new IrelandAddress("", "", ""); }
        throw new IllegalArgumentException("Only 'USA Address' or 'Ireland Address' "
                                            + "command is accepted!");
    }

    /**
     * Creates an address based on length of arguments.
     * @param args agrs[3] = IrelandAddress, agrs[4] = USAAddress
     * @return new Address
     * @throws IllegalArgumentException if length of args is other then required
     */
    Address getAddressByArguments(String...args) throws IllegalArgumentException {

        if(args.length == 3) { return new IrelandAddress(args[0], args[1], args[2]); }
        if(args.length == 4) { return new USAAddress(args[0], args[1], args[2], args[3]); }
        throw new IllegalArgumentException("Address with length of arguments:"
                                            + args.length + " can't be created!");
    }
}
