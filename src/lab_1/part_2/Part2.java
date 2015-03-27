package lab_1.part_2;
import static java.lang.System.out;
/**
 * part2
 * Created by martin on 06/02/2015.
 */
public class Part2 {

    public static void main(String[] args) {

        out.println(new Pet());
        out.println(new Pet("Rolf"));
        out.println(new Pet(1));
        Pet dog = new Pet("Rolf", 5.6);
        out.println(dog);
        //printClassInfo(dog);
    }
}