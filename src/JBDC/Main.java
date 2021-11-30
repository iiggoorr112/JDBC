package JBDC;

import java.sql.*;
import java.text.ParseException;

import static javax.swing.plaf.synth.Region.TABLE;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String userName = "Root";
        String password = "6045564";
        String connectionUrl = "jdbc:mysql://localhost:3306";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection dbConnection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/igor","root","6045564");
              Statement stmt = dbConnection.createStatement()){
            stmt.execute("drop table Users");
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS Users(UserstId int NOT NULL AUTO_INCREMENT PRIMARY KEY,\n" +
                    "   Name varchar(40),\n" +
                    "   pssword int)");
            stmt.executeUpdate("insert into users (Name,pssword) values('max','123')");
            stmt.executeUpdate("INSERT Into users  SET name='divan', pssword='381' ");
            stmt.executeUpdate("INSERT Into users  SET name='diva', pssword='332' ");
            stmt.executeUpdate("INSERT Into users  SET name='di', pssword='269' ");
            stmt.executeUpdate("INSERT Into users  SET name='ivan', pssword='125' ");
            String sd ="1";
           ResultSet rs =stmt.executeQuery("select * from Users where UserstId ");
            while (rs.next()){
               System.out.println("user name: "+ rs.getString("name"));
               System.out.println("user password: "+ rs.getString("pssword"));
           }
        }
    }
}