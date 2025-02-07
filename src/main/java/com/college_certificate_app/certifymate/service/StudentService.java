package com.college_certificate_app.certifymate.service;

import com.college_certificate_app.certifymate.entity.StudentEntity;

import java.util.List;

public interface StudentService {
    StudentEntity saveStudentData(StudentEntity studentEntity);
    List<StudentEntity> getStudentData();
    StudentEntity updateStudentData(StudentEntity studentEntity);
    void deleteStudentData(String id);
}
