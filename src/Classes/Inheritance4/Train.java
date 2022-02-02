package Classes.Inheritance4;

public class Train extends Vehicle{

    boolean isPassengerTrain;
    int numberOfWaggons;  //vagon sayısı

    public Train(String brand, String model, String fuel, int tankCapacity, double remainingFuel,int numberOfWaggons,boolean isPassengerTrain) {
        super(brand, model, fuel, tankCapacity, remainingFuel);
        this.numberOfWaggons = numberOfWaggons;
        this.isPassengerTrain = isPassengerTrain;
    }


    public void addWaggon(int amount){
        numberOfWaggons += amount;
    }


}
