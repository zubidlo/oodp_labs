package lab_6.part_3;

import static java.lang.Math.*;
/**
 * facade to java.lang.Math
 * Created by Martin Zuber on 12/03/2015.
 */
class JuniorMathFacade {

    /**
     * Math.abs(int) wrapper method
     * @param n an integer
     * @return absolute value of n
     */
    static int absoluteValue(int n) {
        return abs(n);
    }

    /**
     * Math.cbrt(double) wrapper method
     * @param n a double
     * @return cube root of n
     */
    static double cubeRoot(double n) {
        return cbrt(n);
    }

    /**
     * Math.sqrt(double) wrapper method
     * @param n a double
     * @return square root of n
     */
    static double squareRoot(double n) {
        return sqrt(n);
    }

    /**
     * Math.pow(double, double) wrapper method
     * @param x a double
     * @param y a bouble
     * @return x to the power of y
     */
    static double xToThePowerOfy(double x, double y) {
        return pow(x, y);
    }

    /**
     * Math.rint(double) wrapper function
     * @param n
     * @return
     */
    static double roundDoubleToInteger(double n) {
        return rint(n);
    }
}
