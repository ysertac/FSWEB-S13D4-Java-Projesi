package com.workintech.S1D4;

import java.nio.file.Watchable;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        this.healthPercentage = healthPercentage;
        chechHealth(this.healthPercentage);
        this.weapon = weapon;
    }

    private void chechHealth(int healthPercentage) {
        if (healthPercentage < 0) {
            this.healthPercentage = 0;
        }

        if (healthPercentage > 100) {
            this.healthPercentage = 100;
        }
    }

    public int healthRemaining() {
        return healthPercentage;
    }

    public void loseHealth(int damage) {
        healthPercentage = healthPercentage - damage;
        if (healthPercentage <= 0) {
            System.out.println(name + "has been knocked out of the game");
        }
        chechHealth(healthPercentage);
    }

    public void restoreHealth(int health) {
        healthPercentage = healthPercentage + health;
    }

    public String showPlayer() {
        return "name: " + this.name + " health: " + this.healthPercentage + "%"
                + " weapon: " + this.weapon;
    }
}
