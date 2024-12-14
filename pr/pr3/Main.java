package pr.pr3;

public class Main {
    public static void main(String[] args) {
        Bridge.Device iphone = new Bridge.Smartphone(new Bridge.iOS());
        Bridge.Device androidTablet = new Bridge.Tablet(new Bridge.Android());
        Bridge.Device windowsLaptop = new Bridge.Laptop(new Bridge.Windows());

        iphone.displayInfo();
        androidTablet.displayInfo();
        windowsLaptop.displayInfo();
    }
}
