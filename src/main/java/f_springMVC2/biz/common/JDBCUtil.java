package f_springMVC2.biz.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCUtil {
	public static Connection getConnection() {
		
		try {
//			mysql연동 
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jspdb?userSSL=false&serverTimezone=UTC", "root", "1234");

//			h2연동 
//			Class.forName("org.h2.Driver");
//			return DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "system", "1234");
			
//			oracle 연동 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "HR", "1234");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void close(PreparedStatement stmt, Connection conn) {
	      if(stmt != null) {
	         try {
	            if(!stmt.isClosed()) stmt.close();
	         } catch (Exception e) {
	            e.printStackTrace();
	         } finally {
	            stmt = null;
	         }
	      }
	      
	      if (conn != null) {
	         try {
	            if(!conn.isClosed()) conn.close();
	         } catch (Exception e) {
	            e.printStackTrace();
	         } finally {
	            conn = null;
	         }
	      }
	   }
	   
	   public static void close(ResultSet rs, PreparedStatement stmt, Connection conn) {
	      if(rs != null) {
	         
	         try {
	            if(!rs.isClosed()) rs.close();
	         } catch (Exception e) {
	            e.printStackTrace();
	         } finally {
	            rs = null;
	         }
	      }
	      
	      if(stmt != null) {
	         try {
	            if(!stmt.isClosed()) stmt.close();
	         } catch (Exception e) {
	            e.printStackTrace();
	         } finally {
	            stmt = null;
	         }
	      }
	      
	      if(conn != null) {
	         try {
	            if(!conn.isClosed()) conn.close();
	         } catch (Exception e) {
	            e.printStackTrace();
	         } finally {
	            conn = null;
	         }
	      }
	   }
	}