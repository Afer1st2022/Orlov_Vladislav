package pr.pr1;

public class Main {
    public static void main(String[] args) {
        Fabric.VehicleFactory carFactory = new Fabric.CarFactory();
        Fabric.Vehicle car = carFactory.createVehicle();
        car.drive();

        Fabric.VehicleFactory bicycleFactory = new Fabric.BicycleFactory();
        Fabric.Vehicle bicycle = bicycleFactory.createVehicle();
        bicycle.drive();

        Fabric.VehicleFactory motorcycleFactory = new Fabric.MotorcycleFactory();
        Fabric.Vehicle motorcycle = motorcycleFactory.createVehicle();
        motorcycle.drive();
    }
}
