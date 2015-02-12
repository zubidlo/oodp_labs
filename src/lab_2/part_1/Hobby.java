package lab_2.part_1;

/**
 * Created by martin on 12/02/2015.
 */
public class Hobby {

    private final String hobbyName;

    /**
     * Creates hobby with given hobby name
     * @param hobbyName name of the hobby
     */
    public Hobby(String hobbyName) { this.hobbyName = hobbyName; }

    /**
     * Returns hobby name
     * @return name of this hobby.
     */
    @Override
    public String toString() { return hobbyName; }
}
