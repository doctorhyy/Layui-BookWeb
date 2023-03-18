package com.hy.service.impl;

import com.hy.dao.BookDao;
import com.hy.entity.Book;
import com.hy.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class BookServiceImpl implements BookService {
    @Resource
    private BookDao dao;

    @Override
    public List<Book> selectAllBooksService() {
       return dao.selectAllBooks();
    }

    @Override
    public List<Book> selectBooksByTypeService(String type) {
        return dao.selectAllBooksByType(type);
    }

    @Override
    public int updateBook(Book book) {
        int nums = dao.updateBook(book);
        return nums;
    }

    @Override
    public int deleteBook(String id) {
        return dao.deleteBook(id);
    }

    @Override
    public int insertBook(Book book) {
        return dao.insertBook(book);
    }

}
