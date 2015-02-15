package lab_2.part_2;

import java.util.regex.*;

import static java.lang.System.out;

class NumberFactory {

    NumberList getNumberList(String list) throws IllegalArgumentException{

        NumberList numberList;

        //determine list type
        if (Pattern.compile("^(\\d+ )+\\d+$").matcher(list).find()) {
            numberList = new IntList(list);
        }
        else if (Pattern.compile("^([a-zA-Z],)+[a-zA-Z]$").matcher(list).find()) {
            numberList = new AlphaCharacterList(list);
        }
        else if (Pattern.compile("^(\\d+.\\d+ )+\\d+.\\d+$").matcher(list).find()) {
            numberList = new DoubleList(list);
        }
        else {
            throw new IllegalArgumentException("Bad List format:'" + list + "'");
        }

        out.format("%nnumber factory created instance of %s from '%s'%n",
                numberList.getClass().getSimpleName(), list);
        return numberList;
    }
}
