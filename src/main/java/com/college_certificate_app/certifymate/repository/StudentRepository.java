package com.college_certificate_app.certifymate.repository;

import com.college_certificate_app.certifymate.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity, String> {
}
