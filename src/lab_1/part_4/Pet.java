package lab_1.part_4;

import static java.lang.System.out;

class Pet {

    private String name, favoriteFood;
    private double age;

    /**
     * Creates a pet
     */
    Pet() { name = ""; }

    /**
     * Creates a pet with given name
     * @param name name of the pet
     */
    Pet(String name) { this.name = name; }

    /**
     * Creates a pet with given age
     * @param age age of the pet
     */
    Pet(double age) {

        this();
        this.age = age;
    }

    /**
     * Creates a pet with given name and age.
     * @param name name of the pet
     * @param age age of the pet
     */
    Pet(String name, double age) {

        this(name);
        this.age = age;
    }

    //getter, setters
    String getName() { return name; }
    void setName(String name) { this.name = name; }
    double getAge() { return age; }
    void setAge(double age) { this.age = age; }
    String getFavoriteFood() { return favoriteFood; }
    void setFavoriteFood(String favoriteFood) { this.favoriteFood = favoriteFood; }

    void feedPet() {

        out.printf("%s %s's favorite food is %s.%n",
                toString(), getName(), getFavoriteFood());
    }

    @Override
    public String toString() {

        return getName() + " is "
                + getAge() + " years old "
                + getClass().getSimpleName() + ".";
    }
}
