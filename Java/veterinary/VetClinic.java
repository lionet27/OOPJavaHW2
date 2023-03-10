package veterinary;


import HW2.Animal;
import HW2.Flyable;
import HW2.Swimable;
import HW2.Runnable;
import HW2.Speakble;

import java.util.ArrayList;
import java.util.List;

public class VetClinic {
    private final List<Animal> animals;

    public List<Animal> getAnimals() { return animals; }

    public VetClinic addAnimal(Animal animal) {
        this.animals.add(animal);
        return this;
    }

    public VetClinic() { this.animals = new ArrayList<>(); }

    public List<Animal> getRunning(VetClinic vetClinic){
        List<Animal> runningAnimals=new ArrayList<Animal>();
        for (Animal a: vetClinic.getAnimals()) {
            if (a instanceof Runnable){
                runningAnimals.add(a);
            }    
       }
       return runningAnimals;
    }

    public List<Animal> getSwiming(VetClinic vetClinic){
        List<Animal> swimingAnimals=new ArrayList<Animal>();
        for (Animal a: vetClinic.getAnimals()) {
            if (a instanceof Swimable){
                swimingAnimals.add(a);
            }    
       }
       return swimingAnimals;
    }

    public List<Animal> getFlying(VetClinic vetClinic){
        List<Animal> flyingAnimals=new ArrayList<Animal>();
        for (Animal a: vetClinic.getAnimals()) {
            if (a instanceof Flyable){
                flyingAnimals.add(a);
            }    
       }
       return flyingAnimals;
    }

    public List<Animal> getSpeaking(VetClinic vetClinic){
        List<Animal> speakingAnimals=new ArrayList<Animal>();
        for (Animal a: vetClinic.getAnimals()) {
            if (a instanceof Speakble){
                speakingAnimals.add(a);
            }    
       }
       return speakingAnimals;
    }

    public void printVetClinic(VetClinic vetClinic){
        for (Animal a: vetClinic.getAnimals()) {
            System.out.println(a);
        }    
                
    }

    public void printAnimalList(List<Animal> animals){
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }    

    
}
