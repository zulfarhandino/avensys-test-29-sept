package com.dxctest.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.dxctest.dao.EventDao;
import com.dxctest.entity.Event;
import com.opensymphony.xwork2.ActionSupport;

import lombok.Getter;
import lombok.Setter;

public class AddEventAction extends ActionSupport {

	private EventDao eventDao;
	@Getter @Setter
	private String ename;
	@Getter @Setter
	private String edate;

	@Autowired
	public AddEventAction(EventDao eventDao) {
		this.eventDao = eventDao;
	}
	
	public String execute() throws ParseException {
		Date tempDate = new SimpleDateFormat("dd/MM/yyyy").parse(edate);  
		Event event = new Event(ename, tempDate);
		eventDao.save(event);
		return SUCCESS;
	}

}
