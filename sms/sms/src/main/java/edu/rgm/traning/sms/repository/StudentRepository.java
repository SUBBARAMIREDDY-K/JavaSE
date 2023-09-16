package edu.rgm.traning.sms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.rgm.traning.sms.model.Student;
           //crud repository acts as the Hibernate to connect with the database
@Repository
public interface StudentRepository extends CrudRepository<Student,Integer>{
	
}
