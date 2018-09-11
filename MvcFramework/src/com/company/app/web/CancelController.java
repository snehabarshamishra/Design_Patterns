package com.company.app.web;


import webserverapi.HttpServletRequest;
import webserverapi.HttpServletResponse;
import webserverapi.IOException;
import webserverapi.ServletException;

import com.company.app.model.User;
import com.company.app.model.UserService;
import com.company.framework.Controller;
import com.company.framework.DispatchUtil;

public class CancelController extends Controller{

	UserService svc = UserService.getInstance();
	
	public void handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		User u = svc.cancelRegistration(Integer.parseInt(id));
		String page = "";
		if(u != null){
			page = "/removed.jsp";
		}else{
			page = "/nosuchuser.jsp";
		}
		DispatchUtil.sendToPage(page, request, response);
	}
}
