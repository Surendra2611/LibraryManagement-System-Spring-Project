package com.mst.StudentLibraryManagementSystem.Repositories;

import com.mst.StudentLibraryManagementSystem.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}