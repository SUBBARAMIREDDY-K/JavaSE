package edu.Traning.java.services;

import java.util.List;

import edu.TraningWithRam.Student;

public interface IStudentService {
	boolean addStudent(Student student);
	List<Student> GetAll();
	Student GetById();
	boolean updateStudent(Student student);
	public boolean deleteStudent(int id);

}
