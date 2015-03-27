package lab_7.flyweight_pattern_example;

/**
 * order
 * Created by Martin Zuber on 27/03/2015.
 */
public class Order {

    private final int tableNumber;
    private final CoffeeFlavour flavour;

    Order(int tableNumber, CoffeeFlavour flavor) {
        this.tableNumber = tableNumber;
        this.flavour = flavor;
    }

    void serve() {
        System.out.println("Serving " + flavour + " to table " + tableNumber);
    }
}
