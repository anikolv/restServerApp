package com.training.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;

import com.training.bean.StudentBean;

@XmlRootElement(name = "response")
@Component("responseDTO")
public class ResponseDTO {

	private boolean success;
	private List<StudentBean> students;
	private StudentBean student;
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public StudentBean getStudent() {
		return student;
	}

	public void setStudent(StudentBean student) {
		this.student = student;
	}

	public List<StudentBean> getStudents() {
		return students;
	}

	public void setStudents(List<StudentBean> students) {
		this.students = students;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

}