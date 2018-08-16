package com.mj.test;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mj.test.dtos.TestDto;
import com.mj.test.service.ITestService;
import com.mj.test.service.TestService;


@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	public ITestService testServiceImp;

	@RequestMapping(value = "/home.do")
	public String chartOutput( Model model ){
		List<TestDto> list= testServiceImp.getAllData();
		model.addAttribute("list",list);
	
		
//		Map<String, Integer> map=new HashMap<String, Integer>();
//		map.put("a", 30);
//		map.put("b", 20);
//		map.put("c", 20);
//		map.put("d", 30);
//		
//		model.addAttribute("list", map);
		
	  return "home";

	}
	
}
