/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studientag;

import studientag.ke6.LinkedList;

/**
 *
 * @author goesta
 */
public class Main {

    public static void main(String[] args) {
//        SortierteListe liste = new SortierteListe();
//        liste.add(13);
//        liste.add(2);
//        liste.add(9);
//        liste.add(123);
//        liste.add(1);
//        System.out.println("löschen: " + liste.loescheMin());
//        System.out.println("löschen: " + liste.loescheMin());
//        System.out.println("löschen: " + liste.loescheMin());
//        System.out.println("löschen: " + liste.loescheMin());
//        System.out.println("löschen: " + liste.loescheMin());
        Geldwechsler g = new Geldwechsler();
        try{
            g.wechsle("EUR", "USD", 2000);
            g.wechsle("EUR", "GBP", 2000);
            g.wechsle("USD", "EUR", 2000);
            g.wechsle("USD", "GBP", 2000);
            g.wechsle("GBP", "EUR", 2000);
            g.wechsle("GBP", "USD", 2000);
            g.wechsle("FRA", "EUR", 2000);
            g.wechsle("GBP", "FRA", 2000);
            
        }catch(IllegalArgumentException iaex){
            System.err.println(iaex + ": Diese Währung ist nicht gültig, bitte mal überprüfen!");
        }
        
//        String von = "EUR";
//        String nach = "USD";
//        System.out.println(!((von.equals("EUR") || von.equals("USD") || von.equals("GBP")) && (nach.equals("EUR") || nach.equals("USD") || nach.equals("GBP"))));

//        
    }
}
