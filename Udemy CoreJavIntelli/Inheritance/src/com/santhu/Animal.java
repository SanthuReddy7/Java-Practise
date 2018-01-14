package com.santhu;


public class Animal {
    private String name;
    private int brains;
    private int body;
    private int size;
    private int weight;

    public Animal(String name, int brains, int body, int size, int weight) {
        this.name = name;
        this.brains = brains;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public void eat() {
        System.out.println("Animal.eats() called");
    }
    public void move(int speed) {
        System.out.println("Animal moves at speed"+speed);
    }
    public String getName() {
        return name;
    }
    public int getBrains() {
        return brains;
    }
    public int getBody() {
        return body;
    }
    public int getSize() {
        return size;
    }
    public int getWeight() {
        return weight;
    }
}
