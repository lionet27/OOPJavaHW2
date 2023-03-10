package HW2.impl;
import HW2.Animal;
import HW2.Flyable;
import HW2.Runnable;
import HW2.Speakble;

public class Sparrow extends Animal implements Flyable,Runnable,Speakble{
    public Sparrow(String name, String color) {
        super(name, color,2);
    }

    public Sparrow(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Chiv-chiv!");
    }

    @Override
    public void hunt() {

    }

    @Override
    public int getFlightSpeed() {
        return 15;
    }
    
    @Override
    public int getRunnigSpeed() {
        return 4;
    }

    
}
