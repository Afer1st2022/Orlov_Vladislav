package pr.pr4;

public class Main {
    public static void main(String[] args) {
        Adapter.MySQLDatabase mySQLDatabase = new Adapter.MySQLDatabase();
        Adapter.PostgreSQLDatabase postgreSQLDatabase = new Adapter.PostgreSQLDatabase();
        Adapter.DatabaseAdapter adapter = new Adapter.DatabaseAdapter(postgreSQLDatabase);
        Adapter.DataTransfer dataTransfer = new Adapter.DataTransfer(mySQLDatabase, adapter);
        dataTransfer.transferData();
    }
}
