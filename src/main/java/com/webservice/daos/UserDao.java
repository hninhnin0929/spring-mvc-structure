package com.webservice.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;


import com.webservice.models.User;

@Repository
public class UserDao {

//	public void setDataSource(DataSource dataSource) {
//		System.out.println("setDataSouce");
//		this.dataSource = dataSource;
//	}
	
	public UserDao(){

	}
	
	public HashMap<String, Object> getUser(Connection conn) throws SQLException {
		
		User user = new User();
		List<User> users = new ArrayList<User>();
		HashMap<String, Object> result = new HashMap<>();
		String query = "select * from uvm001";		

		PreparedStatement stmt = conn.prepareStatement(query);
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			user = new User();
			user.setSyskey(rs.getString("syskey"));
			user.setUserName(rs.getString("username"));
			user.setFirstName(rs.getString("firstname"));
			user.setLastName(rs.getString("lastname"));
			user.setPassword(rs.getString("password"));
			System.out.println(user.getUserName());
			users.add(user);
		}
		result.put("users", users);
		System.out.println(users);
		return result;
	}

}
