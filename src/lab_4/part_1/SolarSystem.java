package lab_4.part_1;

import java.util.Vector;

/**
 * @author luke raeside
 * @version 27-02-2013
 * This is a class to represent the Solar System
 */

class SolarSystem {
	
	private Sun sun;

	void addSun(Sun sun) {
		this.sun = sun;
	}

    //refactored to simplify
	@Override
	public String toString() {

        //make text
        String text = "Welcome to our star system!.\n\n";
        if (sun != null) {
            //get planets
            Vector<CelestialBody> planets = sun.getOrbitingBodies();
            text += String.format("Heart of this system is %s.%n", sun);
            text += String.format("There is also %d planets orbiting %s.%n%n",
                    planets.size(), sun.getName());
            for(CelestialBody planet : planets) text += planet;
        }
		return text;
	}
}
