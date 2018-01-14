package com.santhu;

public class EnhancedPlayer {
    private String name;
    private int health=100;
    private String weapon;

    public EnhancedPlayer(String name, int helath, String weapon) {
        if(health>=0&&helath<=200){
            this.health = helath;
        }
        this.weapon = weapon;
    }
    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("knocked out ");
            //Reduce no of lives remaining for the player
        }
    }

    public int getHealth() {
        return health;
    }
}
