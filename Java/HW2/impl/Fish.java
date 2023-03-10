package HW2.impl;
import HW2.Animal;
import HW2.Swimable;

public class Fish extends Animal implements Swimable{
    public Fish(String name, String color) {
        super(name, color,2);
    }

    public Fish(String name) {
        this(name, null);
    }

    
    @Override
    public void hunt() {

    }
    @Override
    public int getSwimmingSpeed() {
        return 40;
    }
}
