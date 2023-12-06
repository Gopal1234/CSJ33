package function.demos;

import java.util.Scanner;
import java.util.function.Predicate;

public class TestPredicateExample2 {

	public static void main(String[] args) {

Predicate<String> predicate=(name)->
{
	
	if(name.equalsIgnoreCase("cyber"))
	{
		return true;
	}
	return false;
};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter user name");
		String uname=sc.next();
		/*	boolean status=	predicate.test(uname);
	if(status)
	{
		System.out.println("login success");
	}
	else
	{
		System.out.println("login failed");
	}*/
		
		if(predicate.test(uname))
		{
			System.out.println("login success");
		}
		else
		{
			System.out.println("login failed");
		}
			
		
		
		
		
		

	}

}
