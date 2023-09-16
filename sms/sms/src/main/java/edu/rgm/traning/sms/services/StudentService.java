package edu.rgm.traning.sms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.rgm.traning.sms.model.Student;
import edu.rgm.traning.sms.repository.StudentRepository;

@Service
public class StudentService implements IStudentService{

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public Student add(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAll() {
		// to get the list of student details from the database
		return (List<Student>)studentRepository.findAll();
	}

	@Override
	public Student getById(Integer id) {
		//to get student details based on id
		return studentRepository.findById(id).get();
	}

	@Override
	public Student update(Student student, Integer id) {
		
		return studentRepository.save(student);
	}

	@Override
	public void delete(Integer id) {
		studentRepository.deleteById(id);
		
	}
	
}
