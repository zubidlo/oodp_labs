package lab_3.part_3;

import static java.lang.System.*;
import java.util.Vector;
import static utilities.Utils.*;

/**
 * Created by martin on 18/02/2015.
 */
public class EarthMaker {

    private final static EarthThingsAbstractFactory livFactory = new LivingThingFactory();
    private final static EarthThingsAbstractFactory nonLivFactory = new NonLivingThingFactory();

    public static void main(String[] arguments) {
        out.format("Things created by Earth maker:%n");
        int i = 1;
        for(Thing thing : newThings()) {
            out.format("[%d] %s%n",i++, thing);
        }
    }

    private static Vector<Thing> newThings() {
        Vector<Thing> things = new Vector<>(100);
        for(int i = 0; i < 100; i++) {
            if(rand(2) == 0) {
                things.add(livFactory.getThing());
            }
            else { things.add(nonLivFactory.getThing()); }
        }
        return things;
    }
}
