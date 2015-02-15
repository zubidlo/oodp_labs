package lab_1.part_3;

import static java.lang.System.out;
import lab_1.part_2.Pet;
/**
 * Created by martin on 06/02/2015.
 */
public class Part3 {

    public static  void main(String[] args) {

        Pet[] pets = {
                new Pet("Gene"),
                new Dog("Arrow", 10.5, "jump", "sleep"),
                new Dog("Will", 0.4, "eat", "bark")
        };

        for(Pet pet : pets) {
            out.println(pet);
            //printClassInfo(pet);
        }
    }
}
