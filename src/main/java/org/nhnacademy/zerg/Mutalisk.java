package org.nhnacademy.zerg;

import org.nhnacademy.Zerg;

public class Mutalisk extends Zerg {
    private static final int ATTACK_POWER = 2;
    private static final int DEFENSE_POWER = 8;
    private static final String UNIT_NAME = "Mutalisk";

    public Mutalisk() {
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
