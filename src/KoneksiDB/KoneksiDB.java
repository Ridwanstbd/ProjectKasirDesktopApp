/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KoneksiDB;
import java.sql.*;

/**
 *
 * @author Axioo
 */
public class KoneksiDB {
    private Connection koneksi;
    public static String PathReport = System.getProperty("user.dir")+"/src/report/report1.jasper";
    public Connection getKoneksi(){
        return koneksi;
    }
    public void koneksiDatabase() throws ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        try {
            String url = "jdbc:mysql://localhost:3306/cashier-selo-hardware";
            koneksi = DriverManager.getConnection(url,"root","");
        } catch (SQLException se) {
            System.out.println("Koneksi gagal ..."+ se.getMessage());
            System.exit(0);
        }
    }
}
