/* Connect.java   */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

    public static void main(String[] args) {

        @SuppressWarnings("unused")
		Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/example","root","sesame");
            System.out.println("Connected OK");

        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("Error code: " + ex.getErrorCode());
        }
    }
}
