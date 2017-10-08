package services.interfaces;

import services.objects.Customer;
import services.objects.Product;

public interface ServicesForProductItf {
	
	// Methods dealings with Products
	
	public int addProductToDB(Product prd);
	
	public int removeProductToDB(Product prd);
	
	public int modifyProductInDB(Product newPrd);
	
	public Product getProduct(String productName);
}
