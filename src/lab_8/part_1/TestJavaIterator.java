package lab_8.part_1;

import java.util.Iterator;
import java.util.Vector;

/**
 * Created by martin on 14/04/2015.
 */
public class TestJavaIterator {

    private static Vector<Animal> animals = new Vector<>();
    public static void main(String[] args) {
        animals.add(new Pig());
        animals.add(new Dog());
        animals.add(new Sheep());
        animals.add(new Sheep());
        animals.add(new Dog());
        animals.add(new Dog());

        Iterator<Animal> animalIterator = animals.iterator();
        while (animalIterator.hasNext())
            System.out.println(animalIterator.next());
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
