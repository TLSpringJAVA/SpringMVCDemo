package com.imooc.mvcdemo;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloMvcController {

	@RequestMapping("/mvc")
	public String helloMvc(){
		
		return "home";
	}
}
