package wmp.cert.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

import wmp.cert.spring.properties.XssProperties;

@Controller
public class XssController {
    @Autowired
    private XssProperties xssProperties;
    
    @GetMapping("/xsscheatsheet")
	public String cheat(Model model) {
		List<String> cleanList = new ArrayList<>();
		
		for(String xss : xssProperties.getXss()) {
			cleanList.add(xss);
		}
		
		model.addAttribute("cleanList", cleanList);
		
		return "cheatsheet/index";
	}

    @GetMapping("/xsstest")
    public String xss_test(Model model, String email) {
        model.addAttribute("email", email);
        return "cheatsheet/test";
    }
}
