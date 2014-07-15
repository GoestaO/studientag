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
// Implementieren eines Listenelements
public class Elem {
// gespeicherter Wert

    private final int wert;
    private Elem naechstes;

// erzeugt ein neues Element mit übergebenem Wert
    public Elem(int w) {
        this.wert = w;
    }

    //Getter und Setter
    public Elem getNaechstes() {
        return naechstes;
    }

    public void setNaechstes(Elem naechstes) {
        this.naechstes = naechstes;
    }
    
    public int getWert(){
        return this.wert;
    }

}
