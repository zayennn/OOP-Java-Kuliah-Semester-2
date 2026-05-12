package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class Main {
    static class Koneksi {
        private static final String url = "jdbc:mysql://localhost:3306/db_kuliah_java";
        private static final String user = "root";
        private static final String password = "";

        public static Connection getConnection() throws SQLException {
            return DriverManager.getConnection(url, user, password);
        }
    }

    public static void main(String[] args) {
        try (Connection connection = Koneksi.getConnection()) {
            String sql = "insert into mahasiswa (id, name, nim, nilai) values (?, ?, ?, ?)";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, 1);

        } catch (SQLException ex) {

        }
    }
}