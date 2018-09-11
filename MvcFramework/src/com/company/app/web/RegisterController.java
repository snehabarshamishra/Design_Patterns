package com.company.app.web;



import webserverapi.HttpServletRequest;
import webserverapi.HttpServletResponse;
import webserverapi.IOException;
import webserverapi.ServletException;

import com.company.app.model.User;
import com.company.app.model.UserService;
import com.company.framework.Controller;
import com.company.framework.DispatchUtil;

public class RegisterController extends Controller {
	
	UserService svc = UserService.getInstance();
	
	public void handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		User u = new User(name,email);
		int id = svc.register(u);
		request.setAttribute("id", id);
		String page = "/created.jsp";
		DispatchUtil.sendToPage(page, request, response);
	}
	
	@Override
	public boolean validateInput(HttpServletRequest request,
			HttpServletResponse response){
		System.out.println("Having custom validation for register..........");
		return true;
	}
}
