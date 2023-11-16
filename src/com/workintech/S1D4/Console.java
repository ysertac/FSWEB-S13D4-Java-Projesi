package com.workintech.S1D4;

public class Console {
    public static void main(String[] args) {
        Player sertac = new Player("ySertacc", 100, Weapon.GLAIVE);
        Player faruk = new Player("XxFaRuKxX", 54, Weapon.AXE);
        System.out.println(sertac.showPlayer());
        System.out.println(faruk.showPlayer());
        sertac.loseHealth(73);
        System.out.println(sertac.showPlayer());
        sertac.loseHealth(70);
        System.out.println(sertac.showPlayer());
        sertac.restoreHealth(49);
        System.out.println(sertac.showPlayer());
    }
}
