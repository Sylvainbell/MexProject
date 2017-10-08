package services.implementation;

import java.util.List;

import services.interfaces.ServicesForCustomerItf;
import services.objects.Bill;
import services.objects.Customer;
import services.objects.Order;
import services.objects.Product;

public class ServicesForProduct implements ServicesForCustomerItf {

	@Override
	public int addCustomerToDB(Customer customer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int removeCustomerToDB(Customer customerToDelete) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifyCustomerInDB(Customer newCustomer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Customer getCustomer(String customerName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order createOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order getOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bill getLastBill(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bill> getBills(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
