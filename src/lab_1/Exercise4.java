package lab_1;

/**
 * Created by martin on 06/02/2015.
 */
public class Exercise4 {

    public static void main(String[] args) {

        Dog ralf = new Dog("Ralf", 4.2);
        ralf.setListOfTricks("sleep", "run");
        ralf.setFavoriteFood("pork");

        Dog wildo = new Dog("Wildo", 6.5, "eat", "jump", "spill");
        wildo.setFavoriteFood("chicken");

        Dog arrow = new Dog("Arrow", 2.3);
        arrow.setFavoriteFood("beef");

        Cat mila = new Cat();
        mila.setName("Mila");
        mila.setFavoriteFood("canned meat");

        Cat peach = new Cat();
        peach.setName("Peach");
        peach.setFavoriteFood("birds");

        Pet[] pets = new Pet[5];
        pets[0] = ralf;
        pets[1] = wildo;
        pets[2] = arrow;
        pets[3] = mila;
        pets[4] = peach;

        for(Pet pet : pets) { pet.feedPet(); }
    }
}
