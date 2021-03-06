package lab_6.part_1;

public class Giraffe extends Animal {

	  protected final double feedingRate = 0.03; //kg-animal per kg-food feeding rate

	  public Giraffe(int weight) {
	    species = this.getClass().getName();
	    this.weight = weight;
	    this.foodType = "Hay and vegatables";
	  }

	  public void feed() {
	    System.out.println("You are feeding an animal of type " + species);
          System.out.printf("This animal requires %.2f kg of %s%n", weight * feedingRate, foodType);
	  }

	}
