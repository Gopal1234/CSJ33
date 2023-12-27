import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import utility.JdbcUtil;

public class TewstJdbcDemo2 {

	public static void main(String[] args) throws SQLException {
//update  phone and address customerInfo table 
//first we will estabilish the connection 
	Connection con=	JdbcUtil.getConnectWithDB();
	//Now we can able to create the object of Statement interface
	 Statement stmt= con.createStatement();
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter id to update");
	 int id=s.nextInt();
	 System.out.println("enter new phone number to update");
	 long ph=s.nextLong();
	 System.out.println("enter new address to update");
	 String addr=s.next();
	  String updateQuery=
"update customerinfo set cust_phone="+ph+", cust_address='"+addr+"' where cust_id="+id+"";
	int status= stmt.executeUpdate(updateQuery);
	 if(status>0)
	 {
		 System.out.println("data updated successfully..");
	 }else
	 {
		 System.out.println("not updated....");
	 }
	
	

	}

}
