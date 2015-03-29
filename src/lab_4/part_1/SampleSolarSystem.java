package lab_4.part_1;

import utilities.FrameSkeleton;

import javax.swing.*;

/**
 * @author luke raeside
 * @version 27-02-2013
 * 
 * This is a class to represent a Sample Solar system
 * This class demonstrates the use of the Singleton Pattern through the Sun class
 * The Sun class is a Singleton and the number of Sun objects cannot exceed max of Solar System
 */

class SampleSolarSystem extends FrameSkeleton{

    final JTextArea displayArea;

    SampleSolarSystem(String title) {
        super(title);
        displayArea = new JTextArea(15,38);
        displayArea.setEditable(false);
        getContentPane().add(new JScrollPane(displayArea));
        pack();
    }

    //refactored
	public static void main(String[] args) {

        SampleSolarSystem sampleSolarSystem = new SampleSolarSystem("Solar System");

        //solar system and sun
        SolarSystem solSystem = new SolarSystem();
        Sun sol;

		try {
            //create sun
            sol = Sun.createSun("Sol", solSystem, 1390000);

            //create planets
            new Planet("Mercury", sol, 57910);
            new Planet("Venus", sol, 108200);
            new Planet("Earth", sol, 149600);
            new Planet("Mars", sol, 227940);
            new Planet("Jupiter", sol, 778330);
            new Planet("Saturn", sol, 1426940);
            new Planet("Uranus", sol, 2870990);
            new Planet("Neptune", sol, 4497070);

            //add sun to solar system
            solSystem.addSun(sol);

            //fill text area and show frame
            sampleSolarSystem.displayArea.append(solSystem.toString());

            //try to create second sun
            Sun.createSun("Second Sun", solSystem);
			
		} catch (SolarSystemSunLimitException e) {

            //simplified
			JOptionPane.showMessageDialog(sampleSolarSystem,
                    e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
		}
    }
}
