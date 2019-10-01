package com.dxctest.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.dxctest.dao.EventDao;
import com.opensymphony.xwork2.ActionSupport;

import lombok.Getter;
import lombok.Setter;

public class DeleteEventAction extends ActionSupport {
	
	private EventDao eventDao;
	@Getter @Setter
	private int id;

	@Autowired
	public DeleteEventAction(EventDao eventDao) {
		this.eventDao = eventDao;
	}

	public String execute() {
		eventDao.deleteById(id);
		return SUCCESS;
	}
}
