package database;

import java.sql.*;

public class importDB {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/siakad";
        String username = "postgres";
        String password = "admin";

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM people");

            while (rs.next()) {
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String address = rs.getString("address");
                System.out.println(name + ", " + age + ", " + address);
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
