package com.vidtube.home.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vidtube.home.Entity.Home_Entity;
import com.vidtube.home.Repos.Home_Repos;
import com.vidtube.home.service.Home_Service;

@Service
public class Home_ServiceImpl implements Home_Service {
	
	@Autowired
	private Home_Repos home_repos;
	
	public Home_ServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public List<Home_Entity> getData() {
		// TODO Auto-generated method stub
		return  home_repos.findAll();
	}

}
