package com.lalalala.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/qing")
public class QingUrlController {
	
	private static long i = 0;
	
	@RequestMapping("/chu")
	public void getscurl(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String newUrl = "http://www.qingchu1.com/m11/index.html";
		i++;
		response.sendRedirect(newUrl);
	}
	
	@RequestMapping("/num")
	public void getNum(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter pw = response.getWriter();
		pw.print(i);
		pw.flush();
		pw.close();
	}
	
}
