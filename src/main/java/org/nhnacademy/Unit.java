package org.nhnacademy;

public interface Unit {
    public int getAttackPower();
    public int getDefensePower();
    public String getUnitName();
    public String getSpeciesName();
    public boolean getFlyableWeapon();
    public void attackDefensePower(int attackPower);
}
