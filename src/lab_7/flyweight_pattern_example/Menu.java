package lab_7.flyweight_pattern_example;

import java.util.HashMap;
import java.util.Map;

/**
 * Menu acts as a factory and cache for CoffeeFlavour flyweight objects
 * Created by Martin Zuber on 27/03/2015.
 */
public class Menu {

    private Map<String, CoffeeFlavour> flavours
            = new HashMap<>();

    CoffeeFlavour lookup(String flavorName) {
        if (!flavours.containsKey(flavorName))
            flavours.put(flavorName, new CoffeeFlavour(flavorName));
        return flavours.get(flavorName);
    }

    int totalCoffeeFlavoursMade() {
        return flavours.size();
    }
}
