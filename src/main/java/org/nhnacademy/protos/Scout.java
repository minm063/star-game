package org.nhnacademy.protos;

import org.nhnacademy.Protos;

public class Scout extends Protos {
    private static final int ATTACK_POWER = 5;
    private static final int DEFENSE_POWER = 10;
    private static final String UNIT_NAME = "Scout";

    public Scout() {
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
