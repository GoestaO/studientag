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
        System.out.println("neues Geld = " + g.wechsle("EUR", "USD", 200000));

    }
}
