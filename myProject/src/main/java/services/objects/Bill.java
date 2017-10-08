package services.objects;

import java.util.Date;

public class Bill extends Devis{

	private int billNumber;
	private Date dateBill;

	public Bill(int devisNumber, int orderNumber, int customerNumber) {
		super(orderNumber, customerNumber);
		Date dateBill = new Date();
		setDateBill(dateBill);
	}

	public int getBillNumber() {
		return billNumber;
	}

	public void setBillNumber(int billNumber) {
		this.billNumber = billNumber;
	}

	public Date getDateBill() {
		return dateBill;
	}

	public void setDateBill(Date dateBill) {
		this.dateBill = dateBill;
	}	


}
