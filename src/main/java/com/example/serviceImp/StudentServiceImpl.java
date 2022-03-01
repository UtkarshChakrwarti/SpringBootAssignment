package com.example.serviceImp;

import com.example.entity.Student;
import com.example.repository.StudentRepository;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
//import com.example.service.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Transactional
    public Student save(Student student) {
        Student createResponse = studentRepository.save(student);
        return createResponse;
    }

    @Transactional
    public Student update(Student student) {
        Student updateResponse = studentRepository.save(student);
        return updateResponse;
    }

    @Transactional
    public Student get(Long id) {
        Optional<Student> studentResponse = studentRepository.findById(id);
        Student getResponse = studentResponse.get();
        return getResponse;
    }

    @Transactional
    public void delete(Student student) {
        studentRepository.delete(student);
    }
}