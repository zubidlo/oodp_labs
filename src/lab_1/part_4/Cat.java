package lab_1.part_4;

import static java.lang.System.out;

class Cat extends Pet {

    /**
     * Creates a cat with given name and age.
     * @param name cat's name
     * @param age cat's age
     */
    Cat(String name, double age) { super(name, age); }

    @Override
    void feedPet() {

        out.printf("%s %s's favorite food is %s.%n",
                toString(), getName(), getFavoriteFood());
    }
}