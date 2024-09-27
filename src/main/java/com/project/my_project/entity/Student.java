package com.project.my_project.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.OffsetDateTime;

@Entity
@Table(name = "student")
@Getter
@Setter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "dob")
    private int dob;

    @Column(name = "mother name")
    private  String motherName;

    @Column(name = "gender")
    private  String gender;

    @Column(name = "mata kuliah")
    private String mataKuliah;

//    private String department;

    @CreationTimestamp
    @Column(name = "created at", nullable = false, updatable = false)
    private OffsetDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "modified at")
    private OffsetDateTime modifiedAt;

}
