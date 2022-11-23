package com.vidtube.home.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vidtube.home.Entity.Home_Entity;

public interface Home_Repos extends JpaRepository<Home_Entity,String> {

}
