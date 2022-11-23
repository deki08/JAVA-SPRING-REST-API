package com.vidtube.home.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vidtube.home.Entity.Home_Entity;
import com.vidtube.home.service.Home_Service;


@RestController
@CrossOrigin(origins = "*")
public class Home_Controller {
	
	@Autowired
	private Home_Service home_service;
	
	@GetMapping("/home")
	public List<Home_Entity> HomeVideo()
	{	
		return  this.home_service.getData();
	}
	
}
