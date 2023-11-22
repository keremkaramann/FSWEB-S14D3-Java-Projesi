package CarsCompany;

public class ElectricCar extends CarSkeleton{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }
public int myDCar(){
    return 500;
}
    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println(getClass().getSimpleName());
    }
}
