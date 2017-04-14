package com.lalalala.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rurl")
public class SkipUrlController {
	 private static final String[] IGNORE_URI = {"dygsy.cn","bnghg.com"};
	 
	@RequestMapping("/test/{name}")
	public void testurl(@PathVariable("name")String name, HttpServletResponse response) throws IOException {
		String key = MD5.getMD5(System.currentTimeMillis()+name).toLowerCase();
		String prefix = key.substring(0, 10);
		String postfix = key.substring(20, 30);
		java.util.Random random=new java.util.Random();// 定义随机类
		int result=random.nextInt(IGNORE_URI.length);// 返回[0,10)集合中的整数，注意不包括10
		String newUrl = "http://"+prefix+"."+IGNORE_URI[result]+"/url/startpage/"+postfix+"_"+name+"";
		response.sendRedirect(newUrl);
	}
	
	@RequestMapping("/startpage/{name}")
	public void gonew(@PathVariable("name")String name, HttpServletResponse response) throws IOException {
		String key = MD5.getMD5(System.currentTimeMillis()+name);
		String prefix = key.substring(0, 10);
		String postfix = key.substring(20, 30);
		java.util.Random random=new java.util.Random();// 定义随机类
		int result=random.nextInt(IGNORE_URI.length);// 返回[0,10)集合中的整数，注意不包括10
		String newUrl = "http://"+prefix+"."+IGNORE_URI[result]+"/url/startpage/"+postfix+"_"+name+"";
		response.sendRedirect(newUrl);
	}
	@RequestMapping("/starturl/{name}")
	public void geturl(@PathVariable("name")String name, HttpServletResponse response) throws IOException {
		String key = MD5.getMD5(System.currentTimeMillis()+name);
		String prefix = key.substring(0, 10);
		String postfix = key.substring(20, 30);
		java.util.Random random=new java.util.Random();// 定义随机类
		int result=random.nextInt(IGNORE_URI.length);// 返回[0,10)集合中的整数，注意不包括10
		String newUrl = "http://"+prefix+"."+IGNORE_URI[result]+"/url/starturl/"+postfix+"_"+name+"";
		response.sendRedirect(newUrl);
	}
	
	@RequestMapping("/newpage/{name}")
	public void gopage(@PathVariable("name")String name, HttpServletResponse response) throws IOException {
		String key = MD5.getMD5(System.currentTimeMillis()+name);
		String prefix = key.substring(0, 10);
		String postfix = key.substring(20, 30);
		java.util.Random random=new java.util.Random();// 定义随机类
		int result=random.nextInt(IGNORE_URI.length);// 返回[0,10)集合中的整数，注意不包括10
		String newUrl = "http://"+prefix+"."+IGNORE_URI[result]+"/url/newpage/"+postfix+"_"+name+"";
		response.sendRedirect(newUrl);
	}
	
	@RequestMapping("/newvideo/{name}")
	public void newvideo(@PathVariable("name")String name, HttpServletResponse response) throws IOException {
		String key = MD5.getMD5(System.currentTimeMillis()+name);
		String prefix = key.substring(0, 10);
		String postfix = key.substring(20, 30);
		java.util.Random random=new java.util.Random();// 定义随机类
		int result=random.nextInt(IGNORE_URI.length);// 返回[0,10)集合中的整数，注意不包括10
		String newUrl = "http://"+prefix+"."+IGNORE_URI[result]+"/url/newvideo/"+postfix+"_"+name+"";
		response.sendRedirect(newUrl);
	}
	
	@RequestMapping("/newurl/{name}")
	public void getapk(@PathVariable("name")String name, HttpServletResponse response) throws IOException {
		String key = MD5.getMD5(System.currentTimeMillis()+name);
		String prefix = key.substring(0, 10);
		String postfix = key.substring(20, 30);
		java.util.Random random=new java.util.Random();// 定义随机类
		int result=random.nextInt(IGNORE_URI.length);// 返回[0,10)集合中的整数，注意不包括10
		String newUrl = "http://"+prefix+"."+IGNORE_URI[result]+"/url/newurl/"+postfix+"_"+name+"";
		response.sendRedirect(newUrl);
	}

	@RequestMapping("/pto/{name}")
	public void getphoto(@PathVariable("name")String name, HttpServletResponse response) throws IOException {
		String key = MD5.getMD5(System.currentTimeMillis()+name);
		String prefix = key.substring(0, 10);
		String postfix = key.substring(20, 30);
		java.util.Random random=new java.util.Random();// 定义随机类
		int result=random.nextInt(IGNORE_URI.length);// 返回[0,10)集合中的整数，注意不包括10
		String newUrl = "http://"+prefix+"."+IGNORE_URI[result]+"/url/pto/"+postfix+"_"+name+"";
		response.sendRedirect(newUrl);
	}
	
	
	@RequestMapping("/fristpage/{name}")
	public void gofrist(@PathVariable("name")String name, HttpServletResponse response) throws IOException {
		String key = MD5.getMD5(System.currentTimeMillis()+name);
		String prefix = key.substring(0, 10);
		String postfix = key.substring(20, 30);
		java.util.Random random=new java.util.Random();// 定义随机类
		int result=random.nextInt(IGNORE_URI.length);// 返回[0,10)集合中的整数，注意不包括10
		String newUrl = "http://"+prefix+"."+IGNORE_URI[result]+"/url/fristpage/"+postfix+"_"+name+"";
		response.sendRedirect(newUrl);
	}
	
	
	@RequestMapping("/fristurl/{name}")
	public void getsecondurl(@PathVariable("name")String name, HttpServletResponse response) throws IOException {
		String key = MD5.getMD5(System.currentTimeMillis()+name);
		String prefix = key.substring(0, 10);
		String postfix = key.substring(20, 30);
		java.util.Random random=new java.util.Random();// 定义随机类
		int result=random.nextInt(IGNORE_URI.length);// 返回[0,10)集合中的整数，注意不包括10
		String newUrl = "http://"+prefix+"."+IGNORE_URI[result]+"/url/fristurl/"+postfix+"_"+name+"";
		response.sendRedirect(newUrl);
	}
	
	
	@RequestMapping("/scpage/{name}")
	public void goscpage(@PathVariable("name")String name, HttpServletResponse response) throws IOException {
		String key = MD5.getMD5(System.currentTimeMillis()+name);
		String prefix = key.substring(0, 10);
		String postfix = key.substring(20, 30);
		java.util.Random random=new java.util.Random();// 定义随机类
		int result=random.nextInt(IGNORE_URI.length);// 返回[0,10)集合中的整数，注意不包括10
		String newUrl = "http://"+prefix+"."+IGNORE_URI[result]+"/url/scpage/"+postfix+"_"+name+"";
		response.sendRedirect(newUrl);
	}
	
	@RequestMapping("/scurl/{name}")
	public void getscurl(@PathVariable("name")String name, HttpServletResponse response) throws IOException {
		String key = MD5.getMD5(System.currentTimeMillis()+name);
		String prefix = key.substring(0, 10);
		String postfix = key.substring(20, 30);
		java.util.Random random=new java.util.Random();// 定义随机类
		int result=random.nextInt(IGNORE_URI.length);// 返回[0,10)集合中的整数，注意不包括10
		String newUrl = "http://"+prefix+"."+IGNORE_URI[result]+"/url/scurl/"+postfix+"_"+name+"";
		response.sendRedirect(newUrl);
	}
}
