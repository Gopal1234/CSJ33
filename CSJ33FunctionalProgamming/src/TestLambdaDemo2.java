class Customer
{
	
	private long phoneNumber;
	private String panNumber;
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long ph) {
		phoneNumber = ph;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	
	
	
}
interface CustomerDataValidator
{
	 String validate(Customer customer);
}
public class TestLambdaDemo2 {

	public static void main(String[] args) {

Customer customerObject=new Customer();
customerObject.setPanNumber("ADKTR1234T");
customerObject.setPhoneNumber(1147117572L);
CustomerDataValidator v=(cust)->
{
	String panNumber=cust.getPanNumber();
	Long mobile=cust.getPhoneNumber();
	String ph=mobile.toString();
	String regExPan="[A-Z]{5}[0-9]{4}[A-Z]{1}";
	String phoneRegEx="[6789]{1}[0-9]{9}";
	if(panNumber.matches(regExPan) && ph.matches(phoneRegEx) )
	{
		return "PAN and Mobile both valid";
	}else
	{
		return " NOT valid";
	}
};
String res=v.validate(customerObject);
System.out.println(res);




	}

}
