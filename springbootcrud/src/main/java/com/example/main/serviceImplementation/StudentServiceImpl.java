package com.example.main.serviceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.yaml.snakeyaml.events.Event.ID;

import com.example.main.daoRepository.StudentRepo;
import com.example.main.model.Student;
import com.example.main.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

@Autowired
	private StudentRepo studentRepo;

	@Override
	public Student saveStudent(Student student) {
		studentRepo.save(student);
		System.out.println("inserted");
		// TODO Auto-generated method stub
		return student;
	}

	@Override
	public Student updateStudent( Student student) {
		studentRepo.save(student);
		System.out.println("updated");
		// TODO Auto-generated method stub
		return student;
		
	}

	@Override
	public List<Student> findAllStudent() {
		System.out.println("findall");
		// TODO Auto-generated method stub
		return (List<Student>)studentRepo.findAll();
		
	}

	@Override
	public void deleteStudent(int id) {
		studentRepo.deleteById(id);
		System.out.println("deleted");
		// TODO Auto-generated method stub
		
	}


	

}
