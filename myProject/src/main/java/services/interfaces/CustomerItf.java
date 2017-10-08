package services.interfaces;

import java.util.List;

import services.objects.Customer;

public interface CustomerItf {
	
	public OrderItf getLastOrder();
	
	public List<OrderItf> getAllOrders();
	
	public Customer getCustomerInformation();
	

}
