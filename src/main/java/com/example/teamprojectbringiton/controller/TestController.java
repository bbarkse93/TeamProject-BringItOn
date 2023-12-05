package com.example.teamprojectbringiton.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @GetMapping("/league-main")
    public String leagueMain(){
        return "league/leagueMain";
    }

    @GetMapping("/league-detail")
    public String leagueDetail(){
        return "league/leagueDetail";
    }
}
