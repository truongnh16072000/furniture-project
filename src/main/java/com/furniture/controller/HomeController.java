package com.furniture.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import jakarta.annotation.PostConstruct;
import java.io.IOException;
import java.util.Map;

@Controller
public class HomeController {

    private Map<String, Object> settings;

    @PostConstruct
    @SuppressWarnings("unchecked")
    public void init() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ClassPathResource resource = new ClassPathResource("settings.json");
        this.settings = mapper.readValue(resource.getInputStream(), Map.class);
        System.out.println("SUCCESS: settings.json loaded successfully. Keys: " + this.settings.keySet());
    }

    @ModelAttribute("settings")
    public Map<String, Object> getSettings() {
        if (this.settings == null) {
            System.err.println("CRITICAL: Settings not initialized!");
        }
        return this.settings;
    }

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
