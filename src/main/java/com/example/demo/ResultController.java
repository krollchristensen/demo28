package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResultController {

    @Autowired
    private BrugerService brugerService;

    @GetMapping("/result")
    public String resultForm(Model model) {
        model.addAttribute("brugerliste", brugerService.returnBrugerListe());
        return "result";
    }
}
