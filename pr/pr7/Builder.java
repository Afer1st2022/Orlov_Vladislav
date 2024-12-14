package pr.pr7;

import java.util.ArrayList;
import java.util.List;

public class Builder {

    public static class Document {
        private final List<String> sections;

        public Document() {
            sections = new ArrayList<>();
        }

        public void addSection(String section) {
            sections.add(section);
        }

        public void showDocument() {
            System.out.println("Содержимое документа:");
            for (String section : sections) {
                System.out.println(section);
            }
        }
    }

    public static class DocumentBuilder {
        private final Document document;

        public DocumentBuilder() {
            document = new Document();
        }

        public DocumentBuilder addTitle(String title) {
            document.addSection("Заголовок: " + title);
            return this;
        }

        public DocumentBuilder addSection(String sectionTitle, String content) {
            document.addSection("Раздел: " + sectionTitle);
            document.addSection(content);
            return this;
        }

        public DocumentBuilder addConclusion(String conclusion) {
            document.addSection("Заключение: " + conclusion);
            return this;
        }

        public Document build() {
            return document;
        }
    }

}
