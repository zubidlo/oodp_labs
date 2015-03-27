package lab_1.part_4;

import java.util.Arrays;

import static java.lang.System.*;

class Dog extends Pet {

    private String[] listOfTricks;

    /**
     * Creates a dog with given name, age and list of tricks.
     * @param name dog's name
     * @param age dog's age
     * @param listOfTricks list of tricks the dog can do
     */
    Dog(String name, double age, String... listOfTricks) {

        super(name, age);
        this.listOfTricks = listOfTricks;
    }

    //getters, setters
    String[] getListOfTricks() { return listOfTricks; }
    void setListOfTricks(String...listOfTricks) { this.listOfTricks = listOfTricks; }

    @Override
    void feedPet() {

        out.printf("%s %s's favorite food is %s.%n",
                toString(), getName(), getFavoriteFood());
    }

    @Override
    public String toString() {

        return String.format("%s can do these tricks: %s.",
                super.toString(), String.join(", ", Arrays.asList(getListOfTricks())));
    }
}
