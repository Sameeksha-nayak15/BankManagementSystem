package bank.management.system;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {

    Connection c;
    Statement s;
    public Conn() {
        try {
             //Load MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");
           c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem", "root", "password");
            s = c.createStatement();

            System.out.println("Database Connected Successfully");
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
