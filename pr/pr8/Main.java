package pr.pr8;

public class Main {
    public static void main(String[] args) {
        MementoClass.DrawingManager manager = new MementoClass.DrawingManager();

        manager.addShape("Круг");
        manager.addShape("Квадрат");
        manager.showDrawing();

        manager.save();

        manager.addShape("Треугольник");
        manager.showDrawing();

        manager.save();

        manager.removeShape("Квадрат");
        manager.showDrawing();

        manager.restore(1);
        manager.showDrawing();

        manager.restore(0);
        manager.showDrawing();
    }
}
