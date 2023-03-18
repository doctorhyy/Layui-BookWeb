package com.hy.service;

import com.hy.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> selectAllBooksService();
    List<Book> selectBooksByTypeService(String type);
    int updateBook(Book book);
    int deleteBook(String id);
    int insertBook(Book book);
}
