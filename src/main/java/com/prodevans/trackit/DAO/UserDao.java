package com.prodevans.trackit.DAO;

import com.prodevans.trackit.DTO.Login;
import com.prodevans.trackit.DTO.User;

public interface UserDao
{
	  void register(User user);

	  User validateUser(Login login);
}
