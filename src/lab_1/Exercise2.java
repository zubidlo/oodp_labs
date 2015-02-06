package lab_1;
import static utilities.Utils.*;
import static java.lang.System.out;
/**
 * Created by martin on 06/02/2015.
 */
public class Exercise2 {

    public static void main(String[] args) {

        out.println(new Pet());
        out.println(new Pet("Rolf"));
        out.println(new Pet(1));
        Pet dog = new Pet("Rolf", 5.6);
        out.println(dog);
        printClassInfo(dog);
    }
}