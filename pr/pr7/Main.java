package pr.pr7;

public class Main {
    public static void main(String[] args) {
        Builder.DocumentBuilder builder = new Builder.DocumentBuilder();

        Builder.Document document = builder
                .addTitle("Мой первый документ")
                .addSection("Вступление", "Это вступление документа.")
                .addSection("Содержание", "Это содержание документа.")
                .addConclusion("Это заключение документа.")
                .build();

        document.showDocument();
    }
}
