package pr.pr10;

import java.util.ArrayList;
import java.util.List;

public class Facade {

    public static class Menu {
        private final List<String> items;

        public Menu() {
            items = new ArrayList<>();
            items.add("Пицца");
            items.add("Паста");
            items.add("Салат");
            items.add("Десерт");
        }

        public void displayMenu() {
            System.out.println("Меню:");
            for (String item : items) {
                System.out.println("- " + item);
            }
        }

        public List<String> getItems() {
            return items;
        }
    }

    public static class Order {
        private List<String> orderedItems;

        public Order() {
            orderedItems = new ArrayList<>();
        }

        public void addItem(String item) {
            orderedItems.add(item);
            System.out.println(item + " добавлено к заказу.");
        }

        public void showOrder() {
            System.out.println("Ваш заказ:");
            for (String item : orderedItems) {
                System.out.println("- " + item);
            }
        }

        public List<String> getOrderedItems() {
            return orderedItems;
        }
    }

    public static class Payment {
        public void processPayment(double amount) {
            System.out.println("Процесс оплаты " + amount + " руб.");
            System.out.println("Платёж проведён успешно!");
        }
    }

    public static class RestaurantFacade {
        private final Menu menu;
        private final Order order;
        private final Payment payment;

        public RestaurantFacade() {
            menu = new Menu();
            order = new Order();
            payment = new Payment();
        }

        public void displayMenu() {
            menu.displayMenu();
        }

        public void addItemToOrder(String item) {
            order.addItem(item);
        }

        public void showOrder() {
            order.showOrder();
        }

        public void pay(double amount) {
            payment.processPayment(amount);
        }
    }

}
