package com.mst.StudentLibraryManagementSystem.Repositories;

import com.mst.StudentLibraryManagementSystem.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
    Student findByEmail(String email);
    //select * from student where country=India;   //Return of Entities
    List<Student> findByCountry(String country);
}

