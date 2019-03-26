package com.marcotessarindev.csvmaker;

import java.io.File;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Date;

@Controller
public class CsvController {
	private String appMode;
	
	@ModelAttribute
	CsvBean setupForm() {
	    return new CsvBean();
	}

	@Autowired
	public CsvController(Environment environment) {
		appMode = environment.getProperty("app-mode");
	}

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/create")
	public String create() {
		return "create";
	}

	@PostMapping("/process")
	public String processs(@ModelAttribute CsvBean model) {
		
		// get the attributes inside the model 
		int parameterNumber = ((CsvBean)model).getParameters();
		int rowNumber = ((CsvBean)model).getRows();
		
		System.out.println(parameterNumber + " " + rowNumber + " post"); 
		
		//File file = createRandomCsvFile(10, 100);
		return "getPro";
	}
	
	@GetMapping("/process")	
	public String process(Model model) {
		
		// get the attributes inside the model 
		int parameterNumber = ((CsvBean)model).getParameters();
		int rowNumber = ((CsvBean)model).getRows();
		
		System.out.println(parameterNumber + " " + rowNumber);
		
		// File file = createRandomCsvFile(10, 100);
				
		return "getPro";
	}
	
}