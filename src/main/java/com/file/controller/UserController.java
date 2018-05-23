package com.file.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.file.service.UserService;

@RestController
@RequestMapping("/file")
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/test")
	public String test() {
		return "Rest service working fine";
	}
	
	@PostMapping("/csv")
	public String uploadCSV(@RequestParam("file")MultipartFile file) {
		return userService.uploadCSV(file);
	}
	
	@PostMapping("/excel")
	public String uploadEXCEL(@RequestParam("file") MultipartFile file) {
		return userService.uploadEXCEL(file);
	}
	
}
