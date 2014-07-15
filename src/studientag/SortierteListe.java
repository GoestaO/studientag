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
        Elem element = new Elem(w);
        if (this.kopf == null) {
            this.kopf = element;
        }
        
        Elem temp = this.kopf;
        this.setKopf(element);
        element.setNaechstes(temp);
        
        
        while (element.getWert() > temp.getWert()) {
            temp = temp.getNaechstes();
            
        }
        
    }
    
    public Elem getKopf() {
        return kopf;
    }
    
    public void setKopf(Elem kopf) {
        this.kopf = kopf;
    }
    
}
