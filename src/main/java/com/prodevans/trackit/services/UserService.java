package com.prodevans.trackit.services;

import com.prodevans.trackit.beans.User;

public interface UserService 
{
	public void saveUser(User user);
	public User loginUser(User user);
	
}
