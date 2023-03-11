package com.mst.StudentLibraryManagementSystem.Services;

import com.mst.StudentLibraryManagementSystem.DTOs.*;
import com.mst.StudentLibraryManagementSystem.Models.Author;
import com.mst.StudentLibraryManagementSystem.Models.Book;
import com.mst.StudentLibraryManagementSystem.Repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;


    public String createAuthor(AuthorEntryDTO authorEntryDto){



        //Important step is : in the params : the object i
        //of type DTO but the repository interacts only with entities

        //Solutoion : Convert authorEntryDto ---> Author

        //Created an object of type Author
        Author author = new Author();

//this is
        //we are setting its attribute so that we can save
        //correct values in the db.
        author.setName(authorEntryDto.getName());
        author.setAge(authorEntryDto.getAge());
        author.setCountry(authorEntryDto.getCountry());
        author.setRating(authorEntryDto.getRating());

        authorRepository.save(author);
        return "Author added successfully";
    }
    public AuthorResponseDTO getAuthor(Integer authorId){

        Author author =  authorRepository.findById(authorId).get();
        AuthorResponseDTO authorResponseDto = new AuthorResponseDTO();
        //Set its attributes.
        //List<Book> --> List<BookResponseDto>
        List<Book> bookList = author.getBooksWritten();

        List<BookResponseDTO> booksWrittenDto = new ArrayList<>();

        for(Book b : bookList){

            BookResponseDTO bookResponseDTO = new BookResponseDTO();
            bookResponseDTO.setGenre(b.getGenre());
            bookResponseDTO.setPages(b.getPages());
            bookResponseDTO.setName(b.getName());
            bookResponseDTO.setAuthorName(b.getName());
            booksWrittenDto.add(bookResponseDTO);
        }
        //Set attributes for authorResponse Dto
        authorResponseDto.setBooksWritten(booksWrittenDto);
        authorResponseDto.setName(author.getName());
        authorResponseDto.setAge(author.getAge());
        authorResponseDto.setRating(author.getRating());

        return authorResponseDto;

    }

}
