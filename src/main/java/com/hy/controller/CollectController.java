package com.hy.controller;


import com.hy.entity.Collect;
import com.hy.service.CollectService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;


@Controller
@RequestMapping("/collect")
public class CollectController {
    @Resource
    private CollectService collectService;
    @RequestMapping("/selectall.do")
    @ResponseBody
    public List<Collect> selectAll(){
        List<Collect> list =collectService.getAllCollects();
        list.forEach(System.out::println);
        return list;
    }
}
