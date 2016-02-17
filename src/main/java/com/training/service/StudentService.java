package com.training.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.training.bean.StudentBean;
import com.training.dto.ResponseDTO;

public interface StudentService {
	
	public void addStudent( StudentBean student );
	public void deleteStudent( int studentId );
	public StudentBean getStudent( int studendId );
	public List<StudentBean> getAllStudents();
	public ResponseDTO converToDTO(boolean success, String message, StudentBean student, List<StudentBean> students);

}
