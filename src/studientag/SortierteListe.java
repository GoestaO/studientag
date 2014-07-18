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
        if (this.kopf == null) {
            this.setKopf(newElement);
        }
        if (newElement.getWert() < this.getKopf().getWert()) {
            Elem temp = this.getKopf();
            this.setKopf(newElement);
            newElement.setNaechstes(temp);
        } else {
            Elem current = this.kopf;
            while (current != null && current.getWert() < newElement.getWert()) {
                current = current.getNaechstes();
            }
            System.out.println("newElement = " + newElement.getWert());
            System.out.println("current = " + current);
            Elem temp = current.getNaechstes();
            current.setNaechstes(newElement);
            newElement.setNaechstes(temp);

//            this.setKopf(newElement);
//            newElement.setNaechstes(current);
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
