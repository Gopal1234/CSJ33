import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import utility.JdbcUtil;

public class TestJdbcDemo3 {

	public static void main(String[] args) throws SQLException {
//first we need to esatbilish connection
	Connection con=	JdbcUtil.getConnectWithDB();
  Statement stmt=  con.createStatement();
  ResultSet rs= stmt.executeQuery("select * from customerinfo");
System.out.println(rs);
while(rs.next())
{
 int id=rs.getInt(1);
 String name=rs.getString(2);
 long ph=rs.getLong(3);
 String addr=rs.getString(4);
 String email=rs.getString(5);
 System.out.println(id+ " "+name+" "+ph+ " "+addr+ " "+email);
 
}
  //based on customer id i need to get entire details of customer
Scanner sc=new Scanner(System.in);
System.out.println("Enter the customer id to search");
int id=sc.nextInt();
ResultSet rs2=stmt.executeQuery("select * from customerInfo where cust_id="+id+"");
if(rs2.next())
{
 int id1=rs2.getInt(1);
 String name=rs2.getString(2);
 long ph=rs2.getLong(3);
 String addr=rs2.getString(4);
 String email=rs2.getString(5);
 System.out.println(id1+ " "+name+" "+ph+ " "+addr+ " "+email);
 
}
//count the number of customer in the system
/*
 * count(col)
 * min(col)
 * max(col)
 * avg
 * sum
 * 
 * 
 */

String countQuery="select count(cust_id) as total_cust_count from customerInfo";
 ResultSet rs3= stmt.executeQuery(countQuery);
 if(rs3.next())
 {
	 System.out.println("total customer in our system is"+ " "+rs3.getInt(1));
 }
 
 
//fetch the customer name with phone who are from kolkata
//fetch customer name with phone number who are kolkata and pune
//sort all cutomer records based on their name

  
  
  
	}

}
