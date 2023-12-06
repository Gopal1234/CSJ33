package function.demos;

import java.util.function.Supplier;

public class TestSupplierExample1 {

	public static void main(String[] args) {
//R get()
Supplier<String> supplier=()->{
	return "welcome to cyber success";
};
		
String msg=	supplier.get();	
		System.out.println(msg);
		
		
		

	}

}
