package org.nhnacademy.zerg;

import org.nhnacademy.Zerg;

public class Queen extends Zerg {
    private static final int ATTACK_POWER = 15;
    private static final int DEFENSE_POWER = 25;
    private static final String UNIT_NAME = "Queen";

    public Queen() {
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
