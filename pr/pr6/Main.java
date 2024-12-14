package pr.pr6;

public class Main {
    public static void main(String[] args) {

        System.out.println("Подтверждение заказа:");
        TemplateMethod.OrderProcess orderConfirmation = new TemplateMethod.OrderConfirmation();
        orderConfirmation.processOrder();

        System.out.println("\nУпаковка заказа:");
        TemplateMethod.OrderProcess orderPackaging = new TemplateMethod.OrderPackaging();
        orderPackaging.processOrder();

        System.out.println("\nДоставка заказа:");
        TemplateMethod.OrderProcess orderDelivery = new TemplateMethod.OrderDelivery();
        orderDelivery.processOrder();
    }
}
