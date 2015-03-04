package lab_5.part_3;

/**
 * Director
 * Created by Martin Zuber on 04/03/2015.
 */
class RobotDirector {

    private final RobotBuilder robotBuilder;

    RobotDirector(RobotBuilder robotBuilder){
        this.robotBuilder = robotBuilder;
    }

    Robot getRobot() {
        return robotBuilder.getRobot();
    }

    void makeRobot() {
        robotBuilder.buildRobotHead();
        robotBuilder.buildRobotBody();
        robotBuilder.buildRobotLegs();
    }
}
