package com.example.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.main.model.Student;
import com.example.main.serviceImplementation.StudentServiceImpl;

@RestController
@CrossOrigin("*")
public class StudentController {
	
	@Autowired
	 private StudentServiceImpl studentServiceImpl;
	
	@PostMapping(value="saveStudent")
	public Student saveStudent(@RequestBody Student student) {
		return studentServiceImpl.saveStudent(student);
	}
	
	
	@PutMapping(value="updateStudent")
	public Student updateStudent(@RequestBody Student student) {
		return studentServiceImpl.updateStudent(student);
	}
	
	@GetMapping(value="findAllStudent")
	public List<Student> FindAllStudent() {
		return studentServiceImpl.findAllStudent();
	}
	
	@DeleteMapping(value="deleteStudent")
	public void deleteStudent(int id) {
		 studentServiceImpl.deleteStudent(id);
		 
	}
	
}
