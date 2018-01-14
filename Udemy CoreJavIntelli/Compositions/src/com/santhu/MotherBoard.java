package com.santhu;


public class MotherBoard {
    private String model;
    private String manufacture;
    private int ramslots;
    private int cardSlots;
    private String bios;

    public MotherBoard(String model, String manufacture, int ramslots, int cardSlots, String bios) {
        this.model = model;
        this.manufacture = manufacture;
        this.ramslots = ramslots;
        this.cardSlots = cardSlots;
        this.bios = bios;

    }
    public void loadProgram(String programname){
        System.out.println("program "+programname+" is loading . . .");
    }

    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public int getRamslots() {
        return ramslots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }
}

