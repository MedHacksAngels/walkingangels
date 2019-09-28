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
        return "jacob/transportation/transportation";
    }

    @GetMapping("/provideTrans")
    public String provideTrans(){

        return "jacob/transportation/provideTrans";
    }
    @PostMapping("/provideTrans")
    public String postProvideTrans(){
        return "redirect:/formsuccess";
    }

    @GetMapping("/requestTrans")
    public String requestTrans(){
        return "jacob/transportation/requestTrans";
    }
    @PostMapping("/requestTrans")
    public String postRequestTrans(){
        return "redirect:/formsuccess";
    }

//    Translation

    @RequestMapping("/translation")
    public String translation(){

        return "jacob/translation/translation";
    }

    @GetMapping("/provideLang")
    public String provideLang(){
        return "jacob/translation/provideLang";
    }
    @PostMapping("/provideLang")
    public String postprovideLang(){
        return "redirect:/formsuccess";
    }

    @GetMapping("/requestLang")
    public String requestLang(){
        return "jacob/translation/requestLang";
    }
    @PostMapping("/requestLang")
    public String postRequestLang(){
        return "redirect:/formsuccess";
    }

    @RequestMapping("/formsuccess")
    public String formsuccess(){
        return "jacob/formsuccess";
    }
}