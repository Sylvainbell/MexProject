package services.objects;

import java.util.Date;
import java.util.List;

import services.interfaces.OrderItf;

public class Order implements OrderItf {
	
	private List<Product> lst_products;
	private String customerNumber;
	private String orderNumber;
	private Date dateOrder;
	
	public Order(List<Product> lst_products, String customerNumber) {
		this.lst_products = lst_products;
		this.customerNumber = customerNumber;
		Date date = new Date();
		this.dateOrder = date;
	}

	@Override
	public int deleteOrder(int orderNumber) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void saveOrder() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getOrder(int orderNumber) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int createDevis() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int createBill() {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Product> getLst_products() {
		return lst_products;
	}

	public void setLst_products(List<Product> lst_products) {
		this.lst_products = lst_products;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Date getDateOrder() {
		return dateOrder;
	}

	public void setDateOrder(Date dateOrder) {
		this.dateOrder = dateOrder;
	}
	
}
