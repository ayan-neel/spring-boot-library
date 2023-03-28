package com.gl.library.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gl.library.model.GreatLearning;

@RestController
public class ExampleController {
	
	
	@GetMapping("/info")
	public GreatLearning getGreatLearning() {
		
		GreatLearning gl = 	GreatLearning.builder().courseName("Java").courseType("Programming").instructor("Harsh").build();
		return gl;
	}
	
	@PostMapping("/customInfo")
	public GreatLearning customInfo(String courseName,String courseType,String instructor) {
		
		GreatLearning gl = GreatLearning.builder().
											courseName(courseName).
											courseType(courseType).
											instructor(instructor).
											build();	
		return gl;
	
}
	

}
