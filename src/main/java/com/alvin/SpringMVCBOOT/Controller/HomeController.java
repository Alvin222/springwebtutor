package com.alvin.SpringMVCBOOT.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.alvin.SpringMVCBOOT.model.Alien;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController
{
    @RequestMapping("/")
    public String home()
    {
        return "index";
    }


    @RequestMapping("add")

    public String add(@RequestParam()int num1 ,@RequestParam() int num2, Model m)
    {
        int num3 = num1 + num2;
        m.addAttribute("num3",num3);
        return  "result";

    }

    @RequestMapping("addAlien")
    public String addAlien(@ModelAttribute Alien alien , Model m){
        return "result";
    }
}