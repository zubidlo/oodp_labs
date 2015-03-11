package lab_6.part_1;

import zoo.lizard;
/**
 * lizard adapter
 * Created by Martin Zuber on 11/03/2015.
 */
public class LizardAdapter extends Animal{

    private lizard lizard;

    LizardAdapter(int weight) {
        lizard = new lizard(weight);
    }

    @Override
    protected void feed() {
        lizard.feedlizard();
    }
}
