package com.example.demo;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BrugerService {
    private final List<Bruger> brugerListe = new ArrayList<>();

    public void opretBruger(Bruger bruger){
        brugerListe.add(bruger);
    }

    public List<Bruger> returnBrugerListe(){
        return brugerListe;
    }
}
