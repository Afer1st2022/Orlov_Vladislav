package pr.pr12;

import java.util.ArrayList;
import java.util.List;

public class Composite {

    public interface FileComponent {
        void showDetails(String indent);
    }

    public static class File implements FileComponent {
        private final String name;

        public File(String name) {
            this.name = name;
        }

        public void showDetails(String indent) {
            System.out.println(indent + "Файл: " + name);
        }
    }

    public static class Directory implements FileComponent {
        private final String name;
        private final List<FileComponent> components;

        public Directory(String name) {
            this.name = name;
            components = new ArrayList<>();
        }

        public void addComponent(FileComponent component) {
            components.add(component);
        }

        public void removeComponent(FileComponent component) {
            components.remove(component);
        }

        public void showDetails(String indent) {
            System.out.println(indent + "Директория: " + name);
            for (FileComponent component : components) {
                component.showDetails(indent + "  ");
            }
        }
    }

}
