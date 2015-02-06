package lab_1;

/**
 * Represents a pet animal
 * Created by martin on 06/02/2015.
 */
class Pet {

    private String name;
    private double age;

    Pet() {}

    //added in exercise 2
    Pet(String name) { this.name = name; }

    //added in exercise 2
    Pet(double age) { this.age = age; }

    //added in exercise 2
    Pet(String name, double age) {

        this.name = name;
        this.age = age;
    }

    String getName() { return name; }

    void setName(String name) { this.name = name; }

    double getAge() { return age; }

    void setAge(double age) { this.age = age; }

    @Override
    public String toString() {

        return "Pet:\n  name:" + getName() + "\n  age:" + getAge() + "\n";
    }
}
