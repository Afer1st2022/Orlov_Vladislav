package pr.pr5;

public class Main {
    public static void main(String[] args) {
        ObserverClass.Chat chat = new ObserverClass.Chat("Главный");
        ObserverClass.User user1 = new ObserverClass.User("Виктор");
        ObserverClass.User user2 = new ObserverClass.User("Юлия");
        chat.sendMessage("Всем привет!");
        chat.subscribe(user1);
        chat.subscribe(user2);
        chat.sendMessage("Как у вас дела?");
        chat.unsubscribe(user2);
        chat.sendMessage("Всем пока!");
    }

}
