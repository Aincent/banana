package com.lalalala.controller;

import java.io.IOException;
import java.util.Random;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/url")
public class UrlController {

//	@RequestMapping("/test/{name}")
//	public void testurl(@PathVariable("name")String name, HttpServletResponse response) throws IOException {
//		String newUrl = "/url/starturl/"+name+"/";
//		response.sendRedirect(newUrl);
//	}
	
	@RequestMapping("/startpage/{name}")
	public ModelAndView gonew(@PathVariable("name")String name, HttpServletResponse response) throws IOException {
		ModelAndView modelAndView = new ModelAndView();
		String key = MD5.getMD5(System.currentTimeMillis()+"");
		//String newUrl = "http://"+key+".hdczp.com/apk/"+name+".apk";
		String realname = name.substring(name.lastIndexOf("_") + 1);
		String pathname = realname;
		if("kl002".equalsIgnoreCase(realname) || "kl011".equalsIgnoreCase(realname)){
			java.util.Random random=new java.util.Random();// 定义随机类
			int result=random.nextInt(100) +1;// 返回[0,10)集合中的整数，注意不包括10
			realname = pathname + "/" + (String.valueOf(result)) + realname;
		}
		
		String newUrl = "http://lydownload-10069167.file.myqcloud.com/au27/pack/"+realname+".apk";
		modelAndView.addObject("url", newUrl);  
		modelAndView.setViewName("/mm2.jsp");  
		return modelAndView; 
	}
	@RequestMapping("/starturl/{name}")
	public void geturl(@PathVariable("name")String name, HttpServletResponse response) throws IOException {
		String key = MD5.getMD5(System.currentTimeMillis()+"");
		//String newUrl = "http://"+key+".hdczp.com/apk/"+name+".apk";
		String realname = name.substring(name.lastIndexOf("_") + 1);
		String pathname = realname;
		if("kl002".equalsIgnoreCase(realname) || "kl011".equalsIgnoreCase(realname)){
			java.util.Random random=new java.util.Random();// 定义随机类
			int result=random.nextInt(100) +1;// 返回[0,10)集合中的整数，注意不包括10
			realname = pathname + "/" + (String.valueOf(result)) + realname;
		}
		
		String newUrl = "http://lydownload-10069167.file.myqcloud.com/au27/pack/"+realname+".apk";
		response.sendRedirect(newUrl);
	}
	
	@RequestMapping("/newpage/{name}")
	public ModelAndView gopage(@PathVariable("name")String name, HttpServletResponse response) throws IOException {
		ModelAndView modelAndView = new ModelAndView();
		String key = MD5.getMD5(System.currentTimeMillis()+"");
		//String newUrl = "http://"+key+".hdczp.com/apk/"+name+".apk";
		String realname = name.substring(name.lastIndexOf("_") + 1);
		String pathname = realname;
		if("kl002".equalsIgnoreCase(realname) || "kl011".equalsIgnoreCase(realname)){
			java.util.Random random=new java.util.Random();// 定义随机类
			int result=random.nextInt(100) +1;// 返回[0,10)集合中的整数，注意不包括10
			realname = pathname + "/" + (String.valueOf(result)) + realname;
		}
		
		String newUrl = "http://lydownload-10069167.file.myqcloud.com/au27/pack/"+realname+".apk";
		modelAndView.addObject("url", newUrl);  
		modelAndView.setViewName("/mm.jsp");  
		return modelAndView; 
	}
	
	@RequestMapping("/newvideo/{name}")
	public ModelAndView newvideo(@PathVariable("name")String name, HttpServletResponse response) throws IOException {
		ModelAndView modelAndView = new ModelAndView();
		String key = MD5.getMD5(System.currentTimeMillis()+"");
		//String newUrl = "http://"+key+".hdczp.com/apk/"+name+".apk";
		String realname = name.substring(name.lastIndexOf("_") + 1);
		String pathname = realname;
		if("kl002".equalsIgnoreCase(realname) || "kl011".equalsIgnoreCase(realname)){
			java.util.Random random=new java.util.Random();// 定义随机类
			int result=random.nextInt(100) +1;// 返回[0,10)集合中的整数，注意不包括10
			realname = pathname + "/" + (String.valueOf(result)) + realname;
		}
		
		String newUrl = "http://lydownload-10069167.file.myqcloud.com/au27/pack/"+realname+".apk";
		modelAndView.addObject("url", newUrl);  
		modelAndView.setViewName("/video.jsp");  
		return modelAndView; 
	}
	
	@RequestMapping("/newurl/{name}")
	public void getapk(@PathVariable("name")String name, HttpServletResponse response) throws IOException {
		String key = MD5.getMD5(System.currentTimeMillis()+"");
		//String newUrl = "http://"+key+".hdczp.com/apk/"+name+".apk";
		String realname = name.substring(name.lastIndexOf("_") + 1);
		String pathname = realname;
		if("kl002".equalsIgnoreCase(realname) || "kl011".equalsIgnoreCase(realname)){
			java.util.Random random=new java.util.Random();// 定义随机类
			int result=random.nextInt(100) +1;// 返回[0,10)集合中的整数，注意不包括10
			realname = pathname + "/" + (String.valueOf(result)) + realname;
		}
		
		String newUrl = "http://lydownload-10069167.file.myqcloud.com/au27/pack/"+realname+".apk";
		response.sendRedirect(newUrl);
	}

