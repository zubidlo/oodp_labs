package lab_2.part_2;

abstract class NumberList {

    protected int[] intList;
    protected double[] doubleList;
    protected char[] charList;

    abstract void display();
    abstract Number sum();

    int[] getIntList() { return intList; }
    double[] getDoubleList() { return doubleList; }
    char[] getCharList() { return charList; }
}