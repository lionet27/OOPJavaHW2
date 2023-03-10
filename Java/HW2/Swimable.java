package HW2;

public interface Swimable {
    int getSwimmingSpeed();
    public default void swim(){
        System.out.println("Я плыву.");
    }
}
