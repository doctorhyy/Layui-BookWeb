package hy;

import com.hy.entity.Book;
import com.hy.entity.User;
import com.hy.entity.View;
import com.hy.service.BookService;
import com.hy.service.UserService;
import com.hy.service.impl.BookServiceImpl;
import com.hy.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;
import java.io.PrintWriter;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple App.
 */

public class AppTest 
{
    @Autowired
   private UserService userService;
    @Test
   public void aa(){
      List<User> userList= userService.selectUsersService();
        userList.forEach(System.out::println);
    }

}
