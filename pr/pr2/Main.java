package pr.pr2;

public class Main {
    public static void main(String[] args) {
        AbstractFabric.FurnitureFactory classicFactory = new AbstractFabric.ClassicFurnitureFactory();
        AbstractFabric.Chair classicChair = classicFactory.createChair();
        AbstractFabric.Table classicTable = classicFactory.createTable();
        AbstractFabric.Sofa classicSofa = classicFactory.createSofa();

        classicChair.sitOn();
        classicTable.use();
        classicSofa.lieOn();

        AbstractFabric.FurnitureFactory modernFactory = new AbstractFabric.ModernFurnitureFactory();
        AbstractFabric.Chair modernChair = modernFactory.createChair();
        AbstractFabric.Table modernTable = modernFactory.createTable();
        AbstractFabric.Sofa modernSofa = modernFactory.createSofa();

        modernChair.sitOn();
        modernTable.use();
        modernSofa.lieOn();

        // Создание минималистичной мебели
        AbstractFabric.FurnitureFactory minimalistFactory = new AbstractFabric.MinimalistFurnitureFactory();
        AbstractFabric.Chair minimalistChair = minimalistFactory.createChair();
        AbstractFabric.Table minimalistTable = minimalistFactory.createTable();
        AbstractFabric.Sofa minimalistSofa = minimalistFactory.createSofa();

        minimalistChair.sitOn();
        minimalistTable.use();
        minimalistSofa.lieOn();
    }
}