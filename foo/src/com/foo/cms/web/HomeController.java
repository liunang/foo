package com.foo.cms.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller//����һ��������
@RequestMapping("/")
public class HomeController {
	@RequestMapping(method=RequestMethod.GET)
	public String home(){
		return "home";
	}
}
