package lab_4.part_1;

import javax.swing.*;

/**
 * @author luke raeside
 * @version 27-02-2013
 * 
 * This is a class to represent a Sample Solar system
 * This class demonstrates the use of the Singleton Pattern through the Sun class
 * The Sun class is a Singleton and the number of Sun objects cannot exceed max of Solar System
 */

class SampleSolarSystem {

    //refactored
	public static void main(String[] args) {

        //create swing components
        JTextArea displayArea = new JTextArea(15,38);
        displayArea.setEditable(false);
        JFrame frame = new JFrame();
        frame.getContentPane().add(new JScrollPane(displayArea));
        frame.pack();
        frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);

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
            displayArea.append(solSystem.toString());
            frame.setVisible(true);

            //try to create second sun
            Sun.createSun("Second Sun", solSystem);
			
		} catch (SolarSystemSunLimitException e) {

            //simplified
			JOptionPane.showMessageDialog(frame,
                    e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
		}
    }
}
