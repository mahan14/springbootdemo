package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.util.CalendarFactory;

@Service
public class Calculator {

	@Autowired
	private CalendarFactory cl;

}
