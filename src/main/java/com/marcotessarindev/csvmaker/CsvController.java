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
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CsvController {
    
    private String appMode;
    
	
	@ModelAttribute(value= "csvbean")
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

	@RequestMapping(value = "/process", method = RequestMethod.POST)
	public String process(@ModelAttribute CsvBean csvbean) {
		
		// get the attributes inside the model 
		String parameterNumber = ((CsvBean)csvbean).getParameters();
		String rowNumber = ((CsvBean)csvbean).getRows();
		
		System.out.println(parameterNumber + " " + rowNumber + " post");
		
		//File file = createRandomCsvFile(10, 100);
		return "process";
	}
	
    // @RequestMapping(value = "/process", method = RequestMethod.GET)
    // public String process(Model model) {
    //     model.addAttribute("csvbean", new CsvBean());
    //     return "process";
    // }
	
}