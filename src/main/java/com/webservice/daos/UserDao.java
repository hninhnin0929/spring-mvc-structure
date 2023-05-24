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

	public HashMap<String, Object> getUser(Connection conn) throws SQLException {
		
		User user = new User();
		List<User> users = new ArrayList<User>();
		HashMap<String, Object> result = new HashMap<>();
		
		String query = "select * from urd001";		

		PreparedStatement stmt = conn.prepareStatement(query);
		ResultSet rs = stmt.executeQuery();
		
		while (rs.next()) {
			user = new User();
			user.setSyskey(rs.getString("syskey"));
			user.setCreatedDate(rs.getString("createddate"));
			user.setModifiedDate(rs.getString("modifieddate"));
			user.setUserId(rs.getString("t1"));
			user.setUserName(rs.getString("t2"));
			user.setPassword(rs.getString("t3"));
			user.setUserSyskey(rs.getString("usersyskey"));

			users.add(user);
		}
		result.put("users", users);
		
		return result;
	}

}
