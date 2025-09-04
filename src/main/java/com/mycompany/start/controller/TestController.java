package com.mycompany.start.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@RequestMapping (value = "/hello")
	public String hello() {
		return "hello";
	}
	
	// http 요청(get, post)에 따라 getmapping, postmapping을 분리시킴
	@GetMapping (value = "/world")
	// 요청을 body로 return 해주는 거, jsp로 넘어가는 게 아님, 문자열이 body에 찍힘
	@ResponseBody
	public String world() {
		return "hello";
	}
}
