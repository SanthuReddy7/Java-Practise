package com.santhu;


public class Car {
   private int doors;
   private int wheels;
   public String model;
   private String engine;
   private String color;

    public void setModel(String model) {
        String validModel = model.toUpperCase();
        if(validModel.equals("carrera")||validModel.equals("holdan")){
            this.model = model;
        }else{
            this.model="Unknown";
        }


    }

    public String getModel() {
        return model;
    }
}
