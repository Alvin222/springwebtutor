package com.alvin.SpringMVCBOOT.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("add")
    public String add(@RequestParam() int num1 , @RequestParam() int num2){
        return "result";
    }



}
