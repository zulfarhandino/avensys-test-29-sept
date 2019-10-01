package com.dxctest.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="event")
@Getter @Setter @NoArgsConstructor
public class Event {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String ename;
	private Date edate;
	
	public Event(String ename, Date edate) {
		this.ename = ename;
		this.edate = edate;
	}
}
