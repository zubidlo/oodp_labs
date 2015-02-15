package lab_1.part_3;

import lab_1.part_2.Pet;

class Dog extends Pet {

    private String[] listOfTricks;

    /**
     * Creates a dog with given name, age and list of tricks.
     * @param name dog's name
     * @param age dog's age
     * @param listOfTricks list of tricks the dog can do
     */
    Dog(String name, double age, String...listOfTricks) {

        super(name, age);
        this.listOfTricks = listOfTricks;
    }

    //getters, setters
    String[] getListOfTricks() { return listOfTricks; }
    void setListOfTricks(String...listOfTricks) { this.listOfTricks = listOfTricks; }

    @Override
    public String toString() {

        String message = super.toString();
        String[] tricks = getListOfTricks();

        if( tricks.length > 0) {
            message += " " + getName() + " can do these tricks:[";
            for (String trick : getListOfTricks()) { message += " " + trick; }
            message += " ].";
        }

        return message;
    }
}
