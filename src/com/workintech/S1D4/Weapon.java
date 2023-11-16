package com.workintech.S1D4;

public enum Weapon {
    KNIFE(10, 5),
    DAGGER(10, 6),
    HAMMER(17, 2),
    SWORD(12, 5),
    SPEAR(16, 3),
    AXE(20, 2),
    MACE(21, 2),
    GLAIVE(25, 1);

    private int damage;
    private int atteckSpeed;

    Weapon(int damage, int atteckSpeed) {
        this.damage = damage;
        this.atteckSpeed = atteckSpeed;
    }
}
