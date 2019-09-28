package com.medhacks.walkingangels;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    private UserService userService;


    @RequestMapping("/")
    public String index(){
        return "index";
    }

    /* Addition for separate log out page */
    @RequestMapping("/logoutconfirm")
    public String logoutconfirm(){
        return "logoutconfirm";
    }


}
