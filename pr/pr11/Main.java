package pr.pr11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PrototypeClass.TaskManager taskManager = new PrototypeClass.TaskManager();
        Scanner scanner = new Scanner(System.in);

        PrototypeClass.Task task1 = new PrototypeClass.Task("Задача 1", "Описание1", 1);
        PrototypeClass.Task task2 = new PrototypeClass.Task("Задача 2", "Описание2", 2);

        taskManager.addTask(task1);
        taskManager.addTask(task2);

        taskManager.showTasks();

        System.out.print("Напишите номер задачи для копирования: ");
        int index = scanner.nextInt();
        PrototypeClass.Prototype clonedTask = taskManager.cloneTask(index);

        System.out.println("Клонированная задача: " + clonedTask);

        taskManager.addTask(clonedTask);

        taskManager.showTasks();

        scanner.close();
    }
}
