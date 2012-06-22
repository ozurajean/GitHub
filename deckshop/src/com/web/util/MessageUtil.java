package com.web.util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class MessageUtil {
	private FacesMessage facFacesMessage = new FacesMessage();
	
	public void showInfoMessage(String summary, String detail){
		facFacesMessage.setSeverity(FacesMessage.SEVERITY_INFO);
		showMessage(summary, detail);
	}
	
	public void showWarnMessage(String summary, String detail){
		facFacesMessage.setSeverity(FacesMessage.SEVERITY_WARN);
		showMessage(summary, detail);
	}
	
	public void showFatalMessage(String summary, String detail){
		facFacesMessage.setSeverity(FacesMessage.SEVERITY_FATAL);
		showMessage(summary, detail);
	}
	
	public void showErrorMessage(String summary, String detail){
		facFacesMessage.setSeverity(FacesMessage.SEVERITY_ERROR);
		showMessage(summary, detail);
	}
	
	private void showMessage(String summary, String detail){
		facFacesMessage.setSummary(summary);
		facFacesMessage.setDetail(detail);
		FacesContext.getCurrentInstance().addMessage(null, facFacesMessage);
	}

}
