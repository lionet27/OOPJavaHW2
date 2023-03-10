package HW2.impl;

import HW2.Animal;
import HW2.Runnable;
import HW2.Speakble;

public class Dog extends Animal implements Runnable,Speakble {
    public Dog(String name, String color) {
        super(name, color,4);
    }

    public Dog(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Woof!");
    }

    @Override
    public void hunt() {

    }

    @Override
    public int getRunnigSpeed() {
        return 60;
    }
}
