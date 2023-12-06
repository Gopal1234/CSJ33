package function.demos;

import java.util.function.Supplier;

class Customer extends Object
{
	private int customerId;
	private String customerName;
	public Customer(int customerId, String customerName) {
		//super();
		this.customerId = customerId;
		this.customerName = customerName;
	}
	public String toString()
	{
		return customerId+ " "+customerName;
	}
}
public class TestSupplerExample2 {

	public static void main(String[] args) {

Supplier<Customer> sup=()->
{
	return new Customer(108, "XYZ");
};
Customer cObj=sup.get();
System.out.println(cObj);
	}

}
