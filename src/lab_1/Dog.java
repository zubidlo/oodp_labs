package lab_1;

/**
 * Created by martin on 06/02/2015.
 */
public class Dog extends Pet {

    private String[] listOfTricks;

    public Dog(String name, double age, String...listOfTricks) {

        super(name, age);

        this.listOfTricks = listOfTricks;
    }

    public String[] getListOfTricks() { return listOfTricks; }

    public void setListOfTricks(String[] listOfTricks) { this.listOfTricks = listOfTricks; }

    @Override
    public String toString() {

        String message = "Dog:\n  name:" + getName() + "\n  age:" + getAge() + "\n";
        message += "  tricks:";
        for (String trick : getListOfTricks()) {
            message += " " + trick;
        }
        return message + "\n";
    }
}
