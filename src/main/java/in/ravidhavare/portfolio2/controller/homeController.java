package in.ravidhavare.portfolio2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {

    @GetMapping({"","/","/home"})
    public String getHomePage(){
        return "home";
    }
}
