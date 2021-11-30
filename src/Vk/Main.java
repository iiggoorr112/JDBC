package Vk;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String userName = "Root";
        String password = "6045564";
        String connectionUrl = "jdbc:mysql://localhost:3306";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection dbConnection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/igor","root","6045564");
             Statement stmt = dbConnection.createStatement()){
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS Vk(VkId int NOT NULL AUTO_INCREMENT PRIMARY KEY,\n" +
                    "   Name varchar(40),\n" +
                    "   pssword int,\n" +
                    " Vf varchar(40))");
            stmt.executeUpdate("INSERT Into users  SET name='dima', pssword='381' ");
            }
        }
    }
