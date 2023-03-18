package com.hy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/html")
public class HtmlController {
    @RequestMapping("/userControl.do")
    public ModelAndView userControl(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("html/control/userControl.html");
        return mv;
    }

    @RequestMapping("/collectControl.do")
    public ModelAndView collectControl(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("html/control/collectControl.html");
        return mv;
    }

    @RequestMapping("/bookControl.do")
    public ModelAndView bookControl(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("html/control/bookControl.html");
        return mv;
    }
    @RequestMapping("/addbook.do")
    public ModelAndView addBook(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("html/add/addbook.html");
        return mv;
    }
    @RequestMapping("/adduser.do")
    public ModelAndView addUser(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("html/add/adduser.html");
        return mv;
    }
    

    @RequestMapping("/barReadNum.do")
    public ModelAndView barReadNum(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("html/readNum/barReadNum.html");
        return mv;
    }
    @RequestMapping("/pieReadNum.do")
    public ModelAndView pieReadNum(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("html/readNum/pieReadNum.html");
        return mv;
    }
    @RequestMapping("/radiusReadNum.do")
    public ModelAndView radiusReadNum(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("html/readNum/radiusReadNum.html");
        return mv;
    }
    @RequestMapping("/roseReadNum.do")
    public ModelAndView roseReadNum(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("html/readNum/roseReadNum.html");
        return mv;
    }

    @RequestMapping("/barSortNum.do")
    public ModelAndView barSortNum(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("html/sortNum/barSortNum.html");
        return mv;
    }
    @RequestMapping("/pieSortNum.do")
    public ModelAndView pieSortNum(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("html/sortNum/pieSortNum.html");
        return mv;
    }
    @RequestMapping("/radiusSortNum.do")
    public ModelAndView radiusSortNum(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("html/sortNum/radiusSortNum.html");
        return mv;
    }

    @RequestMapping("/roseSortNum.do")
    public ModelAndView roseSortNum(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("html/sortNum/roseSortNum.html");
        return mv;
    }
}
