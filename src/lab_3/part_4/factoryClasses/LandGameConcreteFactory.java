package lab_3.part_4.factoryClasses;

import lab_3.part_4.gamePieces.*;
import static utilities.Utils.rand;

public class LandGameConcreteFactory implements BattleGameAbstractFactory {

    /**
     * Creates new tank or car.
     * @return created road vehicle
     */
    @Override
    public Vehicle getBattleVehicle() {
        return rand(2) == 0 ? new Tank() : new Car();
    }

    /**
     * Returns new road block.
     * @return created road block
     */
    @Override
    public DamageItem getDamageItem() {
        return new RoadBlock();
    }
}
