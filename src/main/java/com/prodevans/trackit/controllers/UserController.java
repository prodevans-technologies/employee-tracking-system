package com.prodevans.trackit.controllers;

import java.util.Locale;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.prodevans.trackit.beans.User;
import com.prodevans.trackit.services.UserService;
import com.prodevans.trackit.validation.UserValidation;

@Controller
@RequestMapping(value="/register-user")
public class UserController
{
	@Autowired
	private UserService userService;
	@RequestMapping(value="/register-user",method=RequestMethod.GET)
	public String showForm(Locale locale,ModelMap model)
	{
		model.put("userData",new User());
		return "register-user";
	
	}
	@RequestMapping(value="/register-user",method=RequestMethod.POST)
	public String saveForm(Locale locale,ModelMap model,@ModelAttribute("userData") @Valid User user,BindingResult br,HttpSession session)
	{
		UserValidation userValidation=new UserValidation();
		userValidation.validate(userValidation,br);
		if(br.hasErrors())
		{
			return "register-user";
		}else 
		{
			userService.saveUser(user);
			session.setAttribute("user",user);
			return "redirect:success";
		}
	
	}
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String showLogin(ModelMap model,HttpSession session)
	{
		if(session.getAttribute("user")==null)
		{
			model.put("userData",new User());
			return "home";
		}else {
			return "redirect:success";
		}
	}
	@RequestMapping(value="/home",method=RequestMethod.POST)
	public String doLogin(ModelMap model,@ModelAttribute("userData")@Valid User user,HttpSession session)
	{
		if(user.getE_username()!=null && user.getE_password()!=null && session.getAttribute("user")==null)
		{
			user = userService.loginUser(user);
			if(user!=null)
			{
				session.setAttribute("user",user);
				return "redirect:success";
			}else {
				model.put("failed","Login Failed.");
				return "home";
			}
		}else {
			return "redirect:success";
		}
	}
	@RequestMapping(value="/logout",method=RequestMethod.GET)
	public String logOut(ModelMap model,HttpSession session)
	{
		session.removeAttribute("user");
		return "redirect:login";
	}
	@RequestMapping(value="/success",method=RequestMethod.GET)
	public String showSuccess(ModelMap model)
	{
		model.put("success",new User());
		return "success";
	}
}