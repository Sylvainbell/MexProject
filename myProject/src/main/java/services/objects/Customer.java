package services.objects;

import java.util.Date;
import java.util.List;

import database.implementation.PostgresqlAccess;
import services.interfaces.CustomerItf;
import services.interfaces.OrderItf;

public class Customer implements CustomerItf{

	private String customerName;
	private String customerLastName;
	private String adress;
	private int cell;
	private int customerNumber;
	private Date creationDate;	
	
	public Customer(String customerName, String customerLastName, String adress, int cell) {
		this.customerName = customerName;
		this.customerLastName = customerLastName;
		this.adress = adress;
		this.cell = cell;
		Date creationDate = new Date();
		this.creationDate = creationDate;
	}	
	
	@Override
	public OrderItf getLastOrder() {
		return null;
	}

	@Override
	public List<OrderItf> getAllOrders() {
		
		PostgresqlAccess postgres = new PostgresqlAccess();
		
		return null;
	}
	
	@Override
	public Customer getCustomerInformation() {
		
		return this;
	}	

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getCell() {
		return cell;
	}

	public void setCell(int cell) {
		this.cell = cell;
	}

	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
}
