package com.training.service;

import java.util.List;
import com.training.bean.StudentBean;
import com.training.dao.StudentDAO;
import com.training.dto.ResponseDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO studentDao;

	@Autowired
	private ResponseDTO responseDTO;

	public void addStudent(StudentBean student) {
		studentDao.addStudent(student);

	}

	public void deleteStudent(int studentId) {
		studentDao.deleteStudent(studentId);
	}

	public StudentBean getStudent(int studendId) {
		return studentDao.getStudent(studendId);
	}

	public List<StudentBean> getAllStudents() {
		return studentDao.getAllStudents();
	}

	public ResponseDTO converToDTO(boolean success, String message, StudentBean student, List<StudentBean> students) {
		responseDTO.setSuccess(success);
		responseDTO.setMessage(message);
		responseDTO.setStudent(student);
		responseDTO.setStudents(students);

		return responseDTO;
	}

}
