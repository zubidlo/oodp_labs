package lab_3.part_3;

import static utilities.Utils.rand;

/**
 * Created by martin on 18/02/2015.
 */
public class NonLivingThingFactory implements EarthThingsAbstractFactory {

    private static String[] waterFeatures = {"water is liquid"};
    private static String[] waterNames = { "salt water", "fresh water", "sparkling water" };
    private static String[] airFeatures = {"air is gas", "living things breathe air"};
    private static String[] airNames = { "fresh air", "mountain air" };

    @Override
    public Thing getThing() {
        if (rand(2) == 0) {
            return new Water(waterNames[rand(waterNames.length)],
                    waterFeatures[rand(waterFeatures.length)]);
        }
        return new Air(airNames[rand(airNames.length)],
                airFeatures[rand(airFeatures.length)]);
    }
}
