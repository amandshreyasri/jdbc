package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class stu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			//create connection
			
		 Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mydatabase","root","root");
		 
		   //create statement	
		 
		 Statement mystmt=mycon.createStatement();
		 System.out.println("statement created");
		 
		 System.out.println("Inserting records into table...");
		 String sql = "INSERT INTO employee VALUES (508,'Chavla','fullstack',80000,'IBM')";
		 mystmt.executeUpdate(sql);
		 
		 System.out.println("Inserted records into the table...");
		}
		catch (Exception e) 
		{
	     e.printStackTrace();
	    }
	
	}
}
		 
		 
		 
		 
		 
		 

