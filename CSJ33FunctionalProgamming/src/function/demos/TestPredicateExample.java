package function.demos;

import java.util.function.Predicate;

public class TestPredicateExample {

	public static void main(String[] args) {

  /*
   * interface Predicate
   * {
   * public boolean test(T t);
   * }
   * 
   
   */
		//implementing test() method of Predicate using lambda exppression
		
Predicate<Integer> predicate=	(p1)-> {
		
		if(p1==100)
		{
			return true;
		}
		return false;
		
	};
	//calling test() method of Predicate interface
	boolean res=predicate.test(1002);
	//printing the result
	System.out.println(res);	
		
		
		

	}

}
