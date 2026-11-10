package com.radek;

import java.util.ArrayList;

public class Hledani {
    private ArrayList<String> jmena;

    public Hledani(ArrayList<String> jmena) {
        this.jmena = new ArrayList<>(jmena);
    }

    public ArrayList<String> getJmena() {
        return new ArrayList<>(jmena);
    }

    public int hledejJmeno(String hledane) {

        return jmena.lastIndexOf(hledane);

    }
}

