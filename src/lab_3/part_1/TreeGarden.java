package lab_3.part_1;

/**
 * Created by martin on 17/02/2015.
 */
public class TreeGarden extends Garden {

    public Plant getShade() {
        return new Plant("Fir");
    }
    public Plant getCenter() {
        return new Plant("Ash");
    }
    public Plant getBorder() {
        return new Plant("Redwood");
    }

}