package com.mst.StudentLibraryManagementSystem.Repositories;

import com.mst.StudentLibraryManagementSystem.Models.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {


}

