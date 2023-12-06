package function.demos;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class TestFunctionExample2 {

	public static void main(String[] args) {

Function<List<String>, String> fun1=(param)->
{
	
	int maleCounter=0;
	int femaleCounter=0;
	for(int i=0; i<param.size(); i++)
	{
		if(param.get(i).startsWith("Mr."))
		{
			maleCounter++;
			}
		else
		{
			femaleCounter++;
		}
		
	}
	return "The number of male candidate is " +maleCounter+ " :"+
	"The number of female candidate is"+" "+femaleCounter;
	
};
List<String> list=new ArrayList();

list.add("Mr. A");		
list.add("Mrs. B");	
list.add("Mr. T");	
list.add("Mr. C");	
list.add("Mrs. E");

String msg=fun1.apply(list);
System.out.println(msg);
		
		
		
		

	}

}
