package com.techsparks.authenticate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techsparks.authenticate.bean.User;
import com.techsparks.authenticate.service.UserService;

@RequestMapping(value = "/users")
@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/")
	private List<User> getUsers(){
		return userService.getAllUsers();
	}
	
	@RequestMapping(value = "/{name}")
	private User getUserByName(@PathVariable String name) {
		return userService.getUserByName(name);
	}

}
