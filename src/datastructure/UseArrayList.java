package datastructure;


import databases.ConnectToSqlDB;
import databases.User;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) throws SQLException {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */

		String url = "jdbc:mysql://localhost:3306/pnt?serverTimezone=UTC";
		String userID = "root";
		String password = "abcd1234";

		Connection connection = null;
		Statement statement = null;


		List<String> exampleArrayList = new ArrayList<>(5);

		exampleArrayList.add("5");
		exampleArrayList.add("10");
		exampleArrayList.add("20");
		exampleArrayList.add("40");
		exampleArrayList.add("50");

		// Retrieving data using For Each

		System.out.println("The ArrayList items by using For Each:");
		for (String item : exampleArrayList)
			System.out.println(item);

		// Retrieving data using iterator

		System.out.println("The ArrayList items by using iterator interface:");

		Iterator iterator = exampleArrayList.iterator();

		while (iterator.hasNext())
			System.out.println(iterator.next());

		//exampleArrayList.remove(Integer.valueOf(40));
		System.out.println("Removed 40. Now the ArrayList content is:");
		for (String item : exampleArrayList)
			System.out.println(item);

		System.out.println("Retrieving element at index 2: " + exampleArrayList.get(2));


		System.out.println("----------------------------");


		try {
			connection = DriverManager.getConnection(url, userID, password);
			statement = connection.createStatement();
			//String query = "insert into employee1 (id, salary) values (123,1000);";
			//statement.execute(query);
			ConnectToSqlDB connect = new ConnectToSqlDB();
			connect.insertDataFromStringArrayListToMySql(exampleArrayList,"tab_nam","data");

		} catch (SQLException ex) {
			ex.printStackTrace();
		}

		connection.close();
		statement.close();


	}

}


	




