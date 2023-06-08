package javaCodingPractice;

class Vehicle {
    String brand;
    Vehicle(String brand){
        this.brand=brand;
    }
    void displayBrand()
    {
        System.out.println("Brand:"+brand);
    }

}
class Car extends Vehicle{
    int year;
    Car(String brand, int year)
    {
        super(brand);
        this.year=year;
    }
    void displayCarDetails()
    {
        super.displayBrand();
        System.out.println("Car year "+year);
    }
}
public class SuperConstructor {
    int a =100;
    public static void main(String[] args) {
      //  Car car = new Car("Apple car",2023);
      //  car.displayCarDetails();
        SuperConstructor sc = new SuperConstructor();
      //  System.out.println(sc.a);
        int[] arr = {25,15,5,30};
        int largest=arr[0];
        for (int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("largest numnber in given array "+largest);
    }
}
