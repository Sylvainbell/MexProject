package services.interfaces;

import services.objects.Provider;

public interface ProviderItf {
	
	public int addProvider();
	
	public int deleteProvider(Provider provider);
	
	public int modifyProvider(Provider provider);

}
