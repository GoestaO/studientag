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
public class A {

    int x = 100;
    static int y = 200;

    public void f(int x) {
        y--;
        System.out.println(" L1 " + x);
        System.out.println(" L2 " + this.x);
        System.out.println(" L3 " + y);
    }
}
