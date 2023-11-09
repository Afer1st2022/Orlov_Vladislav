import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverAction;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Collection a = new Collection();
        Collection.Disk b = new Collection.Disk("DVD", "Films", "Green mile");
        a.addDisk(b);
        Collection.Disk c = new Collection.Disk("DVD", "Films", "Avengers");
        a.addDisk(c);
        System.out.println(a.toStringCollection());
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/collectiondb", "root", "Rootconfirmed!1");
        con.close();
        }
    }