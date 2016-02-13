package com.training.service;

import java.util.List;

import com.training.bean.StudentBean;
import com.training.dao.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;  

@Service("categoryService")
public class StudentServiceImpl implements StudentService{

	
	@Autowired
	private StudentDAO studentDao;
	
	public void addStudent(StudentBean student) {
		studentDao.addStudent(student);
		
	}

	public void deleteStudent(int studentId) {
		studentDao.deleteStudent(studentId);
	}

	public StudentBean getStudent( int studendId ) {
		return studentDao.getStudent(studendId);
	}

	public List<StudentBean> getAllStudents() {
		return studentDao.getAllStudents();
	}

}
