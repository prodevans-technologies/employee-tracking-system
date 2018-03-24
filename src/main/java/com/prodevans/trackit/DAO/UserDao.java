package com.prodevans.trackit.dao;

import com.prodevans.trackit.beans.User;

public interface UserDao
{
	public void saveUser(User user);
	public User loginUser(User user);
	
}
