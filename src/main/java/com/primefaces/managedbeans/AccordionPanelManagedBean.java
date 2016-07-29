package com.primefaces.managedbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.event.TabChangeEvent;


@ManagedBean
@SessionScoped
public class AccordionPanelManagedBean {
	
	private String journalMessage = "Welcome JournalDev !";
    private String componentMessage = "AccordionPanel Component !";
	public String getJournalMessage() {
		return journalMessage;
	}
	public void setJournalMessage(String journalMessage) {
		this.journalMessage = journalMessage;
	}
	public String getComponentMessage() {
		return componentMessage;
	}
	public void setComponentMessage(String componentMessage) {
		this.componentMessage = componentMessage;
	}
	
	 public void onChange(TabChangeEvent event) {
	        System.out.println("Tab Changed :: You've Requested Seeing :: "+ event.getTab().getTitle());
	    }

}
