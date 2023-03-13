package com.linde.controller;

import com.linde.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ResponseController {
    @RequestMapping("/toJumpPage")
    public String toJumpPage(){
        System.out.println("跳转页面");
        return "page.jsp";
    }

    @RequestMapping("/toText")
    @ResponseBody
    public String toText(){
        System.out.println("返回纯文本数据");
        return "response text";
    }

    @RequestMapping("/toJsonPOJO")
    @ResponseBody
    public User toJsonPOJO(){
        System.out.println("返回json对象数据");
        User user = new User();
        user.setName("linde");
        user.setAge(18);
        return user;
    }

    @RequestMapping("/toListJsonPojo")
    @ResponseBody
    public List<User> toListJsonPojo(){
        System.out.println("返回list json对象数据");
        User user = new User();
        user.setName("Tiantian");
        user.setAge(20);

        User user1 = new User();
        user1.setName("Linde");
        user1.setAge(20);

        List<User> userList = new ArrayList<User>();
        userList.add(user);
        userList.add(user1);
        return userList;
    }

}
