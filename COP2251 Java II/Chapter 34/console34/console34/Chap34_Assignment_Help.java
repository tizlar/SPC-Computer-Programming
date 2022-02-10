package jdbc;

import java.sql.*;
import java.util.Scanner;

public class Chap34_Assignment_Help {
  public static void main(String[] args) throws SQLException, ClassNotFoundException {

    // Connect to a database
    Connection connection = DriverManager.getConnection ("jdbc:mysql://localhost/pcparts", "root", "sesame");
    System.out.println("Database connected");

    // Create a statement
    Statement statement = connection.createStatement();

    Scanner input = new Scanner(System.in);
    // construct the query from user input
    String query = "select ";
    System.out.println("Enter the desired fields separated by commas");
    String fields = input.nextLine();
    query += fields;
    query += " from parts ";
    System.out.println("Does query need a WHERE clause (y/n)?");
    String needWhere = input.nextLine();
    if(needWhere.equals("y")) {
    	System.out.println("Enter (complete) WHERE clause");
    	String where = input.nextLine();
    	query += where + " ";
    }
    System.out.println("Does query need an ORDER BY clause (y/n)?");
    String needOrder = input.nextLine();
    if(needOrder.equals("y")) {
    	System.out.println("Enter (complete) ORDER BY clause");
    	String order = input.nextLine();
    	query += order;
    }
    query += ";";
    System.out.println(query);
    // Execute a statement
    ResultSet resultSet = statement.executeQuery(query);
    
    ResultSetMetaData rsMetaData = resultSet.getMetaData();
    for (int i = 1; i <= rsMetaData.getColumnCount(); i++)
      System.out.printf("%-12s\t", rsMetaData.getColumnName(i).toUpperCase());
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
