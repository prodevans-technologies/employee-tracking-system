package com.prodevans.trackit.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.prodevans.trackit.DTO.Login;
import com.prodevans.trackit.DTO.User;

public class UserDaoImpl implements UserDao 
{
	  @Autowired

	  DataSource datasource;

	  @Autowired

	  JdbcTemplate jdbcTemplate;
	  
	  public void register(User user) {

		    String sql = "insert into users values(?,?,?,?)";

		    jdbcTemplate.update(sql, new Object[] { user.getUsername(), user.getPassword(), user.getUserid(), user.getRole()});

		    }

		    public User validateUser(Login login) {

		    String sql = "select * from users where username='" + login.getUsername() + "' and password='" + login.getPassword()  + "'";

		    List<User> users = jdbcTemplate.query(sql, new UserMapper());

		    return users.size() > 0 ? users.get(0) : null;

		    }

		  }

		  class UserMapper implements RowMapper<User> {

		  public User mapRow(ResultSet rs, int arg1) throws SQLException {

		    User user = new User();

		    user.setUsername(rs.getString("username"));

		    user.setPassword(rs.getString("password"));

		    user.setUserid(rs.getString("userid"));

		    user.setRole(rs.getString("role"));



		    return user;

		  }

}
