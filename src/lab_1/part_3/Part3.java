package lab_1.part_3;

import static java.lang.System.out;
import lab_1.part_2.Pet;
import java.util.*;

/**
 * part 3
 * Created by martin on 06/02/2015.
 */
public class Part3 {

    public static  void main(String[] args) {

        final List<Pet> pets = Arrays.asList(
                new Pet("Gene"),
                new Dog("Arrow", 10.5, "jump", "sleep"),
                new Dog("Will", 0.4, "eat", "bark")
        );

        pets.forEach(out::println);
    }
}
