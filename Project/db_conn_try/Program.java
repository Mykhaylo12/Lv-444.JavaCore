import java.sql.*;

public class Program
{
	public static void main (String[] args){
	
	try{
		Class.forName("org.sqlite.JDBC");
		Connection co =DriverManager.getConnection(
		
		"jdbc:sqlite:sales1022.db");
		
		System.out.println("Connected");	
	}
	catch(Exception e){
		System.out.println(e.getMessage());	
	}

	}
}
