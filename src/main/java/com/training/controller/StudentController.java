package com.training.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.training.bean.StudentBean;
import com.training.dto.ResponseDTO;
import com.training.service.StudentService;

import antlr.collections.List;

@RestController
@RequestMapping(value = "/student")
@EnableWebMvc
public class StudentController {

	@Autowired
	StudentService studentService;

	@Autowired
	ResponseDTO responseDTO;

	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public @ResponseBody ResponseDTO getStudent(@PathVariable("id") int studentId) {

		try {
			StudentBean student = studentService.getStudent(studentId);
			responseDTO.setSuccess(true);
			responseDTO.setStudent(student);
		} catch (Exception e) {
			responseDTO.setSuccess(false);
			responseDTO.setMessage(e.getMessage());
		}

		return responseDTO;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public @ResponseBody ResponseDTO createStudent(@RequestBody StudentBean student) {

		try {
			studentService.addStudent(student);
			responseDTO.setSuccess(true);
		} catch (Exception e) {
			responseDTO.setSuccess(false);
		}
		return responseDTO;
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public @ResponseBody ResponseDTO deleteStudent(@PathVariable("id") int studentId) {

		try {
			studentService.deleteStudent(studentId);
			responseDTO.setSuccess(true);
		} catch (Exception e) {
			responseDTO.setSuccess(false);
		}
		return responseDTO;
	}

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public @ResponseBody ResponseDTO getAllStudents() {

		try {
			java.util.List<StudentBean> students = studentService.getAllStudents();
			responseDTO.setSuccess(true);
			responseDTO.setStudents(students);
		} catch (Exception e) {
			responseDTO.setSuccess(false);
		}
		return responseDTO;
	}
}
