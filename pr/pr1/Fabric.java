package pr.pr1;

public class Fabric {

    interface Vehicle {
        void drive();
    }

    static class Car implements Vehicle {
        public void drive() {
            System.out.println("Машина едет...");
        }
    }

    static class Bicycle implements Vehicle {
        public void drive() {
            System.out.println("Велосипед едет...");
        }
    }

    static class Motorcycle implements Vehicle {
        public void drive() {
            System.out.println("Мотоцикл едет...");
        }
    }

    abstract static class VehicleFactory {
        public abstract Vehicle createVehicle();
    }

    static class CarFactory extends VehicleFactory {
        public Vehicle createVehicle() {
            return new Car();
        }
    }

    static class BicycleFactory extends VehicleFactory {
        public Vehicle createVehicle() {
            return new Bicycle();
        }
    }

    static class MotorcycleFactory extends VehicleFactory {
        public Vehicle createVehicle() {
            return new Motorcycle();
        }
    }

}
