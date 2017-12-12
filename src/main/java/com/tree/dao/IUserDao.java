package com.tree.dao;

import com.tree.entity.User;

public interface IUserDao {

	public User getUserById(int userId);
	public User getUserList();
	public User getUserByName(String username);
}
