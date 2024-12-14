package pr.pr12;

public class Main {
    public static void main(String[] args) {
        Composite.FileComponent file1 = new Composite.File("File1.txt");
        Composite.FileComponent file2 = new Composite.File("File2.txt");
        Composite.FileComponent file3 = new Composite.File("File3.txt");

        Composite.Directory directory1 = new Composite.Directory("Директория1");
        directory1.addComponent(file1);
        directory1.addComponent(file2);

        Composite.Directory directory2 = new Composite.Directory("Директория2");
        directory2.addComponent(file3);

        Composite.Directory rootDirectory = new Composite.Directory("Корневая директория");
        rootDirectory.addComponent(directory1);
        rootDirectory.addComponent(directory2);

        rootDirectory.showDetails("");
    }
}
