package lab_2.part_2;

import static java.lang.System.*;

class AlphaCharacterList extends NumberList {

    /**
     * Creates character list.
     * @param charList "a,b,c..."
     */
    AlphaCharacterList(String charList) {

        this.charList = charList.replaceAll(",", "").toCharArray();
    }

    @Override
    void display() {

        out.format("%nitems:%n");
        for (int i = 0; i < charList.length; i++) {
            out.format("[%d] = %s%n", i, charList[i]);
        }
    }

    @Override
    Number sum() { return null; }
}
