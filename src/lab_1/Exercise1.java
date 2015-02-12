package lab_1;

import static utilities.Utils.*;
import static java.lang.System.out;

/**
 * Created by martin on 06/02/2015.
 */
public class Exercise1 {

    public static void main(String[] args) {

        Pet dog =  new Pet();
        dog.setName("Rolf");
        dog.setAge(10);

        out.println(dog);
        //printClassInfo(dog);
    }

}


