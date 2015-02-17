package lab_3.part_3;

/**
 * Created by martin on 18/02/2015.
 */
public abstract class NonLivingThing extends Thing {

    /**
     * Creates a thing with given name and feature
     *
     * @param name    a thing's name
     * @param feature like "bird have wings" etc.
     */
    public NonLivingThing(String name, String feature) {
        super(name, feature);
    }
}
