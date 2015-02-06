package lab_1;

/**
 * Represents a pet animal
 * Created by martin on 06/02/2015.
 */
public class Pet {

    private String name;
    private double age;

    public Pet() {}

    //added in exercise 2
    public Pet(String name) { this.name = name; }

    //added in exercise 2
    public Pet(double age) { this.age = age; }

    //added in exercise 2
    public Pet(String name, double age) {

        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public double getAge() { return age; }

    public void setAge(double age) { this.age = age; }

    @Override
    public String toString() {

        return "Pet:\n  name:" + getName() + "\n  age:" + getAge() + "\n";
    }
}
