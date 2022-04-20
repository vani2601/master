package com.example.main.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event.ID;

import com.example.main.model.Student;

@Repository

public interface StudentService {
	
	public Student saveStudent(Student student);
	public Student updateStudent(Student student);
	public List<Student> findAllStudent();
	public void deleteStudent(int id);

}
