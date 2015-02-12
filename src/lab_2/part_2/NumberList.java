package lab_2.part_2;

/**
 * Created by martin on 13/02/2015.
 */
public abstract class NumberList {

    protected int[] intList;
    protected double[] doubleList;
    protected char[] charList;

    public abstract void display();
    public abstract Number sum();

    public int[] getIntList() { return intList; }
    public double[] getDoubleList() { return doubleList; }
    public char[] getCharList() { return charList; }
}