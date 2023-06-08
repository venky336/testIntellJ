package practiceInterfaces;

public class InterfaceMain {
    public static void main(String[] args) {
        Animals animals = new Cat();
        animals.sounds();
        animals.legs(4);
        System.out.println(animals.animalName("tiger"));
    }
}
