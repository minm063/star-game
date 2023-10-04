package org.nhnacademy.terran;

import org.nhnacademy.Terran;

public class Valkyrie extends Terran {
    private static final int ATTACK_POWER = 4;
    private static final int DEFENSE_POWER = 12;
    private static final String UNIT_NAME = "Valkyrie";

    public Valkyrie() {
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
