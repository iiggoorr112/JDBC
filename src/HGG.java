import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class HGG {
    public static void main(String[] args) throws InstantiationException,
            IllegalAccessException {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            System.out.println("driver loaded...");
        } catch (ClassNotFoundException e) {
            System.out.println("Error in loading the driver..." + e);
            System.exit(0);
        }
        try {
            Connection dbConnection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306","root","admin");
            System.out.println("Connection successful...");
            Statement stmt = dbConnection.createStatement();
            stmt.executeUpdate("create table Accounts ( name char(20) )");
        } catch (SQLException e) {
            System.out.println("database-ConnectionError: " + e);
            System.exit(0);
        }
    }
        }
