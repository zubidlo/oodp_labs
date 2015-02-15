package lab_1.part_4;

class Part4 {

    public static void main(String[] args) {

        Dog ralf = new Dog("Ralf", 4.2, "sleep", "run");
        ralf.setFavoriteFood("pork");

        Dog wildo = new Dog("Wildo", 6.5, "eat", "jump", "spill");
        wildo.setFavoriteFood("chicken");

        Dog arrow = new Dog("Arrow", 2.3);
        arrow.setFavoriteFood("beef");

        Cat mila = new Cat("Mila", 14.3);
        mila.setFavoriteFood("canned meat");

        Cat peach = new Cat("Peach", 1.3);
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
