package com.training.service;

import java.util.List;

import com.training.bean.StudentBean;

public interface StudentService {
	
	public void addStudent( StudentBean student );
	public void deleteStudent( int studentId );
	public StudentBean getStudent( int studendId );
	public List<StudentBean> getAllStudents();

}
