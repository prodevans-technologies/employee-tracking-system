package com.prodevans.trackit.Controller;


import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {
	@Autowired
	public UserService  userService;
	
	@RequestMapping(value = "/register-user", method = RequestMethod.GET)
	public ModelAndView registerUser(HttpServletRequest request, HttpServletResponse response)
	{
		ModelAndView mav=new ModelAndView("register-user");
		mav.addObject("user",new User());
		
		
		return mav;
	}

	  @RequestMapping(value = "/registerProcess", method = RequestMethod.POST)

	  public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response,

	  @ModelAttribute("user") User user) {

	  userService.register(user);

	  return new ModelAndView("welcome", "username", user.getUsername());

	  }
}
