package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			//create connection
			
		 Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mydatabase","root","root");
		 
		   //create statement	
		 
		 Statement mystmt=mycon.createStatement();
		 
		  //query create
		 ResultSet rs=mystmt.executeQuery("select * from Employee");
		 
		 while(rs.next())
		 {
			 System.out.println(rs.getNString("empname")+""+rs.getNString("emprole"));
		 }
		   
		}catch(Exception e)
		{
		  e.printStackTrace();	
		}

	} 

}
