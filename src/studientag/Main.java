/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studientag;

/**
 *
 * @author goesta
 */
public class Main {

    public static void main(String[] args) {
        SortierteListe liste = new SortierteListe();
        liste.add(13);
        System.out.println("kopf = " + liste.getKopf().getWert());
        liste.add(2);
        System.out.println("kopf = " + liste.getKopf().getWert());
//        liste.add(11);
//        liste.add(9);

    }
}
