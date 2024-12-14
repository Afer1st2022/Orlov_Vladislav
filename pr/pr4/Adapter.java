package pr.pr4;

public class Adapter {

    public interface Database {
        void connect();
        void insertData(String data);
        String getData();
    }

    public static class MySQLDatabase implements Database {

        public void connect() {
            System.out.println("Подключение к MySQL...");
        }

        public void insertData(String data) {
            System.out.println("Добавление в MySQL: " + data);
        }

        public String getData() {
            return "Данные из MySQL";
        }
    }

    public static class PostgreSQLDatabase implements Database {

        public void connect() {
            System.out.println("Подключение к PostgreSQL...");
        }

        public void insertData(String data) {
            System.out.println("Добавление в PostgreSQL: " + data);
        }

        public String getData() {
            return "Данные из PostgreSQL";
        }
    }

    public static class DatabaseAdapter implements Database {
        private PostgreSQLDatabase postgreSQLDatabase;

        public DatabaseAdapter(PostgreSQLDatabase postgreSQLDatabase) {
            this.postgreSQLDatabase = postgreSQLDatabase;
        }

        public void connect() {
            postgreSQLDatabase.connect();
        }

        public void insertData(String data) {
            String adaptedData = "Добавление преобразованных данных: " + data;
            postgreSQLDatabase.insertData(adaptedData);
        }

        public String getData() {
            String data = postgreSQLDatabase.getData();
            return "Преобразованные данные: " + data;
        }
    }

    public static class DataTransfer {
        private Database sourceDatabase;
        private Database targetDatabase;

        public DataTransfer(Database sourceDatabase, Database targetDatabase) {
            this.sourceDatabase = sourceDatabase;
            this.targetDatabase = targetDatabase;
        }

        public void transferData() {
            sourceDatabase.connect();
            String data = sourceDatabase.getData();
            targetDatabase.connect();
            targetDatabase.insertData(data);
        }
    }


}
