package com.prodevans.trackit.validation;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import com.prodevans.trackit.beans.User;

public class UserValidation implements Validator 
{
	@Override
	public boolean supports(Class<?>argo) {
		return User.class.equals(argo);
		
	}
	@Override
	public void validate(Object argo,Errors arg1)
	{
		
	}
}
