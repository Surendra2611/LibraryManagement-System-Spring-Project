package com.mst.StudentLibraryManagementSystem.Controllers;

import com.mst.StudentLibraryManagementSystem.DTOs.AuthorEntryDTO;
import com.mst.StudentLibraryManagementSystem.DTOs.AuthorResponseDTO;
import com.mst.StudentLibraryManagementSystem.Services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("author")
public class AuthorController {

    //    / is optional : you want to write you can
    // otherwise not required


    @Autowired
    AuthorService authorService;

    @PostMapping("/add")
    public String addAuthor(@RequestBody AuthorEntryDTO authorEntryDto) {
        return authorService.createAuthor(authorEntryDto);
    }

    @GetMapping("/getAuthor")
    public AuthorResponseDTO getAuthor(@RequestParam("authorId") Integer authorId) {
        return authorService.getAuthor(authorId);
    }
}

