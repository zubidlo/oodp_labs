package lab_1;
import static java.lang.System.out;
import static utilities.Utils.printClassInfo;

/**
 * Created by martin on 06/02/2015.
 */
public class Exercise3 {

    public static  void main(String[] args) {

        Pet[] pets = {
                new Pet(),
                new Dog("Arrow", 10.5, "jump", "sleep"),
                new Dog("Will", 0.4, "eat", "bark")
        };

        for(Pet pet : pets) {
            out.println(pet);
            printClassInfo(pet);
        }
    }
}
