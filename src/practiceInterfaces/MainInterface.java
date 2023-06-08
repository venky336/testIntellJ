package practiceInterfaces;

public class MainInterface {
    public static void main(String[] args) {
        TestInterface testInterface = new Test_Main();
        testInterface.m1();
        testInterface.animalName("lion");
        System.out.println(testInterface.name);
    }
}
