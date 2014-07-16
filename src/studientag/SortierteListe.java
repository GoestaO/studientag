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
public class SortierteListe {

    private Elem kopf;

    public SortierteListe() {
        this.kopf = null;
    }

    public int loescheMin() {
        if (this.kopf == null) {
            return 0;
        }
        Elem temp = this.kopf;
        this.kopf = temp.getNaechstes();
        return temp.getWert();
    }

    public void add(int w) {
        Elem newElement = new Elem(w);
        if (this.kopf == null) {//            
            this.setKopf(newElement);
        }

        Elem current = this.kopf;
//        current.setNaechstes(newElement);

        if (this.size() > 0 && newElement.getWert() < current.getWert()) {
            this.setKopf(newElement);
            newElement.setNaechstes(newElement);
            System.out.println("next = " + this.getKopf().getWert());
        } else {
            while (current != null) {
                Elem temp = current;
                current = current.getNaechstes();
                if (newElement.getWert() > current.getWert()) {
                    temp.setNaechstes(newElement);
                    newElement.setNaechstes(current);
                }                
            }
        }
    }

    public int size() {
        int count = 0;
        Elem current = this.kopf;
        while (current != null) {
            count++;
            current = current.getNaechstes();
        }
        return count;
    }

    public Elem getKopf() {
        return kopf;
    }

    public void setKopf(Elem kopf) {
        this.kopf = kopf;
    }

}
