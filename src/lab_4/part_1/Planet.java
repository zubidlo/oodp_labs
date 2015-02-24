package lab_4.part_1;

/**
 * @author luke raeside
 * @version 27-02-2013
 * 
 * This is a class to represent a Planet in Solar system which orbits a Sun
 */

class Planet extends CelestialBody {

	private String name;
	private Sun sun;
	private double distanceFromSun;

    //bad design, coupling addOribitingBody() is public and it's use will break program
	Planet(String name, Sun sun) {

		this.sun = sun;
		this.name = name;
        sun.addOrbitingBody(this);
	}

    //constructor with distance from sun
	Planet(String name, Sun sun, double distanceFromSun) {

		this(name, sun);
		this.distanceFromSun = distanceFromSun;
	}

	@Override
	public String getName() {
		return name;
	}

    //refactored to more meaningful message
    @Override
    public String toString() {

        return String.format("Planet: %s is orbiting %s in distance of:%.0f km.%n",
                name, sun.getName(), distanceFromSun);
    }
}
