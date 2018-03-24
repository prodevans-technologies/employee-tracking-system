package com.prodevans.trackit.dao;

import com.prodevans.trackit.beans.User;

public interface UserDAO
{
	public void saveUser(User user);
	public User loginUser(User user);
	
}
