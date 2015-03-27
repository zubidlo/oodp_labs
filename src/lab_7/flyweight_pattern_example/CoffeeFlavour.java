package lab_7.flyweight_pattern_example;

/**
 * Instances of CoffeeFlavour will be the Flyweights
 * Created by Martin Zuber on 27/03/2015.
 */
public class CoffeeFlavour {

    private final String name;

    CoffeeFlavour(String newFlavor) {
        this.name = newFlavor;
    }

    @Override
    public String toString() {
        return name;
    }
}
