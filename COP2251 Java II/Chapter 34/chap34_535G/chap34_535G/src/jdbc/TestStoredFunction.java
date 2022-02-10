//  SQLVehicle.java

package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class TestStoredFunction {

    public static void main(String[] args) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javabook", "root", "sesame");
            System.out.println("Database connected");
        } catch (SQLException e) {
            System.out.println("Cannot connect");
        }
        try {
        	Scanner input = new Scanner(System.in);
        	// select * from student to for valid names to try
        	// try Jacob Smith / Toni Peterson / Joy Kennedy
        	System.out.print("Enter student name to find ");
        	String[] name = input.nextLine().split(" ");
            java.sql.CallableStatement cs = conn.prepareCall("{? = call studentFound(?,?)}");
            // register parameters for the call
            cs.registerOutParameter(1,Types.INTEGER);
            cs.setString(2, name[0]);
            cs.setString(3, name[1]);
            cs.execute();
            if(cs.getInt(1) > 0) {
            	System.out.println("Found " + cs.getInt(1) + " student named " + name[0] + " " + name[1]);
            }
        } catch (SQLException ex) {
            // handle the error (rather badly)
            System.out.println("OOPS...");
            System.out.println(ex.getMessage());
        }
    }
}
