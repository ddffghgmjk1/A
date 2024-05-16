

public class Main {
    public static void main(String[] args) {

        Animal dog = new Dog("Timbersaw");
        Animal cat = new Cat("Razor");

        dog.eat();
        dog.sound();
        dog.sleep();

        cat.eat();
        cat.sound();
        cat.sleep();
    }
}