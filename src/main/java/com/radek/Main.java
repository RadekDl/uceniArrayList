package com.radek;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> jmena = new ArrayList<>();
        jmena.add("Radek");
        jmena.add("Ema");
        jmena.add("Ema");
        jmena.add("Karel");
        try {


            System.out.println("výpis hledaného slova Ema pomocí continue ");
            int x = -1;
            for (int i = 0; i < jmena.size(); i++) {
                if (jmena.get(i).equals("Ema")) {
                    x = i;
                    break;
                }
            }
            if (x == -1) {
                System.out.println("jméno nenalezeno");
            }else {
                System.out.println(jmena.get(x)+ " index: "+ x);
            }

            jmena.set(1, "Alenka");
            System.out.println("výpis po změně jména:\n" + jmena.get(1));
            jmena.remove("Rade");
            System.out.println("výpis po vymazání Radek:");
            for (String seznam : jmena) {
                System.out.println(seznam);
            }

        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage() + ": chyba počtu prvků");
        }




    }
}