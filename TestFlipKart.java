package stream.demos;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product
{
private long productId;
private String productName;
private double productPrice;
public Product(long productId, String productName, double productPrice) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.productPrice = productPrice;
}
public long getProductId() {
	return productId;
}
public void setProductId(long productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public double getProductPrice() {
	return productPrice;
}
public void setProductPrice(double productPrice) {
	this.productPrice = productPrice;
}
@Override
public String toString() {
	return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice + "]";
}
}//close the Product class

class FlipKartService
{
	List<Product> products;
	public void addProductToList(List<Product> product)
	{
 products=product;
	}

	public Stream<Product> getSortedProduct()
	{
	return products.stream().
			sorted((p1,p2)->p1.getProductPrice()>p2.getProductPrice()?1:-1);

	}
	public Set<Product> serachProduct(String productName)
	{
	return products.stream().filter(p->p.getProductName().equalsIgnoreCase(productName))
			.collect(Collectors.toSet());
	}

	public Product getProductWithLowestCost()
	{
	return products.stream().min((p1,p2)->p1.getProductPrice()>p2.getProductPrice()?1:-1).
			get();

	}

	public int countNumberOfProduct()
	{
	return (int)products.stream().count();
	}
	public double getTotalCost()
	{
	return products.stream().map(p->p.getProductPrice()).
			reduce(0.0,(sum,p1)->sum+p1);

	}

}
public class TestFlipKart {

	public static void main(String[] args) {

		FlipKartService service=new FlipKartService();
		List<Product> listOfProduct=new ArrayList();
		listOfProduct.add(new Product(108834, "Samsung TV", 45000.00));
		listOfProduct.add(new Product(888834, "LG TV", 55000.00));
		listOfProduct.add(new Product(567899, "HP Laptop", 65000.00));
		listOfProduct.add(new Product(567889, "Dell Laptop", 75000.00));
		listOfProduct.add(new Product(108834, "Lenovo Laptop", 25000.00));
		listOfProduct.add(new Product(890765, "Asus Laptop", 35000.00));
		service.addProductToList(listOfProduct);
		
		
		
		
		
		

	}

}
