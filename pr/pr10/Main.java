package pr.pr10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Facade.RestaurantFacade restaurant = new Facade.RestaurantFacade();
        Scanner scanner = new Scanner(System.in);

        restaurant.displayMenu();

        System.out.println("Введите заказ (\"всё\" чтобы закончить):");
        String input;
        while (!(input = scanner.nextLine()).equalsIgnoreCase("всё")) {
            restaurant.addItemToOrder(input);
        }

        restaurant.showOrder();

        System.out.print("Введите сумму для оплаты (руб.): ");
        double amount = scanner.nextDouble();
        restaurant.pay(amount);

        scanner.close();
    }
}
