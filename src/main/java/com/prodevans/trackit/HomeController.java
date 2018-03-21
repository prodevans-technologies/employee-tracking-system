package com.prodevans.trackit;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	@RequestMapping(value = "/AdminLogin", method = RequestMethod.GET)
	public String adminLogin(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "AdminLogin";
	}
	
	@RequestMapping(value = "/AdminLogin", method = RequestMethod.POST)
	public ModelAndView Login(Locale locale, Model model, @RequestParam(name="userid")String user_name, @RequestParam(name="password")String Pass) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		System.out.println("login adimn controller started");
		
		/*System.out.println(userid+ "\t" +password);*/
		
		/*if(dto.getUserid().equals(userid) && dto.getPassword().equals(password) )
		{
			System.out.println("Admin login success");
			return new ModelAndView("WelcomeAdmin.jsp", "nm" ,userid);
		}*/
		
		if(user_name.equals(Pass)) {
			System.out.println("Admin login success");
			return new ModelAndView("WelcomeAdmin", "nm" ,user_name);
		}
		
		System.out.println("login adim controller ended");
		return new ModelAndView("AdminLogin","msg","userid or password incorrect");
	}
}
