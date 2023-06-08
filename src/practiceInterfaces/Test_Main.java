package practiceInterfaces;

public class Test_Main implements TestInterface {

    @Override
    public void sounds() {
        System.out.println("sounding....");
    }
    String company;

    @Override
    public void legs(int no) {
        System.out.println(no);
    }

    @Override
    public String animalName(String name) {
        System.out.println(name);
        return null;
    }

    @Override
    public void m2() {
        System.out.println("m2 method");
    }

    @Override
    public void m1() {
        System.out.println("m1 method calling");
    }
}
