package pr.pr6;

public class TemplateMethod {

    abstract static class OrderProcess {
        public final void processOrder() {
            confirmOrder();
            packOrder();
            deliverOrder();
        }
        protected abstract void confirmOrder();
        protected abstract void packOrder();
        protected abstract void deliverOrder();
    }

    static class OrderConfirmation extends OrderProcess {
        protected void confirmOrder() {
            System.out.println("Заказ подтверждён.");
        }

        protected void packOrder() {
            System.out.println("Упаковка обрабатывается.");
        }

        protected void deliverOrder() {
            System.out.println("Доставка обрабатывается.");
        }
    }

    static class OrderPackaging extends OrderProcess {

        protected void confirmOrder() {
            System.out.println("Подтверждение заказа не нужно во время упаковки.");
        }

        protected void packOrder() {
            System.out.println("Заказ упакован.");
        }

        protected void deliverOrder() {
            System.out.println("Доставка обрабатывается.");
        }
    }

    static class OrderDelivery extends OrderProcess {

        protected void confirmOrder() {
            System.out.println("Подтверждение заказа не нужно во время доставки.");
        }

        protected void packOrder() {
            System.out.println("Упаковки заказа не требуется во время доставки.");
        }

        protected void deliverOrder() {
            System.out.println("Заказ доставлен.");
        }
    }
}
