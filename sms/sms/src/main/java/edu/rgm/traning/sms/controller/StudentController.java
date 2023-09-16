package edu.rgm.traning.sms.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.rgm.traning.sms.model.Student;
import edu.rgm.traning.sms.services.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/add")
	public ResponseEntity<Student> add(@Validated @RequestBody Student student)
	{
		try {
			
			return new ResponseEntity<>(studentService.add(student),HttpStatus.ACCEPTED);
		}
		catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@GetMapping("/list")
	public ResponseEntity<List<Student>> getAll(){
		try {
			List<Student> studentList = studentService.getAll();
			if(studentList.isEmpty() || studentList.size()==0) {
				return new ResponseEntity<>(null,HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(studentList,HttpStatus.CREATED);
				
		
		}
		catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/get/{id}")
	public Student getById(@PathVariable("id")Integer id) {
		return studentService.getById(id);
	}
	@PutMapping("update/{id}")
	public Student update(@RequestBody Student student,@PathVariable("id")Integer id) {
		return studentService.update(student,id);
	}
	
	@DeleteMapping
	public String delete(@PathVariable("id")Integer id) {
		studentService.delete(id);
		return "Student deleted Successfully";
	}

}
