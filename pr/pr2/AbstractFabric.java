package pr.pr2;

public class AbstractFabric {
    public interface Chair {
        void sitOn();
    }

    public interface Table {
        void use();
    }

    public interface Sofa {
        void lieOn();
    }

    public static class ClassicChair implements Chair {
        public void sitOn() {
            System.out.println("Сидеть на классическом стуле.");
        }
    }

    public static class ModernChair implements Chair {
        public void sitOn() {
            System.out.println("Сидеть на современном стуле.");
        }
    }

    public static class MinimalistChair implements Chair {
        public void sitOn() {
            System.out.println("Сидеть на минималистическом стуле.");
        }
    }

    public static class ClassicTable implements Table {
        public void use() {
            System.out.println("Использовать классический стол.");
        }
    }

    public static class ModernTable implements Table {
        public void use() {
            System.out.println("Использовать современный стол.");
        }
    }

    public static class MinimalistTable implements Table {
        public void use() {
            System.out.println("Использовать минималистичный стол.");
        }
    }

    public static class ClassicSofa implements Sofa {
        public void lieOn() {
            System.out.println("Лежать на классическом диване.");
        }
    }

    public static class ModernSofa implements Sofa {
        public void lieOn() {
            System.out.println("Лежать на современном диване.");
        }
    }

    public static class MinimalistSofa implements Sofa {
        public void lieOn() {
            System.out.println("Лежать на минималистичном диване.");
        }
    }

    public abstract static class FurnitureFactory {
        public abstract Chair createChair();
        public abstract Table createTable();
        public abstract Sofa createSofa();
    }

    public static class ClassicFurnitureFactory extends FurnitureFactory {
        public Chair createChair() {
            return new ClassicChair();
        }

        public Table createTable() {
            return new ClassicTable();
        }

        public Sofa createSofa() {
            return new ClassicSofa();
        }
    }

    public static class ModernFurnitureFactory extends FurnitureFactory {
        public Chair createChair() {
            return new ModernChair();
        }

        public Table createTable() {
            return new ModernTable();
        }

        public Sofa createSofa() {
            return new ModernSofa();
        }
    }

    public static class MinimalistFurnitureFactory extends FurnitureFactory {
        public Chair createChair() {
            return new MinimalistChair();
        }

        public Table createTable() {
            return new MinimalistTable();
        }

        public Sofa createSofa() {
            return new MinimalistSofa();
        }
    }

}
