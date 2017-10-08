package services.objects;

import java.util.Date;

import services.interfaces.DevisItf;

public class Devis implements DevisItf {

	private int devisNumber;
	private int orderNumber;
	private Date dateDevis;
	private int customerNumber;
		
	public Devis(int orderNumber, int customerNumber) {
//		CREATE SEQUENCE ma_sequence START WITH 5 INCREMENT BY 3;
		this.orderNumber = orderNumber;
		Date dateDevis = new Date();
		setDateDevis(dateDevis);
		this.customerNumber = customerNumber;
	}

	@Override
	public int createDevis() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteDevis(int devisNumber) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int createBill() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void printDevis() {
		// TODO Auto-generated method stub
		
	}

	public int getDevisNumber() {
		return devisNumber;
	}

	public void setDevisNumber(int devisNumber) {
		this.devisNumber = devisNumber;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Date getDateDevis() {
		return dateDevis;
	}

	public void setDateDevis(Date dateDevis) {
		this.dateDevis = dateDevis;
	}

	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	
}
