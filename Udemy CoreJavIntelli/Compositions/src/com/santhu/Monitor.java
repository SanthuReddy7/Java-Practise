package com.santhu;

/**
 * Created by Santhu Reddy on 5/7/2017.
 */
public class Monitor {
private String model;
private String manufature;
private Resolution nativeResolution;

    public Monitor(String model, String manufature, Resolution nativeResolution) {
        this.model = model;
        this.manufature = manufature;
        this.nativeResolution = nativeResolution;
    }
    public void drawPixelAt(int x , int y , String color){
        System.out.println("Drawing pixel at "+x+" ,"+y+" ,"+color);
    }

    public String getModel() {
        return model;
    }

    public String getManufature() {
        return manufature;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
