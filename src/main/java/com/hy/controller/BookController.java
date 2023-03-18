package com.hy.controller;

import com.hy.entity.Book;
import com.hy.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Resource
    private BookService service;

    @RequestMapping("/selectallbasic.do")
    @ResponseBody
    public List<Book> selectBook(HttpServletResponse response) throws Exception {
       return service.selectAllBooksService();
    }

    @RequestMapping("/update.do")
    public void updateBook(Book book,HttpServletResponse response) throws IOException {
        PrintWriter w = response.getWriter();
        try {
            service.updateBook(book);
        }catch (Exception e){
            w.println("false");
        }
        w.println("success");
    }
    @RequestMapping("insert.do")
    public void insertBook(Book book,HttpServletRequest request,HttpServletResponse response) throws IOException {
        PrintWriter w = response.getWriter();
        try {
            service.insertBook(book);
        }catch (Exception e){
            w.println("false");
        }
        w.println("success");
    }
    @RequestMapping("/delete.do")
    public void deleteBook(HttpServletRequest request,HttpServletResponse response) throws IOException {
        String id = request.getParameter("id");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter w = response.getWriter();
        try {
            service.deleteBook(id);
        }catch (Exception e){
            w.println("false");
        }
        w.println("success");
    }
}
