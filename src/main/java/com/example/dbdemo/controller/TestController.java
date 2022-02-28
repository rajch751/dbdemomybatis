package com.example.dbdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dbdemo.model.JwtRequest;
import com.example.dbdemo.repo.DbDemoRepo;



@RestController
@RequestMapping(value = { "/v1/user/" })
public class TestController {
	
	@Autowired
	DbDemoRepo dbremo;
	
	@PostMapping("/authenticate")
	public String authenticate(@RequestBody JwtRequest jwtRequest) throws Exception {
		System.out.println("hit"+dbremo.findById(jwtRequest.getUsername()));
		return "test";

}

	
}