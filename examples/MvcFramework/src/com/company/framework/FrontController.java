package com.company.framework;





import webserverapi.HttpServlet;
import webserverapi.HttpServletRequest;
import webserverapi.HttpServletResponse;
import webserverapi.IOException;
import webserverapi.ServletException;

import com.company.app.model.User;
import com.company.app.model.UserService;
import com.company.app.web.CancelController;
import com.company.app.web.RegisterController;
import com.company.app.web.ViewController;


public class FrontController extends HttpServlet {
	
	
	
	ControllerResolver controllerResolver;

	@Override
	public void init(){
		try{
			String controllerResolverClass = 
					getInitParameter("controllerResolver");
			if(controllerResolverClass != null){
				controllerResolver = (ControllerResolver)
						Class.forName(controllerResolverClass).newInstance();
			}else{
				controllerResolver = new PropertiesFileControllerResolver();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Controller c = controllerResolver.resolve(request);
		c.handleRequest(request, response);
		
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
