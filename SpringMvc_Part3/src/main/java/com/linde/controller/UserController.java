package com.linde.controller;

import com.linde.domian.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

    @RequestMapping(value = "/users",method = RequestMethod.POST)
    @ResponseBody
    public String save(){
        System.out.println("springmvc save ...");
        return "{'module','user save'}";
    }

    @RequestMapping(value = "/users/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable Integer id){
        System.out.println("springmvc delete ..."+id);
        return "{'module','user delete'}";
    }

    @RequestMapping(value = "/users",method = RequestMethod.PUT)
    @ResponseBody
    public String update(@RequestBody User user){
        System.out.println("springmvc update ..."+user);
        return "{'module','user update'}";
    }

    @RequestMapping(value = "/users/{id}",method = RequestMethod.GET)
    @ResponseBody
    public String getById(Integer id){
        System.out.println("springmvc getById ..."+id);
        return "{'module','user getById'}";
    }

    @RequestMapping(value = "/users",method = RequestMethod.GET)
    @ResponseBody
    public String getAll(){
        System.out.println("springmvc getAll ...");
        return "{'module','user getAll'}";
    }
}
