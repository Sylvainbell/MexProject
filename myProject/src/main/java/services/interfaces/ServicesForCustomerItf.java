package services.interfaces;

import java.util.List;

import services.objects.Bill;
import services.objects.Customer;
import services.objects.Order;
import services.objects.Product;

public interface ServicesForCustomerItf {
	
	// Methods dealings with Customers
	
	public int addCustomerToDB(Customer customer);
	
	public int removeCustomerToDB(Customer customerToDelete);
	
	public int modifyCustomerInDB(Customer newCustomer);

	public Customer getCustomer(String customerName);
	
	public Order createOrder();
	
	public Order getOrder();
	
	public Bill getLastBill(Customer customer);
	
	public List<Bill> getBills (Customer customer);
	
}
