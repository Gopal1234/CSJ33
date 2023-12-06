package function.demos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class TestConsumerExample2 {

	public static void main(String[] args) {

List<Double> list=new ArrayList();
Scanner sc=new Scanner(System.in);
System.out.println("how many salary of employee do you want to save");
int nos=sc.nextInt();
for(int i=0; i<nos; i++)
{
	double sal=sc.nextDouble();
	list.add(sal);
}
		//forEach(Consumer consumer)
Consumer<Double> con=(salary)->
{
	//if(salary>10000.00)
	//{
	System.out.println("The salary amount is"+ " "+salary);
	//}
};
//
//only print the salary  which >=10000.00
for(Double d:list)
{
	if(d>10000.00)
	{
	con.accept(d);
	}
}
//list.forEach(con);


		
		

	}

}
