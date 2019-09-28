package com.medhacks.walkingangels.jacob;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JacobController {

//    Transportation

    @RequestMapping("/transportation")
    public String trans(){
        return "transportation";
    }

    @GetMapping("/provideTrans")
    public String provideTrans(){

        return "provideTrans";
    }
    @PostMapping("/provideTrans")
    public String postProvideTrans(){
        return "redirect:/formsuccess";
    }

    @GetMapping("/requestTrans")
    public String requestTrans(){
        return "requestTrans";
    }
    @PostMapping("/requestTrans")
    public String postRequestTrans(){
        return "redirect:/formsuccess";
    }

//    Translation

    @RequestMapping("/translation")
    public String translation(){

        return "translation";
    }

    @GetMapping("/provideLang")
    public String provideLang(){
        return "provideLang";
    }
    @PostMapping("/provideLang")
    public String postprovideLang(){
        return "redirect:/formsuccess";
    }

    @GetMapping("/requestLang")
    public String requestLang(){
        return "requestLang";
    }
    @PostMapping("/requestLang")
    public String postRequestLang(){
        return "redirect:/formsuccess";
    }

    @RequestMapping("/formsuccess")
    public String formsuccess(){
        return "formsuccess";
    }
}