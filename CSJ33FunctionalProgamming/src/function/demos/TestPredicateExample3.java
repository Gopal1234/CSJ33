package function.demos;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TestPredicateExample3 {

	public static void main(String[] args) {

Predicate<List<String>> predicate=(users)->
{
String userName=users.get(0);
String password=users.get(1);
if(userName.equalsIgnoreCase("admin") && password.equals("admin@123"))
{
	return true;
}
return false;
	
};
List<String> listNames=new ArrayList();
listNames.add("admin");
listNames.add("admin@123");
if(predicate.test(listNames))
{
	System.out.println("success");
}
else
{
	System.out.println("fail");
}
	}

}
