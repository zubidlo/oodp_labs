package lab_6.part_1;

public class Tiger extends Animal {

  protected final double feedingRate = 0.15; //kg-animal per kg-food feeding rate

  public Tiger(int weight) {
    species = this.getClass().getName();
    this.weight = weight;
    this.foodType = "Meat chunks";
  }


  public void feed() {
      System.out.println("You are feeding an animal of type " + species);
      System.out.printf("This animal requires %.2f kg of %s%n", weight * feedingRate, foodType);
  }
}
