package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
//		(1)Loading the driver classes
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
//		(2)Create the connection
		
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","april","april");
		
//		(3)Create the statement
		
		Statement stmt = conn.createStatement();
		
//		(4)Exceute the satement
		
		stmt.execute("create table product(pid number,pname varchar2(10),pprice number,ptype varchar2(10))");
		
//		(5)Close the connections
		
		conn.close();
		
		System.out.println("table is created successfully");
	}

}
