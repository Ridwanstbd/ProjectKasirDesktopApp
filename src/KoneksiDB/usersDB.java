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
public class usersDB {
    String user = "root";
    String pass = "";
    private ResultSet rs = null;
    private Connection cn = null;
    private Statement st = null;
    
    public static String PathReport = System.getProperty("user.dir")+"/src/report/report1.jasper";
    private static Connection koneksi;
    public static Connection getKoneksi(){
    if (koneksi==null){
        try {
            String url = new String();
            String user = new String();
            String password = new String();
            url = "jdbc:mysql://localhost:3306/cashier-selo-hardware";
            user = "root";
            password = "";
            koneksi = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println("Error membuat Koneksi: "+e.getMessage());            
        }
        }
    return koneksi;
    }    
}
