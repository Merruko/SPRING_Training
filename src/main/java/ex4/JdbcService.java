package ex4;

public class JdbcService {

	private JdbcDao jdbcDao;
	
	public JdbcService() {
		
	}
	
	public JdbcService(JdbcDao jdbcDao) {
		this.jdbcDao = jdbcDao;
	}
	
	public void serviceTest() {
		jdbcDao.insert();
		jdbcDao.delete();
	}
	
}