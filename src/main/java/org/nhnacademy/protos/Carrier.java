package org.nhnacademy.protos;

import org.nhnacademy.Protos;

public class Carrier extends Protos {
    private static final int ATTACK_POWER = 25;
    private static final int DEFENSE_POWER = 40;
    private static final String UNIT_NAME = "Carrier";

    public Carrier() {
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
