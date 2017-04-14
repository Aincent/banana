package com.lalalala;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class SpringInterceptor extends HandlerInterceptorAdapter{
    private static final String[] IGNORE_URI = {"/test/","/rurl/test/","/rurl/startpage/","/rurl/starturl/","/rurl/newpage/","/rurl/newvideo/","/rurl/newurl/",
    	"/rurl/pto/","/rurl/fristpage/","/rurl/fristurl/","/rurl/newpage/","/rurl/newurl/","/rurl/scpage/","/rurl/scurl/","/url/startpage/","/url/starturl/","/url/newpage/","/url/newvideo/","/url/newurl/",
    	"/url/pto/","/url/fristpage/","/url/fristurl/","/url/newpage/","/url/newurl/","/url/scpage/","/url/scurl/","/qing/chu","/qing/num",".jpg"};
    
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        boolean flag = false;
        String url = request.getRequestURL().toString();
        for (String s : IGNORE_URI) {
            if (url.contains(s)) {
                flag = true;
                break;
            }
        }
    
         if(!flag)
         {
        	 System.out.println("Interceptor>>>: " + url);
         }
        
        return flag;
    }
 
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        super.postHandle(request, response, handler, modelAndView);
    }
}
