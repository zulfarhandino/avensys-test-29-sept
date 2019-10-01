package com.dxctest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxctest.entity.Event;

@Repository
public interface EventDao extends JpaRepository<Event, Integer> {
	
}
