package lab_1;
import static utilities.Utils.*;
/**
 * Created by martin on 06/02/2015.
 */
public class Exercise2 {

    public static void main(String[] args) {

        Pet dog = new Exercise2().new Pet();
        printClassInfo(dog);
    }
    private class Pet {

        private String name;
        private double age;

        Pet() {}

        Pet(String name) {

            this.name = name;
        }

        Pet(String name, double age) {

            this.name = name;
            this.age = age;
        }

        String getName() {
            return name;
        }

        void setName(String name) {
            this.name = name;
        }

        double getAge() {
            return age;
        }

        void setAge(double age) {
            this.age = age;
        }
    }
}