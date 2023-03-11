package com.mst.StudentLibraryManagementSystem.DTOs;

import com.mst.StudentLibraryManagementSystem.Enums.Genre;

public class BookResponseDTO {
    private String name;
    private int pages;
    private Genre genre;
    private String authorName;

    public BookResponseDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
