package Com.methods;


public class HelloWorld {

        public static void main(String args[]) {
            boolean gameover=true;
            int score;
            int levelcompleted;
            int bonus;

/*calculateScore(true,10,levelcompleted,400);
         gameover=true ;
         score =20;
         levelcompleted=10;
         bonus =30;
calculateScore( gameover,  score, levelcompleted, bonus);

        gameover=true ;
        score =20;
        levelcompleted=10;
        bonus =30;
        calculateScore1( gameover,  score, levelcompleted, bonus);

    }

    public static void calculateScore(boolean gameover,int score, int levelcompleted,int bonus) {

        int finalScore = score + (levelcompleted * bonus);
        finalScore += 1000;
        System.out.println("final score is " + finalScore);
    }
public static  void calculateScore1(boolean gameover,int score,int levelcompleted,int bonus){

int finalscore=(score+levelcompleted+bonus);
finalscore+=100;
        System.out.println(finalscore);
    }

    }*/

            calculateScore(true, 10, 1, 400);
            calculateScore(false, 10, 1, 400);
            calculateScore(false, 10, 1, 400);
            calculateScore(false, 10, 1, 400);
            calculateScore(false, 10, 1, 400);
        }

        public static void calculateScore(boolean gameover, int score, int levelcompleted, int bonus) {

            if (gameover) {
                int finalscore = score + levelcompleted + bonus;
                finalscore += 100;
                System.out.println(finalscore);
            }
            else{
                int finalscore1 = score + levelcompleted + bonus;
                finalscore1 += 200;
                System.out.println("final score=" + finalscore1);
            }
        }
    }
