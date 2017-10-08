package database.interfaces;

import services.objects.Product;

public interface PostgresqlAccessItf {

	/**
	 * Create an object in database
	 */
	public void create(String cmd, Product myBO);
	
	
	/**
	 * Read in database
	 */
	public void read();
	
	/**
	 * Update an object in database
	 */
	public void update();
	
	
	/**
	 * Delete an object in database
	 */
	public void delete();

}
