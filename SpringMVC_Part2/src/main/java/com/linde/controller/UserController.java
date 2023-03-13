package com.linde.controller;


import com.linde.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/paramDifferentName")
    @ResponseBody
    public String commonParamDifferentName(@RequestParam("name") String userName,@RequestParam("age") int age){
        System.out.println("普通参数传递name == "+userName);
        System.out.println("普通参数传递age == "+age);
        return "{'module','common param different name'}";
    }

    @RequestMapping("/pojoParam")
    @ResponseBody
    public String pojoParam(User user){
        System.out.println("pojo 参数传递name == "+user);
        return "{'module','pojo param'}";
    }

    @RequestMapping("/pojoContainPojoParam")
    @ResponseBody
    public String pojoContainPojoParam(User user){
        System.out.println("pojoContainPojoParam 参数传递name == "+user);
        return "{'module','pojo pojoContainPojoParam'}";
    }

    @RequestMapping("/arrayParam")
    @ResponseBody
    public String arrayParam(String[] likes){
        System.out.println("array 参数传递name == "+ Arrays.toString(likes));
        return "{'module','array Param'}";
    }
    @RequestMapping("/listParam")
    @ResponseBody
    public String arrayParam(@RequestParam List<String> likes){
        System.out.println("List 参数传递name == "+ likes);
        return "{'module','LIST Param'}";
    }

    @RequestMapping("/param")
    @ResponseBody
    public String commonParam(String name,int age){
        System.out.println("普通参数传递name == "+name);
        System.out.println("普通参数传递age == "+age);
        return "{'module','user param'}";
    }

    @RequestMapping("/save")
    @ResponseBody
    public String save(){
        System.out.println("springmvc save ...");
        return "{'module','user save'}";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete(){
        System.out.println("springmvc delete ...");
        return "{'module','user delete'}";
    }
}
