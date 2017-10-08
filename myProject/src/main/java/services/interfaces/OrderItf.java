package services.interfaces;

public interface OrderItf {
	
	/**
	 * Mehod to delete an order in DB
	 * 
	 * @param orderNumber order number to delete in DB
	 * @return 0 if everything ok.
	 */
	public int deleteOrder(int orderNumber);
		
	/**
	 * Method to save an order
	 * 
	 */
	public void saveOrder();
		
	/**
	 * Method to get an order from DB
	 * 
	 * @param orderNumber orderNumber to find in DB
	 */
	public void getOrder(int orderNumber);
	
	/**
	 * Methode to create a Devis from an order
	 *  
	 * @return int Devis number
	 */
	public int createDevis();
	
	/**
	 * Methode to create a Bill from an order
	 *  
	 * @return int Bill number
	 */
	public int createBill();
	
}
