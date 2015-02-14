package lab_2.part_2;

import java.util.StringTokenizer;

public class IntList extends NumberList {

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
    public void display() {

        System.out.println("\nInteger List");
        for(int i = 0; i < size; i++) {
            System.out.println("[" + i + "] = " + intList[i]);
        }
    }

    @Override
    public Number sum() {

        int n = 0;
        for(int i = 0; i < size; i++)
        {
            n = n + intList[i];
        }
        return new Integer(n);
    }
}
