package com.warofvar.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.warofvar.sms.entity.Student;
import com.warofvar.sms.repository.StudentRepository;
import com.warofvar.sms.service.IStudentService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements IStudentService{

	private StudentRepository studentRepository;
	
	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);	
	}
}
