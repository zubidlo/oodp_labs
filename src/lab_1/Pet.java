package lab_1;

import static java.lang.System.out;

/**
 * Represents a pet animal.
 * Created in exercise 1 and modified in exercise 2
 * Created by martin on 06/02/2015.
 */
public class Pet {

    private String name;
    private double age;

    /**
     * Creates a pet
     */
    public Pet() {}

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public double getAge() { return age; }

    public void setAge(double age) { this.age = age; }

    @Override
    public String toString() {

        return "Pet:\n  name:" + getName() + "\n  age:" + getAge() + "\n";
    }

    //added for exercise 2
    /**
     * Creates a pet with given name
     * @param name name of the pet
     */
    public Pet(String name) { this.name = name; }

    //added for exercise 2
    /**
     * Creates a pet with given age
     * @param age age of the pet
     */
    public Pet(double age) { this.age = age; }

    //added for exercise 2
    /**
     * Cretes a pet with given name and age
     * @param name name of the pet
     * @param age age of the pet
     */
    public Pet(String name, double age) {

        this.name = name;
        this.age = age;
    }

    //added for exercise 4
    protected String favoriteFood;

    //added for exercise 4
    public void feedPet() { out.println(toString() + "was fed with " + favoriteFood + ".\n"); }

    //added for exercise 4
    public String getFavoriteFood() { return favoriteFood; }

    //added for exercise 4
    public void setFavoriteFood(String favoriteFood) { this.favoriteFood = favoriteFood; }
}
