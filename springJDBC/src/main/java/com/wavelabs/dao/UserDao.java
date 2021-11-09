package com.wavelabs.dao;

import com.wavelabs.model.User;

public interface UserDao {
	public int registerUser(User user);

	public String loginUser(User user);

}
