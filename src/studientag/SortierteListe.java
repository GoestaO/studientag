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
/**
 * Löscht den kleinsten Wert in der sortierten Liste und gibt diesen aus
 * @return 
 */
    public int loescheMin() {
        if (this.kopf == null) {
            return 0;
        }
        // Kleinster Wert = Listenkopf -> den Kopf löschen und 
        // den nächsten Wert als Kopf setzen
        Elem temp = this.kopf;
        this.kopf = temp.getNaechstes();
        return temp.getWert();
    }

    public void add(int w) {
        // Neues Element erzeugen
        Elem newElement = new Elem(w);
        System.out.println("newElement = " + newElement.getWert());
        // Wenn die Liste leer ist, das neue Element als Kopf setzen
        if (this.kopf == null) {
            this.setKopf(newElement);
        }

        // Wenn der Wert des neuen Element kleiner als der Kopf ist, wird das neue Element der Kopf
        if (newElement.getWert() < this.getKopf().getWert()) {
            Elem temp = this.getKopf();
            this.setKopf(newElement);
            newElement.setNaechstes(temp);
        } else {
            // Ansonsten wird solange durch die Liste gelaufen, bis die Stelle
            // zum einsetzen des neuen Elements gefunden wurde, die richtige Stelle ist, 
            // wenn der auf den aktuellen folgende Wert größer ist als der neu einzusetzende Wert
            Elem current = this.kopf;
            while (current.getNaechstes() != null && current.getNaechstes().getWert() < newElement.getWert()) {
                current = current.getNaechstes();
            }

            // Das Element "rechts" von dem einzusetzenden neuen Element
            Elem temp = current.getNaechstes();

            // Neues Element rechts von dem aktuellen Element einsetzen und als nächstes Element setzen
            current.setNaechstes(newElement);

            // Das Element "rechts" als nächstes Element von dem eingesetzten neuen Element setzen
            newElement.setNaechstes(temp);
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
