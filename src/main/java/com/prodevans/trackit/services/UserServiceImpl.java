package com.prodevans.trackit.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prodevans.trackit.beans.User;
import com.prodevans.trackit.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	public void setUserDAO(UserDao userDao) {
		this.userDao=userDao;
	}
	
	@Override
	public void saveUser(User user) 
	{
		userDao.saveUser(user);
	}

	@Override
	public User loginUser(User user) {
	
		return userDao.loginUser(user);
	}

}
