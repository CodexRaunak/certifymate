package com.college_certificate_app.certifymate.service;

import com.college_certificate_app.certifymate.entity.StudentEntity;
import com.college_certificate_app.certifymate.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public StudentEntity saveStudentData(StudentEntity studentEntity) {
        return studentRepository.save(studentEntity);
    }

    @Override
    public List<StudentEntity> getStudentData() {
        return studentRepository.findAll();
    }

    @Override
    public StudentEntity updateStudentData(StudentEntity studentEntity) {
        return studentRepository.save(studentEntity);
    }

    @Override
    public void deleteStudentData(String id) {
        studentRepository.deleteById(id);
    }


}
