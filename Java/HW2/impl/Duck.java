package HW2.impl;

import HW2.Animal;
import HW2.Flyable;
import HW2.Illable;
import HW2.Runnable;
import HW2.Speakble;
import HW2.Swimable;

public class Duck extends Animal implements Flyable, Illable,Runnable,Swimable,Speakble {
    public Duck(String name, String color) {
        super(name, color,2);
    }

    public Duck(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Quack!");
    }

    @Override
    public void hunt() {

    }

    
    @Override
    public int getFlightSpeed() {
        return 10;
    }

    @Override
    public void getIll() {

    }
    @Override
    public int getRunnigSpeed() {
        return 3;
    }

    @Override
    public int getSwimmingSpeed() {
        return 15;
    }
}
