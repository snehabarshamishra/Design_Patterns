package com.company.framework;






import webserverapi.HttpServletRequest;
import webserverapi.HttpServletResponse;
import webserverapi.IOException;
import webserverapi.ServletException;

public abstract class Controller {
	
	public final void handleRequest(HttpServletRequest request,
			HttpServletResponse response)throws ServletException,IOException
			{
				if(performSecurityScheck(request)){
					if(validateInput(request,response)){
						handleRequestInternal(request,response);
					}
				}
			}

	public abstract void handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response)throws ServletException,IOException ;

	public boolean validateInput(HttpServletRequest request,
			HttpServletResponse response) {
		System.out.println("Validating input......");
		return true;
	}

	private boolean performSecurityScheck(HttpServletRequest request) {
		System.out.println("Performing sec check......");
		return true;
	}

}
