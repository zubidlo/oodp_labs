package lab_6.part_1;

import zoo.*;

/**
 * alligator adapter
 * Created by Martin Zuber on 11/03/2015.
 */
public class AlligatorAdapter extends Animal {

    private alligator alligator;

    AlligatorAdapter(int weight) {
        alligator = new alligator(weight);
    }

    @Override
    protected void feed() {
        alligator.feedalligator();
    }
}
