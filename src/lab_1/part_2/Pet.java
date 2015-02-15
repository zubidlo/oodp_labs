package lab_1.part_2;

//Dog in part 3 inherits from this class hence Pet must be public
public class Pet {

    private String name;
    private double age;

    /**
     * Creates a pet.
     */
    public Pet() { name = ""; }

    /**
     * Creates a pet with given name.
     * @param name pet's name
     */
    public Pet(String name) { this.name = name; }

    /**
     * Creates a pet with given age.
     * @param age pet's age
     */
    public Pet(double age) {

        this();
        this.age = age;
    }

    /**
     * Creates a pet with given name and age.
     * @param name pet's name
     * @param age pet's age
     */
    public Pet(String name, double age) {

        this(name);
        this.age = age;
    }

    //getter, setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getAge() { return age; }
    public void setAge(double age) { this.age = age; }

    @Override
    public String toString() {

        return getName() + " is "
                + getAge() + " years old "
                + getClass().getSimpleName() + ".";
    }
}
