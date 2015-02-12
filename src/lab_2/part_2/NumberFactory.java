package lab_2.part_2;

/**
 * Created by martin on 13/02/2015.
 */
public class NumberFactory {

    public NumberList getNumberList(String list) {

        //determine list type
        if (list.contains(",")) { return new AlphaCharacterList(list); }
        if (list.contains(".")) { return new DoubleList(list); }
        return new IntList(list);
    }
}
