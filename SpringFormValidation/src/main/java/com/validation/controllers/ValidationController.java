package com.validation.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.validation.entities.Form;

import jakarta.validation.Valid;

@Controller
public class ValidationController
{
	@GetMapping("/form")
	public String showForm(Model m)
	{
		m.addAttribute("loginData", new Form());
		return "form";
	}
	
	@PostMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("loginData") Form formData, BindingResult result)
	{
		if(result.hasErrors())
		{
			System.out.println(result);
			return "form";
		}
		return "success";
	}
}
