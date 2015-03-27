package lab_7.command_pattern_example;

/**
 * The Receiver class
 * Created by Martin Zuber on 27/03/2015.
 */
public class Light {

    public void turnOn() {
        System.out.println("The light is on");
    }

    public void turnOff() {
        System.out.println("The light is off");
    }
}