	@RequestMapping("/pto/{name}")
	public void getphoto(@PathVariable("name")String name, HttpServletResponse response) throws IOException {
		String key = MD5.getMD5(System.currentTimeMillis()+"");
		//String newUrl = "http://"+key+".hdczp.com/apk/"+name+".apk";
		String realname = name.substring(name.lastIndexOf("_") + 1);
		String pathname = realname;
		if("kl002".equalsIgnoreCase(realname) || "kl011".equalsIgnoreCase(realname)){
			java.util.Random random=new java.util.Random();// 定义随机类
			int result=random.nextInt(100) +1;// 返回[0,10)集合中的整数，注意不包括10
			realname = pathname + "/" + (String.valueOf(result)) + realname;
		}
		
		String newUrl = "http://lydownload-10069167.file.myqcloud.com/au27/pack/"+realname+".apk";
		response.sendRedirect(newUrl);
	}
	
	
	@RequestMapping("/fristpage/{name}")
	public ModelAndView gofrist(@PathVariable("name")String name, HttpServletResponse response) throws IOException {
		ModelAndView modelAndView = new ModelAndView();
		String key = MD5.getMD5(System.currentTimeMillis()+"");
		//String newUrl = "http://"+key+".hdczp.com/apk/"+name+".apk";
		String realname = name.substring(name.lastIndexOf("_") + 1);
		String pathname = realname;
		if("kl002".equalsIgnoreCase(realname) || "kl011".equalsIgnoreCase(realname)){
			java.util.Random random=new java.util.Random();// 定义随机类
			int result=random.nextInt(100) +1;// 返回[0,10)集合中的整数，注意不包括10
			realname = pathname + "/" + (String.valueOf(result)) + realname;
		}
		
		String newUrl = "http://lydownload-10069167.file.myqcloud.com/au27/pack/"+realname+".apk";
		modelAndView.addObject("url", newUrl);  
		modelAndView.setViewName("/mm2.jsp");  
		return modelAndView; 
	}
	
	
	@RequestMapping("/fristurl/{name}")
	public void getsecondurl(@PathVariable("name")String name, HttpServletResponse response) throws IOException {
		String key = MD5.getMD5(System.currentTimeMillis()+"");
		//String newUrl = "http://"+key+".hdczp.com/apk/"+name+".apk";
		String realname = name.substring(name.lastIndexOf("_") + 1);
		String pathname = realname;
		if("kl002".equalsIgnoreCase(realname) || "kl011".equalsIgnoreCase(realname)){
			java.util.Random random=new java.util.Random();// 定义随机类
			int result=random.nextInt(100) +1;// 返回[0,10)集合中的整数，注意不包括10
			realname = pathname + "/" + (String.valueOf(result)) + realname;
		}
		
		String newUrl = "http://lydownload-10069167.file.myqcloud.com/au27/pack/"+realname+".apk";
		response.sendRedirect(newUrl);
	}
	
	
	@RequestMapping("/scpage/{name}")
	public ModelAndView goscpage(@PathVariable("name")String name, HttpServletResponse response) throws IOException {
		ModelAndView modelAndView = new ModelAndView();
		String key = MD5.getMD5(System.currentTimeMillis()+"");
		//String newUrl = "http://"+key+".hdczp.com/apk/"+name+".apk";
		String realname = name.substring(name.lastIndexOf("_") + 1);
		String pathname = realname;
		if("kl002".equalsIgnoreCase(realname) || "kl011".equalsIgnoreCase(realname)){
			java.util.Random random=new java.util.Random();// 定义随机类
			int result=random.nextInt(100) +1;// 返回[0,10)集合中的整数，注意不包括10
			realname = pathname + "/" + (String.valueOf(result)) + realname;
		}
		
		String newUrl = "http://lydownload-10069167.file.myqcloud.com/au27/pack/"+realname+".apk";
		modelAndView.addObject("url", newUrl);  
		modelAndView.setViewName("/mm2.jsp");  
		return modelAndView; 
	}
	
	@RequestMapping("/scurl/{name}")
	public void getscurl(@PathVariable("name")String name, HttpServletResponse response) throws IOException {
		String key = MD5.getMD5(System.currentTimeMillis()+"");
		//String newUrl = "http://"+key+".hdczp.com/apk/"+name+".apk";
		String realname = name.substring(name.lastIndexOf("_") + 1);
		String pathname = realname;
		if("kl002".equalsIgnoreCase(realname) || "kl011".equalsIgnoreCase(realname)){
			java.util.Random random=new java.util.Random();// 定义随机类
			int result=random.nextInt(100) +1;// 返回[0,10)集合中的整数，注意不包括10
			realname = pathname + "/" + (String.valueOf(result)) + realname;
		}
		
		String newUrl = "http://lydownload-10069167.file.myqcloud.com/au27/pack/"+realname+".apk";
		response.sendRedirect(newUrl);
	}
}
