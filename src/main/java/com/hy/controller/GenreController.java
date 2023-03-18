package com.hy.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hy.entity.Genre;
import com.hy.entity.View;
import com.hy.service.GenreService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/genre")
public class GenreController {

    @Resource
    private GenreService service;

    @RequestMapping("/readNumPie.do")
    public void genreReadNumPie(HttpServletResponse response) throws IOException {
        List<Genre> genreReadNumList = service.getGenre();
        List<View> viewList = new ArrayList<>();
        for (Genre x:genreReadNumList) {
            View view = new View();
            view.setValue(x.getReadNum());
            view.setName(x.getGenre());
            viewList.add(view);
        }
        response.setContentType("application/json;charset=utf-8");
        PrintWriter w = response.getWriter();
        ObjectMapper om =new ObjectMapper();
        String json = om.writeValueAsString(viewList);
        w.println(json);
    }
    @RequestMapping("/readNumBar.do")
    public void genreReadNumBar(HttpServletResponse response) throws IOException {
        List<Genre> genreReadNumList = service.getGenre();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (Genre x:genreReadNumList) {
            stringBuilder.append(x.getReadNum());
            stringBuilder.append(",");
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        stringBuilder.append("]");
        response.setContentType("application/json;charset=utf-8");
        PrintWriter w = response.getWriter();
        w.println(stringBuilder);
    }
    @RequestMapping("/sortNumPie.do")
    public void genreSortNumPie(HttpServletResponse response) throws IOException {
        List<Genre> genreReadNumList = service.getGenre();
        List<View> viewList = new ArrayList<>();
        for (Genre x:genreReadNumList) {
            View view = new View();
            view.setValue(x.getSortNum());
            view.setName(x.getGenre());
            viewList.add(view);
        }
        response.setContentType("application/json;charset=utf-8");
        PrintWriter w = response.getWriter();
        ObjectMapper om =new ObjectMapper();
        String json = om.writeValueAsString(viewList);
        w.println(json);
    }

    @RequestMapping("/sortNumBar")
    public void genreSortNumBar(HttpServletResponse response) throws IOException {
        List<Genre> genreReadNumList = service.getGenre();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (Genre x:genreReadNumList) {
            stringBuilder.append(x.getSortNum());
            stringBuilder.append(",");
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        stringBuilder.append("]");
        response.setContentType("application/json;charset=utf-8");
        PrintWriter w = response.getWriter();
        w.println(stringBuilder);
    }
}
