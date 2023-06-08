package practiceInterfaces;

public class Cat implements Animals{
    @Override
    public void sounds() {
        System.out.println("check interface");
    }

    @Override
    public void legs(int no) {
        System.out.println("legs of cat is---"+no);
    }

    @Override
    public String animalName(String name) {
       // System.out.println(name);
        return name;
    }
}
