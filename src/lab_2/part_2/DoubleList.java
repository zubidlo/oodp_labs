package lab_2.part_2;

import java.util.StringTokenizer;

import static java.lang.System.out;

class DoubleList extends NumberList {

    int size;

    DoubleList(String list) {

        size = 0;
        StringTokenizer token = new StringTokenizer(list);
        size = token.countTokens();
        // Allocate some space for the array
        doubleList = new double[size];
        // Store each list item an the appropriate array
        for(int i = 0; i < size; i++) {
            doubleList[i] = Double.parseDouble(token.nextToken());
        }
    }

    @Override
    Number sum() {

        double n = 0;
        for(int i = 0; i < size; i++) { n += doubleList[i]; }
        return n;
    }

    @Override
    void display() {

        out.format("%nitems:%n");
        for(int i = 0; i < size; i++)
            System.out.println("[" + i + "] = " + doubleList[i]);
    }
}
