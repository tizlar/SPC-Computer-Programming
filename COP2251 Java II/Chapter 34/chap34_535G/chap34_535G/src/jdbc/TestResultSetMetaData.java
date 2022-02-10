package jdbc;

import java.sql.*;

public class TestResultSetMetaData {
  public static void main(String[] args)
      throws SQLException, ClassNotFoundException {

    // Connect to a database
    Connection connection = DriverManager.getConnection
      ("jdbc:mysql://localhost/javabook", "root", "sesame");
    System.out.println("Database connected");

    // Create a statement
    Statement statement = connection.createStatement();

    // Execute a statement
    ResultSet resultSet = statement.executeQuery("select ssn,courseId from Enrollment");
    
    ResultSetMetaData rsMetaData = resultSet.getMetaData();
    for (int i = 1; i <= rsMetaData.getColumnCount(); i++)
      System.out.printf("%-12s\t", rsMetaData.getColumnName(i));
    System.out.println();
    
    // Iterate through the result and print the student names
    while (resultSet.next()) {
      for (int i = 1; i <= rsMetaData.getColumnCount(); i++)
        System.out.printf("%-12s\t", resultSet.getObject(i));
      System.out.println();
    }

    // Close the connection
    connection.close();
  }
}
