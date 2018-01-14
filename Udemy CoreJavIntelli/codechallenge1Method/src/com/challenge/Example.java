package com.challenge;

/**
 * Created by Santhu Reddy on 5/3/2017.
 */
//lecture 30.
    //challenge 1
/*public class Example {

    public static void main(String args[]){

        int highScorePosition = calculateHighscoreposition(1500);
        displayHighScorePosition("santhu",highScorePosition);
         highScorePosition = calculateHighscoreposition(700);
        displayHighScorePosition("sudha",highScorePosition);
         highScorePosition = calculateHighscoreposition(1200);
        displayHighScorePosition("Mahi",highScorePosition);
         highScorePosition = calculateHighscoreposition(100);
        displayHighScorePosition("babai",highScorePosition);
         highScorePosition = calculateHighscoreposition(500);
        displayHighScorePosition("Abbai",highScorePosition);}

            public static void displayHighScorePosition(String playername,int highscoreposition){
        System.out.println(playername+" Managed to get into position "+highscoreposition+" on the high score table");
  }
    public static int calculateHighscoreposition(int playerScore){
        if(playerScore>1000) {
            return 1;
        }else if(playerScore > 500 && playerScore<1000){
                return 2;
            }
    else if(playerScore > 100 && playerScore<500){
        return 3;
    }else {
        return 4;
        }
   }
}*/
   //challenge 2
    public class Example {
    public static void main(String args[]) {
        double centimeters = calcFeetInchesToCentimeters(6, 0);
        if (centimeters < 0.0) {
            System.out.println("Invalid parameters");
        }
    calcFeetInchesToCentimeters(157);
    }

    public static double calcFeetInchesToCentimeters(double feet, double inches) {
        if ((feet <= 0) || ((inches < 0) && (inches > 12))) {
            System.out.println("invalid");
            return -1;
        }
        double centimeters = (feet * 12) * 2.53;
        centimeters += inches * 2.54;
        System.out.println(feet + "feet " + inches + "inch  = " + centimeters + "cm");
        return centimeters;
    }

    public static double calcFeetInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet=(int)inches/12;
        double remainingInches=(int)inches%12;
        System.out.println(inches+" "+feet+" "+remainingInches);
        return calcFeetInchesToCentimeters(feet,inches);
    }
}





