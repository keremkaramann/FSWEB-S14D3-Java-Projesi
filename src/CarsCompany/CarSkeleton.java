package CarsCompany;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void startEngine(){
        System.out.println(getClass().getSimpleName() + " Engine Started");
    }
    public void drive(){
        runEngine(this);
    }
    protected void runEngine(CarSkeleton carSkeleton){
        System.out.println(carSkeleton.getClass().getSimpleName() + " engine runs.");
        if(carSkeleton instanceof ElectricCar){
        double kmPer=((ElectricCar)carSkeleton).myDCar();
            System.out.println(kmPer + " kmper battery");
        }else {
            System.out.println("Invalid instance");
        }
    }

    @Override
    public String toString() {
        return "CarSkeleton{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
