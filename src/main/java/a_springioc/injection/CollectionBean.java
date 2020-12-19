package a_springIOC.injection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionBean {
//	private Set<String> addressList;	//Set<String> addressList = null;
	private Properties addressList;
	
//	public CollectionBean() {
//	}
//
//	public CollectionBean(Set<String> addressList) {
//		this.addressList = addressList;
//	}
	
	public Properties getAddressList() {
		return addressList;
	}

	public void setAddressList(Properties addressList) {
		this.addressList = addressList;
	}
	
}