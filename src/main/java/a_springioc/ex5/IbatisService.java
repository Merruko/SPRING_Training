package a_springIOC.ex5;

public class IbatisService {
	
	private IbatisDao ibatisDao;
	
	public void setIbatisDao(IbatisDao ibatisDao) {
		this.ibatisDao = ibatisDao;
	}
	
	public void daoTest() {
		System.out.println("START");
		ibatisDao.insertDB();
		ibatisDao.updateDB();
		System.out.println("END");
	}

}