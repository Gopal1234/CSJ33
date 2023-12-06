//demo program to implement an interface using anonymous inner class
/*
 * If an interface containing only single abstract method then that interface 
 * known
 * as functional interface or single method interface
 * 
 * Functional Interface is target type or return type for lambda expression and
 * method reference
 * 
 * in functional interface we can define methods using default keyword
 * 
 * 
 * To marks an interface an functional interface we can use
 * @FunctionalInterface annotation, which restrict the developer to define only
 * one abstract method inside interface
 * 
 * we can also define static method in functional interface
 * 
 * The abstract behavior of Functional interface can be implemented using lambda 
 * expression
 * 
 * 
 * 
 * 
 * 
 */
@FunctionalInterface
interface Validator
{
	//a-zA-z then that name will be valid
	//Ravi kumar
	//rav123
	boolean validateName(String name);
	default void displyMsg()
	
	{
		System.out.println("welcome");
	}
	
	
}
/*class A implements Validator
{
public  boolean validateName(String name)
	{
	String regEx="[A-Za-z\\s]{5,20}";
	if(name.matches(regEx))
	{
		return true;
	}
	return false;
	}
}*/
public class TestFunctionalInterfaceDemo1 {

	public static void main(String[] args) {

 //Validator v=new A();
	/*	Validator v=new Validator() {
			
			@Override
			public boolean validateName(String name) {
				String regEx="[A-Za-z\\s]{5,20}";
				if(name.matches(regEx))
				{
					return true;
				}
				return false;
			}
		};*/
		//implementing using lambda expression
		Validator v=( name)->{
			String regEx="[A-Za-z\\s]{5,20}";
			if(name.matches(regEx))
			{
				return true;
			}
			return false;
		};
 boolean status=v.validateName("Ravi kumar");
		System.out.println(status);

	}

}
