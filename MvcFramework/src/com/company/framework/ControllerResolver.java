package com.company.framework;

import webserverapi.HttpServletRequest;



public interface ControllerResolver {

	public abstract Controller resolve(HttpServletRequest request);

}