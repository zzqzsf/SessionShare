package org.lanqiao.sessionshare.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class IndexController {
	@RequestMapping("/show")
	public String show(HttpServletRequest request){
		return "I'm " + request.getLocalPort();
	}


	@RequestMapping(value = "/session")
	public String getSession(HttpServletRequest request) {
		request.getSession().setAttribute("userName", "admin");
		return "I'm " + request.getLocalPort() + " save session " + request.getSession().getId();
	}

	@RequestMapping(value = "/get")
	public String get(HttpServletRequest request) {
		String userName = (String) request.getSession().getAttribute("userName");
		return "I'm " + request.getLocalPort() + " userName :" + userName;
	}
}
