package pr.pr5;
import java.util.ArrayList;
import java.util.List;

public class ObserverClass {

    public interface Observer {
        void update(String message);
    }

    public interface Subject {
        void subscribe(Observer observer);
        void unsubscribe(Observer observer);
        void notifyObservers(String message);
    }

    public static class Chat implements Subject {
        private List<Observer> observers = new ArrayList<>();
        private String chatName;

        public Chat(String chatName) {
            this.chatName = chatName;
        }

        public void subscribe(Observer observer) {
            observers.add(observer);
        }

        public void unsubscribe(Observer observer) {
            observers.remove(observer);
        }

        public void notifyObservers(String message) {
            for (Observer observer : observers) {
                observer.update("Новое сообщение в чате " + chatName + ": " + message);
            }
        }

        public void sendMessage(String message) {
            System.out.println("Отправка сообщения в чат " + chatName + ": " + message);
            notifyObservers(message);
        }
    }

    public static class User implements Observer {

        private String username;

        public User(String username) {
            this.username = username;
        }

        public void update(String message) {
            System.out.println(username + " получено сообщение: " + message);
        }
    }

}
