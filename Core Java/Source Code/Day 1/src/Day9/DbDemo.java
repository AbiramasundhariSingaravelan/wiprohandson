package Day9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DbDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		//Register the driver class
		Class.forName("com.mysql.cj.jdbc.driver");
		//Creating a Connection
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jfsbatch","root","arthi");
		//Create a Statement
		Statement st=c.createStatement();
		//Execute the Query
		ResultSet rs=st.executeQuery("select * from student");
		while(rs.next())
		{
			System.out.println("ID: "+rs.getInt(2)+" NAME: "+rs.getString(3)+" MARKS: "+rs.getInt(4)+" ADDRESS: "+rs.getString(5));
		}
		//close the connection
		c.close();
	}

}
