package a_springioc.injection;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {

	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("a_springioc/collectionBeanContext.xml");
		CollectionBean bean = (CollectionBean) factory.getBean("collectionBean");
		Properties addressList = bean.getAddressList();
		
//		Set<String> addressList = null;
//		Set<String> addressList = new HashSet<String>();
//		
//		addressList.add("서울시 강남구");
//		addressList.add("서울시 성동구");
//	
//		CollectionBean bean = new CollectionBean(addressList);
//		
//		addressList = bean.getAddressList();
		for(Map.Entry<Object, Object> address : addressList.entrySet()){
			System.out.println(address.getKey()+" / "+address.getValue());
		}
		
		factory.close();
	}

}