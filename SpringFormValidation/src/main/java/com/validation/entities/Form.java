package com.validation.entities;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Form
{
	@NotBlank(message="Email cannot be blank")
	//@Email(message="C'mon, man! A valid email?")
	@Pattern(regexp="[a-z0-9]+@[a-z]+\\.[a-z]{2,3}", message="Invalid email")
	private String useremail;
	
	@NotBlank(message="Password cannot be blank")
	@Size(min=5, max=30, message="Password must be between 5 and 30 characters")
	private String userpassword;
	
	@AssertTrue(message="Check the box")
	private boolean checkbox;
	
	// GETTERS AND SETTERS
	public String getUseremail()
	{
		return useremail;
	}
	public void setUseremail(String useremail)
	{
		this.useremail = useremail;
	}
	public String getUserpassword()
	{
		return userpassword;
	}
	public void setUserpassword(String userpassword)
	{
		this.userpassword = userpassword;
	}	
	public boolean isCheckbox()
	{
		return checkbox;
	}
	public void setCheckbox(boolean checkbox)
	{	
		this.checkbox = checkbox;
	}
	
	
	// CONSTRUCTORS
	public Form()
	{
		
	}
	public Form(@NotBlank(message = "Email cannot be blank") @Email(message = "C'mon, man! A valid email?") String useremail,
			@NotBlank(message = "Password cannot be blank") @Size(min = 5, max = 30, message = "Password must be between 5 and 30 characters") String userpassword,
			@AssertTrue boolean checkbox)
	{
		super();
		this.useremail = useremail;
		this.userpassword = userpassword;
		this.checkbox = checkbox;
	}
	
	
	@Override
	public String toString()
	{
		return "Form [useremail=" + useremail + ", userpassword=" + userpassword + "]";
	}
		
}
