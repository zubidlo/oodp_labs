package lab_3.part_4.factoryClasses;

import lab_3.part_4.gamePieces.*;
import static utilities.Utils.rand;

/**
 * Created by martin on 18/02/2015.
 */
public class SeaGameConcreteFactory implements BattleGameAbstractFactory {

    /**
     * Creates new boat or submarine.
     * @return created water vehicle
     */
    @Override
    public Vehicle getBattleVehicle() {
        return rand(2) == 0 ? new Boat() : new Submarine();
    }

    /**
     * Returns new sea mine.
     * @return created sea mine
     */
    @Override
    public DamageItem getDamageItem() {
        return new SeaMine();
    }
}
