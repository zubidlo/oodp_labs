package lab_2.part_1;

class Hobby {

    private final String hobbyName;

    /**
     * Creates hobby with given hobby name.
     * @param hobbyName name of the hobby
     */
    Hobby(String hobbyName) { this.hobbyName = hobbyName; }

    /**
     * Returns hobby name.
     * @return name of this hobby.
     */
    @Override
    public String toString() { return hobbyName; }
}
