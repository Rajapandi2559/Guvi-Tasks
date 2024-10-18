package task_12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_InsertDataToSQL {

	public static void main(String[] args) throws SQLException {
		
		String URL="jdbc:mysql://localhost:3306/Guvi_Task_12";
		String uname="root";
		String psw="Nagunashri@2559";
		
		// Creating connection to database
		Connection con=DriverManager.getConnection(URL,uname,psw);
		
		// Create statement object to create statement
		Statement statement=con.createStatement();
		String sql="insert into EmployeeInfo (empcode,empname,empage,esalary) values"
				    + "(101,'Jenny',25,10000),"
				    + "(102,'Jacky',30,20000),"
				    + "(103,'Joe',20,40000),"
				    + "(104,'John',40,80000),"
				    + "(105,'Shameer',25,90000)";
		
		// Execute the query
		statement.executeUpdate(sql);
		
		System.out.println("Data Inserted Successfully");
	}
}

