package com.hy.controller;

import com.hy.entity.User;
import com.hy.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService service;

    /**
     * 检验用户合法
     * @param request
     * @param response
     * @throws IOException
     */
    @RequestMapping("/testId.do")
    public void testUserId(HttpServletRequest request,HttpServletResponse response) throws IOException {
        String userId = request.getParameter("userId");
        response.setContentType("text/html;Charset=utf-8");
        PrintWriter w = response.getWriter();
        if (service.getUserById(userId)!=null || userId == null){
            w.println("false");
        }else{
            w.println("true");
        }
    }

    /**
     * 登录
     * @param request
     * @return
     */
    @RequestMapping("/login.do")
    public ModelAndView login(HttpServletRequest request, HttpSession session){
        String id = request.getParameter("id");
        String password =request.getParameter("password");
        ModelAndView mv = new ModelAndView();
        User dbsUser = service.getUserById(id);
        String str;
        try {
            str =dbsUser.getUserPassword();
            if (!str.equals(password)){
                mv.setViewName("jsp/error.jsp");
            }else if ("true".equals(dbsUser.getIsManager())){
                mv.setViewName("jsp/control.jsp");
                session.setAttribute("state",1);
            }else {
                mv.setViewName("jsp/success.jsp");
            }
        }catch(Exception e){
            mv.setViewName("jsp/error.jsp");
        }
         return mv;
    }

    /**
     * 添加用户
     * @param
     * @return
     */
    @RequestMapping("/add.do")
    public ModelAndView addUser(User user) throws IOException {
        ModelAndView mv= new ModelAndView();
        try {
            service.insertUserService(user);
            mv.setViewName("jsp/success.jsp");
        }catch(Exception e) {
            e.printStackTrace();
            mv.setViewName("jsp/error.jsp");
        }
        return mv;
    }

    /**
     *选出所有用户
     */

    @RequestMapping("/selectall.do")
    @ResponseBody
    public List<User> selectUser(){
        List<User> userList =service.selectUsersService();
        return userList;
    }

    /**
     * 更新用户信息
     */
    @RequestMapping("/update.do")
    public void updateUser(HttpServletResponse response,HttpServletRequest request) throws IOException {
       String userId = request.getParameter("userId");
       String userName = request.getParameter("userName");
       String userPassword = request.getParameter("userPassword");
       User user = new User();
       user.setUserId(userId);
       user.setUserName(userName);
       user.setUserPassword(userPassword);
       PrintWriter w = response.getWriter();
       try {
           service.updateUserService(user);
       }catch (Exception e){
           w.println("false");
       }
       w.println("success");
    }

    /**
     * 删除用户
     * @param response
     * @param request
     * @throws IOException
     */
    @RequestMapping("/delete.do")
    public void deleteBook(HttpServletResponse response,HttpServletRequest request) throws IOException {
        String id = request.getParameter("id");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter w = response.getWriter();
        try {
            service.deleteUser(id);
        }catch (Exception e){
            w.println("false");
        }
        w.println("success");
    }

    @RequestMapping("/logout.do")
    public ModelAndView logout(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/jsp/logout.jsp");
        return mv;
    }
}
