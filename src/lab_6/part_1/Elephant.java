package lab_6.part_1;

public class Elephant extends Animal {

	  protected final double feedingRate = 0.05; //kg-animal per kg-food feeding rate

	  public Elephant(int weight) {
	    species = this.getClass().getName();
	    this.weight = weight;
	    this.foodType = "Hay and vegatables";
	  }

	  public void feed() {
	    System.out.println("You are feeding an animal of type " + species);
	    System.out.println("This animal requires " + weight * feedingRate + " kg of " + foodType);
	  }

}