package lab_1.part_3;

import lab_1.part_2.Pet;
import java.util.Arrays;

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

        return String.format("%s can do these tricks: %s.",
                super.toString(), String.join(", ", Arrays.asList(getListOfTricks())));
    }
}
