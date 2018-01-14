package com.santhu;

/**
 * Created by Santhu Reddy on 5/6/2017.
 */
public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int brains, int body, int size, int weight, int gills, int eyes,int fins) {
        super(name,1,1, size, weight);
    }
}
