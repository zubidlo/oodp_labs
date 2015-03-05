package lab_3.part_3;

/**
 * Represents a thing
 * Created by martin on 18/02/2015.
 */
public abstract class Thing {

    protected String name, feature;

    /**
     * Creates a thing with given name and feature
     * @param name a thing's name
     * @param feature like "bird have wings" etc.
     */
    public Thing(String name, String feature) {
        this.name = name;
        this.feature = feature;
    }

    public String getName() {
        return name;
    }
    public String getFeature() {
        return feature;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setFeature(String feature) {
        this.feature = feature;
    }

    @Override
    public String toString() {
        String result = getClass().getSimpleName() + ". ";
        result += String.format("Specifically %s. ", getName());
        result += String.format("We all know that %s. ", getFeature());
        return result + String.format("%s belongs to group of %s.",
                getClass().getSimpleName(), getClass().getSuperclass().getSimpleName());
    }
}
