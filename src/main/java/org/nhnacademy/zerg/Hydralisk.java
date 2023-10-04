package org.nhnacademy.zerg;

import org.nhnacademy.Zerg;

public class Hydralisk extends Zerg {
    private static final int ATTACK_POWER = 3;
    private static final int DEFENSE_POWER = 7;
    private static final String UNIT_NAME = "Hydralisk";

    public Hydralisk() {
        super(ATTACK_POWER, DEFENSE_POWER);
    }

    @Override
    public String getUnitName() {
        return UNIT_NAME;
    }

    @Override
    public boolean getFlyableWeapon() {
        return true;
    }
}
