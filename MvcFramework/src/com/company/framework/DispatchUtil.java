package com.company.framework;





import webserverapi.HttpServlet;
import webserverapi.HttpServletRequest;
import webserverapi.IOException;
import webserverapi.ServletException;

public class DispatchUtil {

	
	public static void sendToPage(String page, HttpServletRequest request,
			webserverapi.HttpServletResponse response) throws ServletException, IOException {
		/*RequestDispatcher rd = request.getRequestDispatcher(page);
		rd.forward(request, response);*/
	}
}
