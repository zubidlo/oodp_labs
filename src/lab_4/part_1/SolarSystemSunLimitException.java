package lab_4.part_1;

/**
 * @author lukeraeside
 * @version 27-02-2013
 * 
 * This is a class to represent a Sample Solar system limit exception
 * The Sun class is a Singleton and the number of Sun objects cannot exceed max of Solar System
 * This Exception represents the condition where the limit is exceeded
 */
public class SolarSystemSunLimitException extends Exception {

	public SolarSystemSunLimitException() {

		super("A solar system can only have single sun!");
	}
}
