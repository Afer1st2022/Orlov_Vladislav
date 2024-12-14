package pr.pr11;

import java.util.ArrayList;
import java.util.List;

public class PrototypeClass {
    public interface Prototype {
        Prototype clone();
    }

    public static class Task implements Prototype {
        private final String title;
        private final String description;
        private final int priority;

        public Task(String title, String description, int priority) {
            this.title = title;
            this.description = description;
            this.priority = priority;
        }

        public String getTitle() {
            return title;
        }

        public String getDescription() {
            return description;
        }

        public int getPriority() {
            return priority;
        }

        public Prototype clone() {
            return new Task(this.title, this.description, this.priority);
        }

        public String toString() {
            return "Задача{" +
                    "Наименование: '" + title + '\'' +
                    ",описание: '" + description + '\'' +
                    ", приоритет: " + priority +
                    '}';
        }
    }

    public static class TaskManager {
        private final List<Prototype> tasks;

        public TaskManager() {
            tasks = new ArrayList<>();
        }

        public void addTask(Prototype task) {
            tasks.add(task);
        }

        public void showTasks() {
            System.out.println("Задачи:");
            for (Prototype task : tasks) {
                System.out.println(task);
            }
        }

        public Prototype cloneTask(int index) {
            if (index < 0 || index >= tasks.size()) {
                throw new IndexOutOfBoundsException("Индекс задачи вышел за пределы");
            }
            return tasks.get(index).clone();
        }
    }

}
