package com.wavelabs.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.wavelabs.model.User;

public class UserDaoImpl implements UserDao {

	private JdbcTemplate jdbcTemplate;

	public UserDaoImpl(DataSource dataSoruce) {
		jdbcTemplate = new JdbcTemplate(dataSoruce);
	}

	public int registerUser(User user) {

		String sql = "INSERT INTO ADD_USER VALUES(?,?,?)";

		try {

			int counter = jdbcTemplate.update(sql, new Object[] { user.getUsername(),user.getEmail(), user.getPassword() });

			return counter;

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	public String loginUser(User user) {

		String sql = "SELECT USER_NAME FROM ADD_USER WHERE USER_NAME=? AND USER_PASS=?";

		try {

			String userName = jdbcTemplate.queryForObject(sql, new Object[] { user.getUsername(), user.getPassword() },
					String.class);

			return userName;

		} catch (Exception e) {
			return null;
		}
	}
}