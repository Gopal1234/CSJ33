interface A
{
String display();
}

public class Test
{
public static void main(String[] args)
{
//implementing using lambda expression
A obj=()->{ return "welcome";};
//calling the method
System.out.println("Msg is"+" "+obj.display());
}
}
