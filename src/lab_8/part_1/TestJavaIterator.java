package lab_8.part_1;

import java.util.*;
import static java.lang.System.*;

/**
 * Created by martin on 14/04/2015.
 */
public class TestJavaIterator {

    public static void main(String[] args) {
        Vector<Animal> animals = new Vector<>();
        animals.add(new Pig());
        animals.add(new Dog());
        animals.add(new Sheep());
        animals.add(new Sheep());
        animals.add(new Dog());
        animals.add(new Dog());

        out.println("\nVector.iterator test:");
        Iterator<Animal> animalIterator = animals.iterator();
        while (animalIterator.hasNext()) out.println(animalIterator.next());

        out.println("\nMyIterator test:");
        Iterator<Animal> myAnimalIterator = new MyIterator<>(animals);
        while (myAnimalIterator.hasNext()) out.println(myAnimalIterator.next());
    }
}

abstract class Animal {

}

class Pig extends Animal {

    @Override
    public String toString() {
        return "This is the pig. Hashcode:" + hashCode();
    }
}

class Dog extends Animal {

    @Override
    public String toString() {
        return "This is the dog. Hashcode:" + hashCode();
    }
}

class Sheep extends Animal {

    @Override
    public String toString() {
        return "This is the sheep. Hashcode:" + hashCode();
    }
}
