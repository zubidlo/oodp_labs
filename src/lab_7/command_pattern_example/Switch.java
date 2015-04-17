package lab_7.command_pattern_example;

import java.util.*;

/**
 * The Invoker class
 * Created by Martin Zuber on 27/03/2015.
 */
public class Switch {

    private List<Command> history = new ArrayList<>();

    public void storeAndExecute(Command cmd) {
        this.history.add(cmd); // optional
        cmd.execute();
    }
}
