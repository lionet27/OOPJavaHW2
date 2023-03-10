package HW2.impl;
import HW2.Animal;
import HW2.Runnable;
import HW2.Swimable;


public class Crocodile extends Animal implements Swimable, Runnable{
    public Crocodile(String name, String color) {
        super(name, color,2);
    }

    public Crocodile(String name) {
        this(name, null);
    }

    
    @Override
    public void hunt() {

    }

    @Override
    public int getRunnigSpeed() {
        return 15;
    }

    @Override
    public int getSwimmingSpeed() {
        return 40;
    }
    
}
