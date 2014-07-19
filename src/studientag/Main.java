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
        SortierteListe liste = new SortierteListe();
        liste.add(13);
        System.out.println("size = " + liste.size());
        System.out.println("---------------------");
        liste.add(2);
        System.out.println("size = " + liste.size());
        System.out.println("---------------------");
        liste.add(9);
        System.out.println("size = " + liste.size());
        System.out.println("---------------------");
        liste.add(123);
        System.out.println("size = " + liste.size());
        System.out.println("---------------------");
//        liste.add(125);
//        liste.add(3);
//        System.out.println("list = " + list.size());
////        System.out.println("kopf = " + liste.getKopf().getWert());
//
//        System.out.println("count = " + liste.size());
    }
}
