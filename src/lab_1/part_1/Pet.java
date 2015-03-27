package lab_1.part_1;

class Pet {

    private String name;
    private double age;

    /**
     * Creates a pet.
     */
    Pet() {

        name = "";
        age = 0;
    }

    //getter, setters
    String getName() { return name; }
    void setName(String name) { this.name = name; }
    double getAge() { return age; }
    void setAge(double age) { this.age = age; }

    @Override
    public String toString() {

        return String.format("%s is %.1f years old %s.",
                getName(), getAge(), getClass().getSimpleName());
    }
}
