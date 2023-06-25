package com.amanpreet.studentManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amanpreet.studentManagement.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
