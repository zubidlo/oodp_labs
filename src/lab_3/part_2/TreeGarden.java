package lab_3.part_2;

/**
 * Created by martin on 17/02/2015.
 */
class TreeGarden implements Garden {

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