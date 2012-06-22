package com.web.faces.listeners;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class SecurityPhaseListener implements PhaseListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3917092198608197271L;

	public SecurityPhaseListener() {
	}
	
	public PhaseId getPhaseId() {
		return PhaseId.RESTORE_VIEW;//PhaseId.ANY_PHASE;
	}
	
	public void afterPhase(PhaseEvent phaseEvent) {
		if(phaseEvent.getPhaseId() == PhaseId.RESTORE_VIEW){
			
		}
	}

	public void beforePhase(PhaseEvent phaseEvent) {

	}
}
