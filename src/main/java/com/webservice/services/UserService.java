package com.webservice.services;

import java.sql.Connection;
import java.util.HashMap;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservice.daos.UserDao;

@Service
public class UserService {

	@Autowired
	UserDao userDao;
	
	@Autowired
	private DataSource dataSource;
	
	public HashMap<String, Object> getUser() {

		HashMap<String, Object> result = new HashMap<>();
		
		try (Connection conn  = dataSource.getConnection();) {
			
//			conn.setAutoCommit(false);
			result = userDao.getUser(conn);
			
			result.put("status", 200);
			result.put("message", "SUCCESS");

		} catch (Exception e) {
			result.put("status", 300);
			result.put("message", "FAIL");
			e.printStackTrace();
			
		} 

		return result;		
		
	}
}
