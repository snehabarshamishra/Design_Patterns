package com.company.app.web;



import webserverapi.HttpServletRequest;

import com.company.framework.Controller;
import com.company.framework.ControllerResolver;

public class HardCodedControllerResolver implements ControllerResolver {

	/* (non-Javadoc)
	 * @see com.misys.framework.ControllerResolver#resolve(javax.servlet.http.HttpServletRequest)
	 */
	@Override
	public Controller resolve(HttpServletRequest request){
		String uri = request.getRequestURI();
		if(uri.endsWith("register.htm")){
			return new RegisterController();
			
		}else if(uri.endsWith("cancel.htm")){
			
			return new CancelController();
			
		}else if(uri.endsWith("view.htm")){
			
			return new ViewController();
			
		}else{
			return null;
		}
	}

}
