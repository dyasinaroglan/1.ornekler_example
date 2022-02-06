package Bolum8.Classes.Inheritance4;

public class Truck extends Vehicle{

    int loadCapacityInTons;  //ton olarak yük kapasitesi
    int currentLoad; //mevcut yük

    public Truck(String brand, String model, String fuel, int tankCapacity, double remainingFuel,int loadCapacityInTons,int currentLoad) {
        super(brand, model, fuel, tankCapacity, remainingFuel);
        this.loadCapacityInTons = loadCapacityInTons;
        this.currentLoad = currentLoad;
    }
    public void loadTruck(int load){
        if(load+currentLoad<= loadCapacityInTons){
            currentLoad+= load;
        }
    }  //yük kamyonu
}
