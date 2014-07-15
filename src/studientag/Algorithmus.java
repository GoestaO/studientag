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
public class Algorithmus {

    public void entferneDuplikate(String[] feld) {
        for (int i = 0; i < feld.length - 1; i++) {
            String zuUeberpruefen = feld[i];
            for (int j = i + 1; j < feld.length; j++) {
                if (zuUeberpruefen == null) {
                    continue;
                }
                if (zuUeberpruefen.equals(feld[j])) {
                    feld[j] = null;
                }
            }
        }
    }

    public double wurzel2(int n) {
        if (n < 0) {
            throw new RuntimeException("Negative Werte sind nicht erlaubt.");
        }
        if (n == 0) {
            return 2.0;
        }
        return wurzel2(n - 1) / 2 + 1 / wurzel2(n - 1);
    }

}
