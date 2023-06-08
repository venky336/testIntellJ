public class CarMain {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setMake("Toyota");
      //  myCar.setMake("tvs");
        myCar.setModel("Extreme");
        myCar.setYear(2023);
        System.out.println(myCar.getMake()+"\n"+"model is:"+myCar.getModel()+"\n"+myCar.getYear());
    }
}
