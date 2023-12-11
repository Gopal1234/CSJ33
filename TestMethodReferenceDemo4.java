package method.reference.demos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class TestMethodReferenceDemo4 {

	public static void main(String[] args) {
List<String> list=Arrays.asList("A","T","XYZ");
//This is the exmaple of annonymus object
/*Consumer<String> con=new Consumer<String>() {

	@Override
	public void accept(String t) {

System.out.println(t);
		
	}
};*/
//This is using lambda expression
/*Consumer<String> con=(String t)-> {

System.out.println(t);
		
	};*/

list.forEach(con);
//using method reference we can  iterate a object from collection
list.forEach(System.out::println);		
		
		
		

	}

}
