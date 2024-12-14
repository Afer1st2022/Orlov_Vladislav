package pr.pr3;

public class Bridge {
    public abstract static class Device {
        public OperatingSystem operatingSystem;

        public Device(OperatingSystem operatingSystem) {
            this.operatingSystem = operatingSystem;
        }

        public abstract void displayInfo();
    }

    static class Smartphone extends Device {
        public Smartphone(OperatingSystem operatingSystem) {
            super(operatingSystem);
        }

        public void displayInfo() {
            System.out.print("Смартфон работает на ");
            operatingSystem.showOS();
        }
    }

    static class Tablet extends Device {
        public Tablet(OperatingSystem operatingSystem) {
            super(operatingSystem);
        }

        public void displayInfo() {
            System.out.print("Планшет работает на ");
            operatingSystem.showOS();
        }
    }

    static class Laptop extends Device {
        public Laptop(OperatingSystem operatingSystem) {
            super(operatingSystem);
        }

        public void displayInfo() {
            System.out.print("Ноутбук работает на ");
            operatingSystem.showOS();
        }
    }

    interface OperatingSystem {
        void showOS();
    }

    static class iOS implements OperatingSystem {
        public void showOS() {
            System.out.println("iOS");
        }
    }

    static class Android implements OperatingSystem {
        public void showOS() {
            System.out.println("Android");
        }
    }

    static class Windows implements OperatingSystem {
        public void showOS() {
            System.out.println("Windows");
        }
    }
}
