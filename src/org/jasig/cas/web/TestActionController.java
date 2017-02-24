package org.jasig.cas.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestActionController {
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String index(ModelMap model) {
		String aa ="";
		
		return "index";
	}
}
