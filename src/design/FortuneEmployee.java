package design;

import databases.ConnectToSqlDB;

import java.io.IOException;
import java.sql.SQLException;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args)  throws SQLException, IOException, ClassNotFoundException {
		EmployeeInfo employee1 = new EmployeeInfo(123,"John",35,1000.0);
		//method inherited from GeneralEmployees class (Single inheritance)
		employee1.breakTime();
		employee1.freeRide();
		employee1.napTime();
		// Methods of EmployeeInfo class to calculate bonus ...
		employee1.calculateEmployeeBonus(2,1000.0);
		employee1.calculateEmployeePension(1000.0);
		employee1.getDeptName();

		NewEmployee employee2 = new NewEmployee(131,"nichole",25,1000.0);
		// use of method overriding....
		employee2.getDeptName();
		employee2.getEmpAddress();

		//using casting because employee3 is GeneralEmployees type.
		GeneralEmployees employee3 = new NewEmployee(132,"sarah",26,1000.0);
		((NewEmployee) employee3).getEmpAddress();
/*
		ConnectToSqlDB connect = new ConnectToSqlDB();
		connect.insertProfileToSqlTable("employees","column1","column2");

*/

	}

}
