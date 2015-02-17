package lab_3.part_3;

import static utilities.Utils.*;
/**
 * Created by martin on 18/02/2015.
 */
public class LivingThingFactory implements EarthThingsAbstractFactory {

    private static String[] birdFeatures = {"birds have wings", "birds can fly"};
    private static String[] birdNames = {"hawk", "crow", "quail", "francolin"};
    private static String[] plantFeatures = {"plants get energy from sun", "plants grow from soil"};
    private static String[] plantNames = {"tree", "flower", "vegetable", "grass"};

    @Override
    public Thing getThing() {
        if (rand(2) == 0) {
            return new Bird(birdNames[rand(birdNames.length)],
                    birdFeatures[rand(birdFeatures.length)]);
        }
        return new Plant(plantNames[rand(plantNames.length)],
                plantFeatures[rand(plantFeatures.length)]);
    }
}
