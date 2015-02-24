package lab_4.part_1;

import java.util.*;

/**
 * 
 * @author luke raeside
 * @version 27-02-2013
 * 
 * This is a class to represent a Sun (Major Celestial Body) in Solar System
 */

public class Sun extends CelestialBody {

    //singleton;
	private static Sun sun;

    //fields
	private double diameter  = 1000000;
    private String name;
	private SolarSystem solarSystem;
	private Vector<CelestialBody> orbitingBodies = new Vector<CelestialBody>();

	private Sun(String name, SolarSystem solarSystem) {

		this.name = name;
		this.solarSystem = solarSystem;
        Sun.sun = this;
	}
	
	private Sun(String name, SolarSystem solarSystem, double diameter) {

        this(name, solarSystem);
		this.diameter = diameter;
	}

    //static factory method without diameter;
	static Sun createSun(String name, SolarSystem solarSystem)
            throws SolarSystemSunLimitException {

        if (sun == null) return new Sun(name, solarSystem);
        throw new SolarSystemSunLimitException();
	}

    //static factory method with diameter
    static Sun createSun(String name, SolarSystem solarSystem, int diameter)
            throws SolarSystemSunLimitException {

        if (sun == null) return new Sun(name, solarSystem, diameter);
        throw new SolarSystemSunLimitException();
    }

    //never use this method!!! bad design!!! duplicate adding to sol
    //Sun and Planet are coupled badly!!!
	void addOrbitingBody(CelestialBody celestialBody) {
        orbitingBodies.add(celestialBody);
	}
	
	Vector<CelestialBody> getOrbitingBodies() {
		return orbitingBodies;
	}

    @Override
	public String getName() {
		return name;
	}

    //refactored to more meaningful message
    @Override
    public String toString() {

        return String.format("Sun: %s with diameter:%.0f km.%n", name, diameter);
    }
}
