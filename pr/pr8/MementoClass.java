package pr.pr8;

import java.util.ArrayList;
import java.util.List;

public class MementoClass {

    public static class Drawing {
        private final List<String> shapes;

        public Drawing() {
            shapes = new ArrayList<>();
        }

        public void addShape(String shape) {
            shapes.add(shape);
        }

        public void removeShape(String shape) {
            shapes.remove(shape);
        }

        public List<String> getShapes() {
            return shapes;
        }

        public void showDrawing() {
            System.out.println("Текущее изображение: ");
            for (String shape : shapes) {
                System.out.println("- " + shape);
            }
        }
    }

    public static class Memento {

        private final List<String> shapes;

        public Memento(List<String> shapes) {
            this.shapes = shapes;
        }

        public List<String> getShapes() {
            return shapes;
        }
    }

    public static class DrawingManager {
        private Drawing drawing;
        private final List<Memento> mementos;

        public DrawingManager() {
            drawing = new Drawing();
            mementos = new ArrayList<>();
        }

        public void addShape(String shape) {
            drawing.addShape(shape);
        }

        public void removeShape(String shape) {
            drawing.removeShape(shape);
        }

        public Memento save() {
            Memento memento = new Memento(new ArrayList<>(drawing.getShapes()));
            mementos.add(memento);
            return memento;
        }

        public void restore(int index) {
            if (index >= 0 && index < mementos.size()) {
                Memento memento = mementos.get(index);
                drawing = new Drawing();
                for (String shape : memento.getShapes()) {
                    drawing.addShape(shape);
                }
            } else {
                System.out.println("Неправильный индекс");
            }
        }

        public void showDrawing() {
            drawing.showDrawing();
        }
    }

}
