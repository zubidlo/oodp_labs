package lab_7.command_pattern_example;

/**
 * The Command for turning on the light - ConcreteCommand #1
 * Created by Martin Zuber on 27/03/2015.
 */
public class FlipUpCommand implements Command {

    private Light theLight;

    public FlipUpCommand(Light light) {
        this.theLight = light;
    }

    @Override    // Command
    public void execute() {
        theLight.turnOn();
    }
}
