package lab_5.part_3;

/**
 * builder contract
 * Created by Martin Zuber on 04/03/2015.
 */
interface RobotBuilder {

    void buildRobotHead();
    void buildRobotBody();
    void buildRobotLegs();
    Robot getRobot();
}
