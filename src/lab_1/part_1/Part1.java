package lab_1.part_1;

import static java.lang.System.out;

/**
 * main
 * Created by martin on 15/02/2015.
 */
public class Part1 {

    public static void main(String[] args) {

        Pet dog =  new Pet();
        dog.setName("Rolf");
        dog.setAge(10);

        out.println(dog);
        //printClassInfo(dog);
    }
}
