package enumpack;

import java.util.Scanner;

enum UserStatus
{
	ACTIVATED, DEACTIVATED;
}

class User
{
	private String userName;
	private String userPassword;
	private  UserStatus status;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public UserStatus getStatus() {
		return status;
	}
	public void setStatus(UserStatus status) {
		this.status = status;
	}
	
	
	
}




public class TestEnumDemo1 {

	public static void main(String[] args) {
		try
		{
Scanner s=new Scanner(System.in);
System.out.println("enter user name");
String uname=s.next();
System.out.println("enter user password");
String pw=s.next();
//reading enum value as a string
System.out.println("enter user status either ACTIVATED or DEACTIVATED");
String status1=s.next();

//converting string into enum type
    UserStatus status=   UserStatus.valueOf(status1);
    
    //creating object of User
    User u=new User();
    u.setUserName(uname);
    u.setUserPassword(pw);
    //setting enum value with user object by calling setStatus()
    u.setStatus(status);
    System.out.println(u.getUserName() + " "+u.getUserPassword()+ " "+u.getStatus());
		}catch(Exception e)
		{
			System.out.println("no valid constant");
		}
		
		

	}

}
