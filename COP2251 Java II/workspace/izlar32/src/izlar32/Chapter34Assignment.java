package izlar32;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Chapter34Assignment {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		 // Connect to a database
	    Connection conn = DriverManager.getConnection ("jdbc:mysql://localhost/example", "root", "sesame");
	    System.out.println("Database connected");
	    
		 // Create a statement object
		 Statement statement = conn.createStatement();
		
	    // new car 1
	    String updateSQL = "insert into product(vin, make, model, year, color, price) "
	    + "values('10000E','Toyota','Prius C', 2014, 'Black', 5000)";
	    statement.executeUpdate(updateSQL);
	    
	    // new car 2
	    String updateSQL2 = "insert into product(vin, make, model, year, color, price) "
	    + "values('10000F','Nissan','Frontier', 2006, 'Silver', 2000)";
	    
	    statement.executeUpdate(updateSQL2);
	    
	    Scanner input = new Scanner(System.in);
	   
	    // making a query from user input
	    String query = "select ";
	    System.out.println("Enter the desired fields separated by commas");
	    String fields = input.nextLine();
	    query += fields;
	    query += " from product ";
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
	    
	    // Execute the query
	    ResultSet resultSet = statement.executeQuery(query);
	    
	    // print out column names in all caps
	    ResultSetMetaData rsMetaData = resultSet.getMetaData();
	    for (int i = 1; i <= rsMetaData.getColumnCount(); i++)
	      System.out.printf("%-12s\t", rsMetaData.getColumnName(i).toUpperCase());
	    System.out.println();
	    
	    // Iterate through the result and print the products 
	    while (resultSet.next()) {
	      for (int i = 1; i <= rsMetaData.getColumnCount(); i++)
	        System.out.printf("%-12s\t", resultSet.getObject(i));
	      System.out.println();
	    }
	}

}
