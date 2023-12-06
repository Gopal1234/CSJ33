package function.demos;

import java.util.function.Function;

public class TestFunctionExample1 {

	public static void main(String[] args) {
//
Function<Integer,String> fun=(param1)->
{
	return "product code is" + " "+param1;
};
		
 String msg= fun.apply(128);
		System.out.println(msg);
		
		
		

	}

}
