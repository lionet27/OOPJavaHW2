// Создать класс Doctor. 
// Создайте интерфейсы Runnable, Flyable, Swimable. У интерфейсов должны быть методы получения скорости заданного действия.
// Добавьте наследников этим интерфейсам, но таким образом, чтобы у каждого интерфейса было минимум по два наследника (при необходимости, добавьте в приложение новые классы)
// У ветеринарной клиники добавьте методы получения всех бегающих, всех плавающих, всех говорящих и всех летающих и вообще всех животных.
// Постарайтесь максимально логично переписать архитектуру проекта.

package veterinary;

import HW2.impl.Cat;
import HW2.impl.Dog;
import HW2.impl.Duck;
import HW2.Animal;
import HW2.impl.Crocodile;
import HW2.impl.Fish;
import HW2.impl.Sparrow;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VetClinic vetClinic = new VetClinic();
        vetClinic
                .addAnimal(new Cat("Мурзик"))
                .addAnimal(new Dog("Бобик"))
                .addAnimal(new Duck("Дональд"))
                .addAnimal(new Cat("Мурка"))
                .addAnimal(new Crocodile("Кроко"))
                .addAnimal(new Fish("Немо"))
                .addAnimal(new Sparrow("Воробышек"));    
                
        List<Animal> runningAnimals=vetClinic.getRunning(vetClinic);
        System.out.println("Список бегающих животных:");
        vetClinic.printAnimalList(runningAnimals);
        

        List<Animal> swimingAnimals=vetClinic.getSwiming(vetClinic);
        System.out.println("Список плавающих животных:");
        vetClinic.printAnimalList(swimingAnimals);

        List<Animal> flyingAnimals=vetClinic.getFlying(vetClinic);
        System.out.println("Список летающих животных:");
        vetClinic.printAnimalList(flyingAnimals);
        
        List<Animal> speakingAnimals=vetClinic.getSpeaking(vetClinic);
        System.out.println("Список говорящих животных:");
        vetClinic.printAnimalList(speakingAnimals);

        System.out.println("Список всех животных:");
        vetClinic.printVetClinic(vetClinic);
        
        System.out.println(Animal.getAnimalsCount());
    }
}
