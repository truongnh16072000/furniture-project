package com.furniture.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/ve-chung-toi")
    public String about() {
        return "about";
    }

    @GetMapping("/thiet-ke-noi-that")
    public String design() {
        return "design";
    }

    @GetMapping({"/thi-cong-noi-that", "/thi-cong"})
    public String construction() {
        return "construction";
    }

    @GetMapping("/phong-thuy")
    public String fengShui() {
        return "feng-shui";
    }

    @GetMapping("/du-an")
    public String projects() {
        return "projects";
    }

    @GetMapping("/tin-tuc")
    public String news() {
        return "news";
    }

    @GetMapping("/lien-he")
    public String contact() {
        return "contact";
    }
}
