package enumpack;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Product
{
	private long productId;
	private String productName;
	private double productPrice;
	public Product(long productId, String productName, double productPrice) {
		
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	public long getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
	
	
}

enum SortBy
{
	LOWPRICE,HIGHPRICE,NAME;
}
class ProductService
{
	public static List<Product> 
	sortProducts(SortBy sort,List<Product> products)
	{
		//String name
		List<Product> list=null;
String ch=	 sort.name();
if(ch.equalsIgnoreCase("LOWPRICE"))
{
	Comparator<Product> cmp=(p1,p2)->
	p1.getProductPrice()>p2.getProductPrice()?1:-1;
	
	list=products.
			stream().
			sorted(cmp).
			collect(Collectors.toList());
}else if(ch.equalsIgnoreCase("HIGHPRICE"))
{
	Comparator<Product> cmp=(p1,p2)->
	p1.getProductPrice()<p2.getProductPrice()?1:-1;
	
	list=products.
			stream().
			sorted(cmp).
			collect(Collectors.toList());
}else if(ch.equalsIgnoreCase("NAME"))
{
	Comparator<Product> cmp=(p1,p2)->
	p1.getProductName().compareTo(p2.getProductName());
	
	list=products.
			stream().
			sorted(cmp).
			collect(Collectors.toList());	
}
		
return list;		
		
	}
	
	
	
	
	
}


public class TestEnumDemo2 {

	static List<Product> listOfProducts=new ArrayList();
	static
	{
		listOfProducts.add
		(new Product(108,"Laptop",56000.00));
		listOfProducts.add(new Product(1,"TV",16000.00));
		listOfProducts.add(new Product(18,"Watch",6000.00));
		listOfProducts.add(new Product(8,"Smart Watch",36000.00));
		
	}
	
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("enter your sorting technique");
		String srt=s.next();
		SortBy sortBy=SortBy.valueOf(srt);
		
List<Product> list=
ProductService.sortProducts(sortBy, listOfProducts);
list.forEach(p->System.out.println(p));

	}

}
