package webserverapi;

public interface HttpServletRequest {

	String getParameter(String string);

	String getRequestURI();

	void setAttribute(String name, Object value);

}
