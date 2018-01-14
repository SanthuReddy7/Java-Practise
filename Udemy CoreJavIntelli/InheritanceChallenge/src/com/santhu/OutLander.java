package com.santhu;

/**
 * Created by Santhu Reddy on 5/6/2017.
 */
public class OutLander extends Car {
    private int roadServiceMonths;

    public OutLander() {
        super("Outlander", "4wd", 4, 4, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }
    public void accelerate(int rate){
        int newVelocity = getCurrentVelocity()+rate;
        if(newVelocity==0){
            stop();
            changeGear(1);
        }else if(newVelocity>0&&newVelocity<=0){
            changeGear(1);
        }else if(newVelocity>=10 && newVelocity<=20){
            changeGear(2);
        }else if(newVelocity>=20 && newVelocity<=30){
            changeGear(3);
        }else {
            changeGear(4);
        }
        if(newVelocity>=0){
            changeVelocity(newVelocity,getCurrentVelocity());
        }
    }


}
