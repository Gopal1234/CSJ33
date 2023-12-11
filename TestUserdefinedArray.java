package method.reference.demos;

import java.util.Scanner;

class Product
{
private int productId;
private String productName;
private double productPrice;
public Product(int productId, String productName, double productPrice) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.productPrice = productPrice;
}
@Override
public String toString() {
	return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice + "]";
}

}
public class TestUserdefinedArray {

	public static void main(String[] args) {



//If we want to take from user
Scanner sc=new Scanner(System.in);
System.out.println("How many objects do you want to store");
int nop=sc.nextInt();
Product[] products=new Product[nop];
for(int i=0; i<nop; i++)
{
	System.out.println("enter id");
	int pId=sc.nextInt();
	System.out.println("enter name");
	String pName=sc.next();
	System.out.println("enter price");
	double price=sc.nextDouble();
	Product pObj=new Product(pId, pName, price);
	products[i]=pObj;
}


/*for(int i=0; i<products.length; i++)
{
	System.out.println(products[i]);
}*/

for(Product p:products)
{
	System.out.println(p);
}
	}

}
