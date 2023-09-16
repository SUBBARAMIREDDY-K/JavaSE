package edu.rgm.traning.sms.services;

import java.util.List;

import edu.rgm.traning.sms.model.Student;

public interface IStudentService {
	Student add(Student student);
	List<Student> getAll();
	Student getById(Integer id);
	Student update(Student student,Integer id);
	void delete(Integer id);
}
