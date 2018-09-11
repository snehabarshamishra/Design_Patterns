package com.company.framework;

import webserverapi.HttpServletRequest;

//import java.util.ResourceBundle;



public class PropertiesFileControllerResolver implements ControllerResolver {

	@Override
	public Controller resolve(HttpServletRequest request) {
		Controller c = null;
		/*try{
			ResourceBundle rb = ResourceBundle.getBundle("controller");
			String uri = request.getRequestURI();
			String clazz = rb.getString(uri);
			c = (Controller) Class.forName(clazz).newInstance();
			
		}catch (Exception e) {
			e.printStackTrace();
		}*/
		return c;
	}

}
