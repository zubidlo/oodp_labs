package lab_3.part_4.factoryClasses;

import lab_3.part_4.gamePieces.*;

/**
 * Created by martin on 18/02/2015.
 */
public interface BattleGameAbstractFactory {

    /**
     * Creates new random vehicle.
     * @return created vehicle
     */
    Vehicle getBattleVehicle();

    /**
     * Creates new damage item.
     * @return created item
     */
    DamageItem getDamageItem();
}
