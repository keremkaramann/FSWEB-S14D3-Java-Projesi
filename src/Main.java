import Cars.Car;
import Cars.Ford;
import Cars.Holden;
import Cars.Mitsubishi;
import CarsCompany.CarSkeleton;
import CarsCompany.ElectricCar;
import CarsCompany.HybridCar;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(8, "Base car");

        car.startEngine();

        car.accelerate();

        car.brake();

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");

        mitsubishi.startEngine();

        mitsubishi.accelerate();

        mitsubishi.brake();

        Car ford = new Ford(6, "Ford Falcon");

        ford.startEngine();

        ford.accelerate();

        ford.brake();

        Car holden = new Holden(6, "Holden Commodore");

        holden.startEngine();

        holden.accelerate();

        holden.brake();
        System.out.println("**************");

        CarSkeleton myCar =new HybridCar("toyota","prius",1.9,20,3);
        myCar.startEngine();
        myCar.drive();
        CarSkeleton my2Car= new ElectricCar("Tesla","cybertruck",0.0,500);

        my2Car.startEngine();
        my2Car.drive();


    }
}