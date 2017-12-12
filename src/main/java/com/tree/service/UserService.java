package com.tree.service;

import com.tree.entity.User;

public interface UserService {
	public interface IUserService {  
	    public User getUserById(int userId);
	    public User checkLogin(String username,String password);
	}
}
