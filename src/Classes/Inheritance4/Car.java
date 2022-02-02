package Classes.Inheritance4;

public class Car extends Vehicle {
     int numberOfSits;  //oturma sayısı

     public Car(String brand, String model, String fuel, int tankCapacity, double remainingFuel,int numberOfSits) {
          super(brand, model, fuel, tankCapacity, remainingFuel);
          this.numberOfSits = numberOfSits;
     }
     void printCarNameAndBrand() {
          System.out.println("Brand : " + super.brand + " Model : " + super.model);
     }
}
