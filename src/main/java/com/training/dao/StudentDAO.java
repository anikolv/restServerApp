package com.training.dao;

import java.util.List;

import com.training.bean.StudentBean;

public interface StudentDAO {
	
	public void addStudent( StudentBean student );
	public void deleteStudent( int studentId );
	public StudentBean getStudent( int studendId );
	public List<StudentBean> getAllStudents();

}
