package com.dxctest.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dxctest.dao.EventDao;
import com.dxctest.entity.Event;
import com.opensymphony.xwork2.ActionSupport;

import lombok.Getter;
import lombok.Setter;

public class ListEventsAction extends ActionSupport {
	
	private EventDao eventDao;
	@Getter @Setter
	private List<Event> elist;
	
	@Autowired
	ListEventsAction(EventDao eventDao) {
		this.eventDao = eventDao;
	}
	
	public String execute() {
		elist = eventDao.findAll();
		System.out.println(elist);
		return SUCCESS;
	}

}
