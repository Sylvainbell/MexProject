package services.interfaces;

public interface DevisItf {
	
	/**
	 * Method for devis creation
	 * 
	 * @return int : devis number
	 */
	public int createDevis();
	
	/**
	 * Method to delete a devis in DB
	 * 
	 * @param devisNumber
	 * @return
	 */
	public int deleteDevis(int devisNumber);

	/**
	 * Method to create a bill from a devis
	 * 
	 * @return
	 */
	public int createBill();
	
	/**
	 * Method to print a devis
	 * 
	 */
	public void printDevis();

}
