import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestJdbcDemo1 {

	public static void main(String[] args) {
		//we need driver to loaded or registered
//Class static 
//forName(String compiled className)throws ClassNotFoundException 		
		
		try
		{
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("My driver loaded");
		//static Connection getConnection(String url, String un,String pw)throws SqlException
	Connection con=	DriverManager.
		getConnection("jdbc:mysql://localhost:3306/CSJ33DB", "root", "root");
		System.out.println("connection estabilished");
		/*
		 * Connection is an interface ,which resides inside 
		 * java.sql packagae
		 * 
		 * This is provides a methods by which we can
		 *  create the object of Statement
		 * ,PreparedStatement and CallableStatement
		 * 
		 * 
		 * It also provides methods by which 
		 * we can commit and rollback transaction
		 * in database
		 * by invoke,
		 * setAutoCommit(boolean value)
		 * rollback()
		 * 
		 * by using this connection object we can close the 
		 * connection
		 * by invoke close() 
		 */
		//I want to create one table in the database
		
	//String tableSqlQuery="create table CustomerInfo(cust_id int primary key, cust_name varchar(40),cust_phone bigint,cust_address varchar(40), cust_email varchar(40))";	
		//I have to create the object of Statement
	//by invoking method of Connection
	// Statement createStatement();
	Statement stmt=	 con.createStatement();		
		//int executeUpdate(String sqlQuery)throws SQLException
	//this method is used for DDL, insert , update, delete
/*String choice=null;
	
Scanner sc=new Scanner(System.in);
	do
	{
	System.out.println("enter customer name");
	String name=sc.next();
	System.out.println("enter customer phone");
	long phone=sc.nextLong();
	System.out.println("enter customer id");
	int cid=sc.nextInt();
	System.out.println("enter customer address");
	String address=sc.next();
	System.out.println("enter email id");
	String mailId=sc.next();*/
	Reader readerObj=new FileReader("./src/custInfo.txt");
	BufferedReader br=new BufferedReader(readerObj);
	//String readLine()throws IOException
	 String line= null;
	 while((line=br.readLine())!=null)
	 {
		// 111,Ravi,12343466,kolkata,ravi@gmail.com
		 System.out.println(line);
	String[] tokens=	  line.split(",");
		 int cid=Integer.parseInt(tokens[0]);
		 String name=tokens[1];
		 long phone=Long.parseLong(tokens[2]);
		 String address=tokens[3];
		 String mailId=tokens[4];
		 
		 String insertQuery="insert into customerinfo values("+cid+""+",'"+name+"'"+","+phone+""+",'"+address+"'"+",'"+mailId+"')";		 
		 stmt.executeUpdate(insertQuery);  
		 System.out.println(name+ " "+"registered in our database");
	 }


	
//int status=	stmt.executeUpdate(insertQuery);
	
	
	/*System.out.println("enter your choice YES/yes");
	choice=sc.next();
		
		System.out.println("congratulations!!!"+ " "+name+ " "+"registered successfully");
	}while(!(choice.equalsIgnoreCase("NO")));	*/
		}catch(ClassNotFoundException | SQLException |IOException e)
		{
			System.out.println(e);
		}
	}

}
