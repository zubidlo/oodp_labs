package lab_1;

import static utilities.Utils.*;

/**
 * Created by martin on 06/02/2015.
 */
public class Exercise1 {

    public static void main(String[] args) {

        Pet dog = new Pet();
        dog.setName("Rolf");
        dog.setAge(10);

        printClassInfo(dog);
    }
}

class Pet {

    private String name;
    private double age;

    public Pet() {

        name = "";
        age = 0;
    }

    public Pet(String name, double age) {

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }
}
