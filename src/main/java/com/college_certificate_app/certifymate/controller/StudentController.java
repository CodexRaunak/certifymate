package com.college_certificate_app.certifymate.controller;

import com.college_certificate_app.certifymate.entity.StudentEntity;
import com.college_certificate_app.certifymate.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping(value = "/student")
    public ResponseEntity<StudentEntity> saveStudentData(@RequestBody StudentEntity studentEntity) {
        try {
            studentService.saveStudentData(studentEntity);
            return new ResponseEntity<>(HttpStatusCode.valueOf(200));
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatusCode.valueOf(500));
        }
    }

    @GetMapping(value = "/students")
    public ResponseEntity<List<StudentEntity>> getStudentData() {
        try {
            List<StudentEntity> studentEntities = studentService.getStudentData();
            return new ResponseEntity<>(studentEntities, HttpStatusCode.valueOf(200));
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatusCode.valueOf(500));
        }
    }

    @PutMapping(value = "/student")
    public ResponseEntity updateStudentData(@RequestBody StudentEntity studentEntity) {
        try {
            studentService.updateStudentData(studentEntity);
            return new ResponseEntity<>(HttpStatusCode.valueOf(200));
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatusCode.valueOf(500));
        }
    }

    @DeleteMapping(value = "/student")
    public ResponseEntity deleteUserData(@RequestParam String id) {
        try {
            studentService.deleteStudentData(id);
            return new ResponseEntity<>(HttpStatusCode.valueOf(200));
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatusCode.valueOf(500));
        }
    }
}
