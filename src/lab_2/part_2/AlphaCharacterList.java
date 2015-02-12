package lab_2.part_2;

import static java.lang.System.*;
/**
 * Created by martin on 13/02/2015.
 */
public class AlphaCharacterList extends NumberList {

    AlphaCharacterList(String list) {

        charList = list.replaceAll(",", "").toCharArray();
    }

    @Override
    public void display() {

        out.println("\nAlpha Character List");
        for (int i = 0; i < charList.length; i++) {
            out.format("[%d] = %s%n", i, charList[i]);
        }
    }

    @Override
    public Number sum() { return null; }
}
