package com.santhu;

public class Main {

    public static void main(String[] args) {
        Animal a = new Animal("Animal", 1, 1, 5, 5);
        Dog d = new Dog("vishwa", 2, 12, 22, 14, 2, 2, "long silky");

        d.eat();
        d.walk();
      d.run();

    }
}
