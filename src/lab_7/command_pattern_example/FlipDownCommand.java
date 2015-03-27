package lab_7.command_pattern_example;

/**
 * The Command for turning off the light - ConcreteCommand #2
 * Created by Martin Zuber on 27/03/2015.
 */
public class FlipDownCommand implements Command {

    private Light theLight;

    public FlipDownCommand(Light light) {
        this.theLight = light;
    }

    @Override    // Command
    public void execute() {
        theLight.turnOff();
    }
}
