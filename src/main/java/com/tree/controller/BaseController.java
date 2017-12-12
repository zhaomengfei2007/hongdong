package com.tree.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BaseController {
	public Logger logger = LoggerFactory.getLogger(this.getClass());
	public Map<String, Object> resultMap = new HashMap<String, Object>();
	protected String errMsg;
	
	protected HttpServletRequest request;
	protected HttpServletResponse response;
	protected Map<String,Object> session;
	
	protected void putToSession(String key, Object value) {
		getSession().setAttribute(key, value);
	}
	protected HttpSession getSession() {
		return getRequest().getSession();
	}
	
	protected Object getFromSession(String key) {
		return getSession().getAttribute(key);
	}
	protected String getStringFromSession(String key) {
		Object get = getSession().getAttribute(key);
		return get==null?null:get.toString();
	}
	
	public String getErrMsg() {
		return errMsg;
	}
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	public HttpServletRequest getRequest() {
		return request;
	}
	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}
	public HttpServletResponse getResponse() {
		return response;
	}
	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}
}
