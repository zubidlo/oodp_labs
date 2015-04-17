package lab_2.part_1;
import java.util.*;

class HobbyList {

    private final Vector<Hobby> hobbies;

    /**
     * Creates hobby list with default hobbies in it.
     */
    HobbyList() {

        hobbies = new Vector<>();
        addHobby(new Hobby("hobby1"));
        addHobby(new Hobby("hobby2"));
        addHobby(new Hobby("hobby3"));
        addHobby(new Hobby("hobby4"));
        addHobby(new Hobby("hobby5"));
        addHobby(new Hobby("hobby6"));
        addHobby(new Hobby("hobby7"));
        addHobby(new Hobby("hobby8"));
        addHobby(new Hobby("hobby9"));
        addHobby(new Hobby("hobby10"));
    }

    /**
     * Adds a hobby to hobby list.
     * @param hobby Hobby to add
     */
    void addHobby(Hobby hobby) { hobbies.add(hobby); }

    /**
     * Returns hobbies.
     * @return list of hobbies
     */
    Vector<Hobby> getHobbies() { return hobbies; }

    /**
     * String representation of hobby list.
     * @return hobbies in the list
     */
    @Override
    public String toString() { return hobbies.toString(); }
}
