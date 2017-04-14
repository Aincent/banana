package com.lalalala;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

public class SpringFilter extends OncePerRequestFilter {
	 private static final String[] IGNORE_URI = {"/test/","/rurl/test/","/rurl/startpage/","/rurl/starturl/","/rurl/newpage/","/rurl/newvideo/","/rurl/newurl/",
	    	"/rurl/pto/","/rurl/fristpage/","/rurl/fristurl/","/rurl/newpage/","/rurl/newurl/","/rurl/scpage/","/rurl/scurl/","/url/startpage/","/url/starturl/","/url/newpage/","/url/newvideo/","/url/newurl/","/url/pto/"
		 ,"/url/fristpage/","/url/fristurl/","/url/newpage/","/url/newurl/","/url/scpage/","/url/scurl/","/qing/chu","/qing/num","/file/video/","/file/apks/","/css/","/img/","/js/",".ico"};
	
	 private static final String[] IGNORE_SYMBOL = {"/",",","&","%","@","."};
	 
	 /*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.web.filter.OncePerRequestFilter#doFilterInternal(
	 * javax.servlet.http.HttpServletRequest,
	 * javax.servlet.http.HttpServletResponse, javax.servlet.FilterChain)
	 */
	protected void doFilterInternal(HttpServletRequest request,
			HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
        boolean flag = false;
        String url = request.getRequestURL().toString();
        for (String s : IGNORE_URI) {
            if (url.contains(s)) {
            	flag = true;
            	String temp = url.substring(url.lastIndexOf(s)+s.length());
            	for (String symol : IGNORE_SYMBOL){
            		if(temp.contains(symol)){
            			flag = false;
            			break;
            		}
            	}
            	
            	if(s.equals("/css/") || s.equals("/img/") ||  s.equals("/js/"))
            	{
            		if(temp.contains(".css") || temp.contains(".jpg") ||temp.contains(".js") || temp.contains(".png"))
            		{
            			flag = true;
            			
                    	for (String symol : IGNORE_SYMBOL){
                    		if(temp.contains(symol) && !symol.equals(".")){
                    			flag = false;
                    			break;
                    		}
                    	}
            		}
            		else
            		{
            			flag = false;
            		}
            	}
                
                break;
            }
        }
        
        if(flag)
        {
			// 如果不执行过滤，则继续
			filterChain.doFilter(request, response);
        }
        else
        {
           	System.out.println("Filter>>>: " + url);
        }
	}
}
