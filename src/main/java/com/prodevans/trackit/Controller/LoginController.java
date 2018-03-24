package com.prodevans.trackit.Controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.prodevans.trackit.DTO.Login;
import com.prodevans.trackit.DTO.User;


@Controller
public class LoginController
{
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/Login", method = RequestMethod.GET)
	public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response)
	{
		ModelAndView mav=new ModelAndView("Login");
		mav.addObject("login",new Login());
		
		return mav;
	}
	  @RequestMapping(value = "/loginProcess", method = RequestMethod.POST)

	  public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("login") Login login)
	  {

	    ModelAndView mav = null;

	    User user = userService.validateUser(login);

	    if (null != user) {

	    mav = new ModelAndView("welcome");

	    mav.addObject("username", user.getUsername());

	    } else {

	    mav = new ModelAndView("login");

	    mav.addObject("message", "Username or Password is wrong!!");

	    }

	    return mav;

	  }
}
