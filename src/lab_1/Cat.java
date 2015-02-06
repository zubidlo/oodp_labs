package lab_1;

import static java.lang.System.out;

/**
 * Added in exercise 4
 * Created by martin on 06/02/2015.
 */
public class Cat extends Pet {

    //added for exercise 4
//    @Override
//    public void feedPet() { out.println(toString() + "was fed with " + favoriteFood + ".\n"); }

    @Override
    public String toString() {

        return "Cat:\n  name:" + getName() + "\n  age:" + getAge() + "\n";
    }
}