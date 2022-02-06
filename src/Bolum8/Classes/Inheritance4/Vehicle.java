package Bolum8.Classes.Inheritance4;

public class Vehicle {
     String brand;  // brand-->marka
     String model;
     String fuel;  //fuel-->yakıt
     int tankCapacity;  //tank kapasitesi
     double remainingFuel; // remaining fuel-->geriye kalan yakıt

    public void fillTheTank(double amount){   //tankı doldur.   amount-->miktar
        if(amount + remainingFuel< tankCapacity){
            tankCapacity+= amount;
        }
    }

    public Vehicle(String brand, String model, String fuel, int tankCapacity, double remainingFuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
        this.tankCapacity = tankCapacity;
        this.remainingFuel = remainingFuel;
    }
}
