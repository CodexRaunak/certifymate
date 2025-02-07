package com.college_certificate_app.certifymate.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "student")
public class StudentEntity {

    @Id
    @Column(name = "PRN")
    private String prn;

    @Column(name = "NAME")
    private String name;

    @Column(name = "COURSE")
    private String course;

    @Column(name = "SECTION")
    private String section;

    @Column(name = "SHIFT")
    private String shift;

    public StudentEntity(String prn, String name, String course, String section, String shift) {
        this.prn = prn;
        this.name = name;
        this.course = course;
        this.section = section;
        this.shift = shift;
    }

    public StudentEntity() {
    }
}
