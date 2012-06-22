package com.web.util;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FacesUtil {
	
	private FacesContext facesContext = FacesContext.getCurrentInstance();
	private HttpServletRequest request = ((HttpServletRequest)facesContext.getExternalContext().getRequest());
	private HttpServletResponse response = (HttpServletResponse)facesContext.getExternalContext().getResponse();

	public String getIp() {
		return request.getRemoteAddr();
	}
	
	public String getSid(){
		return request.getSession().getId();
	}
	
	public Object getSessionBean(String beanName){
		//return request.getSession().getAttribute(beanName);
		return getFacesContext().getExternalContext().getSessionMap().get(beanName);
	}
	
	public void setSessionBean(String attributeName, Object objectBean){
		request.getSession().setAttribute(attributeName, objectBean);
	}
	
	public void removeSessionBean(String beanName){
		getFacesContext().getExternalContext().getSessionMap().remove(beanName);
	}
	
	public HttpServletRequest getRequest() {
		return request;
	}

	public HttpServletResponse getResponse() {
		return response;
	}

	public FacesContext getFacesContext() {
		return facesContext;
	}

	public void redirect(String view) throws RuntimeException{
		try {
			if(view != null){
				String url = getFacesContext().getExternalContext().getRequestContextPath()+"/pages"+"/"+view;
				getFacesContext().getExternalContext().redirect(url);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	public void logout() {
		getFacesContext().getExternalContext().invalidateSession();
    }
	
	public String getRealPath(String path){
		String realPath = null;
		
		try {
			realPath = getFacesContext().getExternalContext().getRealPath(path);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
		
		return realPath;
	}
	
}
