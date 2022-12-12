/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Database;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author srikr
 */
public class DatabaseConnection {
    Connection con = null;
    public static Connection getCon()
    {
        try
        {
            String user="root";
            String pass="srikrishna";
            String sqlconn="jdbc:mysql://localhost:3306/fooddeliver?zeroDateTimeBehavior=CONVERT_TO_NULL";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(sqlconn,user,pass);
            return con;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        return null;
    }
}
