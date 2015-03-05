package lab_2.part_2;

import java.util.StringTokenizer;

import static java.lang.System.out;

class IntList extends NumberList {

    int size;

    IntList(String list) {
        size = 0;
        StringTokenizer token = new StringTokenizer(list);
        size = token.countTokens();
        // Allocate some space for the array
        intList = new int[size];
        // Store each list item an the appropriate array
        for(int i = 0; i < size; i++) {
            intList[i] = Integer.parseInt(token.nextToken());
        }
    }

    @Override
    Number sum() {

        int n = 0;
        for(int i = 0; i < size; i++) { n += intList[i]; }
        return n;
    }

    @Override
    void display() {

        out.format("%nitems:%n");
        for(int i = 0; i < size; i++) {
            System.out.println("[" + i + "] = " + intList[i]);
        }
    }
}
