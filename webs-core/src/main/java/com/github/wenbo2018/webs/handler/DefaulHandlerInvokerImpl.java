package com.github.wenbo2018.webs.handler;

import com.github.wenbo2018.webs.view.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DefaulHandlerInvokerImpl implements HandlerInvoker{
	@Override
	public ModelAndView invokeHandler(HttpServletRequest request, HttpServletResponse response,
									  Handler handler, Object[] args) throws Exception {
		   Object o= handler.getMethod().invoke(handler.getInstance(),args);
		   ModelAndView modelAndView=new ModelAndView();
		   modelAndView.setObject(o);
		   return modelAndView;
	}
}
