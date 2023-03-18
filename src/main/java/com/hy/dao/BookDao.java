package com.hy.dao;

import com.hy.entity.Book;

import java.util.List;

public interface BookDao {
    List<Book> selectAllBooks();
    List<Book> selectAllBooksByType(String type);
    int updateBook(Book book);
    int deleteBook(String id);
    int insertBook(Book book);
}
