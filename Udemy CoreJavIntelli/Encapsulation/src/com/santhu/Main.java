package com.santhu;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //CODE FOR PLAYER
       /* Player player = new Player();
        player.name="santhu";
        player.health=20;
        player.weapon="Sword";

        int damage=10;
        player.loseHealth(damage);
        System.out.println("Remaining health ="+player.healthRemaining());
        damage =11;
        player.health=200;
        player.loseHealth(damage);
        System.out.println("Remaining health ="+player.healthRemaining());*/

       //FOR ENHANCED PLAYER
        EnhancedPlayer player=new EnhancedPlayer("santhu",300,"sword");
        System.out.println("Initial health is "+player.getHealth());
    }
}
