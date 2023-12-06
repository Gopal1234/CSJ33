package function.demos;

import java.util.function.Consumer;

public class TestConsumerExample1 {

	public static void main(String[] args) {

Consumer<Integer> con=(value)->
{
	System.out.println("The square of number is"+ " "+value*value);
};
		
con.accept(100);		
		

	}

}
