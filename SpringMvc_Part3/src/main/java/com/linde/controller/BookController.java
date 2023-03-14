package com.linde.controller;

import com.linde.domian.Book;
import com.linde.domian.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {

/*  @RequestMapping(method = RequestMethod.POST)*/
    @PostMapping
    public String save(@RequestBody Book book){
        System.out.println("springmvc books ..."+book);
        return "{'module','books save'}";
    }

    //@RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
        System.out.println("springmvc books delete ..."+id);
        return "{'module','books delete'}";
    }

    //@RequestMapping(method = RequestMethod.PUT)
    @PutMapping
    public String update(@RequestBody Book book){
        System.out.println("springmvc books update ..."+book);
        return "{'module','books update'}";
    }


    //@RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @GetMapping("/{id}")
    public String getById(Integer id){
        System.out.println("springmvc books getById ..."+id);
        return "{'module','books getById'}";
    }

    //@RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public String getAll(){
        System.out.println("springmvc books getAll ...");
        return "{'module','books getAll'}";
    }
}
