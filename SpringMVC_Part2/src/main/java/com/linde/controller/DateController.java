package com.linde.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping("/date")
public class DateController {

    @RequestMapping("/dateParam")
    @ResponseBody
    public String dateParam(Date date,
                            @DateTimeFormat(pattern = "yyyy-MM-dd") Date date1,
                            @DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss") Date date2){
        System.out.println("date参数传递(标准格式) (yyyy/mm/dd) -->"+date);
        System.out.println("date参数传递(转换格式) (yyyy-mm-dd)-->"+date1);
        System.out.println("date参数传递(日期格式) (yyyy/mm/dd HH:mm:ss)-->"+date2);
        return "{'module','date param'}";
    }
}
