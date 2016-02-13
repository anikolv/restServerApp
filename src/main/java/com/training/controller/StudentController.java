package com.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.training.bean.StudentBean;
import com.training.service.StudentService;

@RestController
@RequestMapping(value="/student")
@EnableWebMvc
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping(value="/get/{id}", method = RequestMethod.GET)
	public @ResponseBody StudentBean getStudent(@PathVariable("id") int studentId) {
		
		StudentBean student = studentService.getStudent(studentId);
		return student;
	}

}
