package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BrugerController {

    @Autowired
    private BrugerService brugerService;

    @GetMapping("/registrering")
    public String registreringsForm(Model model) {
        model.addAttribute("bruger", new Bruger());
        return "registrering";
    }

    @PostMapping("/registrering")
    public String registreringSubmit(@ModelAttribute Bruger bruger) {
        brugerService.opretBruger(bruger);
        return "redirect:/result"; // Redirigerer for at vise opdateret brugerliste
    }
}
