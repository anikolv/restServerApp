package com.training.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import com.training.bean.StudentBean;

@Repository("studentDao")
@Transactional
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void addStudent(StudentBean student) {
		sessionFactory.getCurrentSession().saveOrUpdate(student);
	}

	public void deleteStudent(int studentId) {
		sessionFactory.getCurrentSession().delete(getStudent(studentId));
	}

	public StudentBean getStudent(int studendId) {
		return (StudentBean) sessionFactory.getCurrentSession().get(StudentBean.class, studendId);
	}

	public List<StudentBean> getAllStudents() {
		return  sessionFactory.getCurrentSession().createCriteria(StudentBean.class).list();
	}

}
