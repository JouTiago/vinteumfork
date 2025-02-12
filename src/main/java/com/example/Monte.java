package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Monte {
    private List<Carta> cartas = new ArrayList<>();    

    public Monte() {
        for (int i = 0; i <= 13; i++) {
        //     cartas.add(new Carta(i, Naipe.Clubs));
        //     cartas.add(new Carta(i, Naipe.Spades));
        //     cartas.add(new Carta(i, Naipe.Diamonds));
        //     cartas.add(new Carta(i, Naipe.Hearts));
            for (Naipe naipe : Naipe.values()) {
                cartas.add(new Carta(i, naipe));
            }
        }   
    }

    public void embaralhar(){
        Collections.shuffle(cartas);
    }

    public Carta virar(){    
        return cartas.remove(0);
    }
    
}
