package lab_1;

import static java.lang.System.out;

/**
 * Added in exercise 3 and modified in exercises 4
 * Created by martin on 06/02/2015.
 */
public class Dog extends Pet {

    private String[] listOfTricks;

    /**
     * Creates a dog with given name, age and list of tricks
     * @param name name of the dog
     * @param age age of the dog
     * @param listOfTricks list of tricks the dog can do
     */
    public Dog(String name, double age, String...listOfTricks) {

        super(name, age);
        this.listOfTricks = listOfTricks;
    }

    public String[] getListOfTricks() { return listOfTricks; }

    public void setListOfTricks(String...listOfTricks) { this.listOfTricks = listOfTricks; }

    @Override
    public String toString() {

        String message = "Dog:\n  name:" + getName() + "\n  age:" + getAge() + "\n";
        message += "  tricks:";
        for (String trick : getListOfTricks()) {
            message += " " + trick;
        }
        return message + "\n";
    }

    //added for exercise 4
    @Override
    public void feedPet() { out.println(toString() + "was fed with " + favoriteFood + ".\n"); }
}
