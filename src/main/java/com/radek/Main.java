package com.radek;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        ArrayList<String> jmena = new ArrayList<>();
//        jmena.add("Radek");
//        jmena.add("Ema");
//        jmena.add("Ema");
//        jmena.add("Karel");
//        try {
//            int x = -1;
//            for (int i = 0; i < jmena.size(); i++) {
//                if (jmena.get(i).equals("Ema")) {
//                    x = i;
//                    break;
//                }
//            }
//            if (x == -1) {
//                System.out.println("jméno nenalezeno");
//            }else {
//                System.out.println(jmena.get(x)+ " index: "+ x);
//            }
//
//            jmena.set(1, "Alenka");
//            System.out.println("výpis po změně jména:\n" + jmena.get(1));
//
//            String jmenoKeSmazani = "Rade";
//            if (jmena.remove(jmenoKeSmazani)){
//                System.out.println("jméno: " + jmenoKeSmazani + " smazáno");
//            }else{
//                System.out.println("jméno: " + jmenoKeSmazani + " nenalezeno");
//            }
//            System.out.println("výpis po vymazání Radek:");
//            for (String seznam : jmena) {
//                System.out.println(seznam);
//            }
//
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println(e.getMessage() + ": chyba počtu prvků");
//        }
        ArrayList<Integer>cisla = new ArrayList<>();
        cisla.add(0, 5);
        cisla.add(1, 10);
        cisla.add(2, 15);



        for (int seznamCisel: cisla){
            System.out.println(seznamCisel);
        }

        cisla.remove(Integer.valueOf(10));
//        System.out.println("po smazání remove(1)");
        System.out.println("po smazání remove(Integer.valueOf(10))");

        for (int seznamCisel: cisla){
            System.out.println(seznamCisel);
        }







    }
}