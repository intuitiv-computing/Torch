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
            fio.readFile();
        } catch(FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    public void connectToAndQueryDatabase(String username, String password) {
    try {
        Connection con = DriverManager.getConnection(
                "127.0.0.1",
                "carbonstudios",
                "fileinputstream-here");
    } catch(SQLException e) {
        e.printStackTrace();
    }}
}
