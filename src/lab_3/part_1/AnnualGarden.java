package lab_3.part_1;

public class AnnualGarden extends Garden {

    public Plant getShade() {
        return new Plant("Coleus");
    }
    public Plant getCenter() {
        return new Plant("Marigold");
    }
    public Plant getBorder() {
        return new Plant("Alyssum");
    }

}
