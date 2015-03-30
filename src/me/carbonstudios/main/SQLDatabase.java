package me.carbonstudios.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLDatabase {
    public void getFile() {
        try {
            FileInputStream fio = new FileInputStream("sql.dat");
            fio.read();
        } catch(FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    public void connectToAndQueryDatabase(String username, String password) {
    try {
        Connection con = DriverManager.getConnection(
                "hostname-goes-here",
                "carbonstudios",
                "password-not-in-public-view-please-see-sam-for-details");
    } catch(SQLException e) {
        e.printStackTrace();
    }}
}
