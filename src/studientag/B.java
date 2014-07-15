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
public class B extends A {

    public B() {
        this.x = 40;
        System.out.println(" L4 " + x);
    }

    public void f(int x) {
        System.out.println(" L5 " + this.x);
        super.f(x);
    }

    public void g() {
        System.out.println(" L6 " + this.x);
    }

    public void f() {
        int x = 5;
        System.out.println(" L7 " + x);
        System.out.println(" L8 " + this.x);
        x++;
        this.x--;
        System.out.println(" L9 " + x);
        System.out.println(" L10 " + this.x);
    }

}
