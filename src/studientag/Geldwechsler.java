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
public class Geldwechsler {
/**
 * Gibt den Wert einer Währung (EUR, USD, GBP) in einer anderen Währung aus
 * @param von die Ausgangswährung
 * @param nach in die zu wechselnde Währung
 * @param startvalue der zu wechselnde Betrag
 * @return 
 */
    public int wechsle(String von, String nach, int startvalue) {
//- 10,00 EURO werden zu 12,70 DOLLAR
//- 10,00 EURO werden zu 8,00 PFUND
//- 10,00 DOLLAR werden zu 7,80 EURO
//- 10,00 DOLLAR werden zu 6,40 PFUND
//- 10,00 PFUND werden zu 12,50 EURO
//- 10,00 PFUND werden zu 15,70 DOLLAR
        if (!((von.equals("EUR") || von.equals("USD") || von.equals("GBP")) && (nach.equals("EUR") || nach.equals("USD") || nach.equals("GBP")))) {
            throw new IllegalArgumentException("Ungültige Währung!");
        }
        if (von.equals(nach)) {
            return startvalue;
        }
        double result = 0;
        switch (von) {
            case "EUR":
                switch (nach) {
                    case "USD":
                        result = 1.27 * startvalue;
                        break;

                    case "GPB":
                        result = 0.8 * startvalue;
                        break;
                }
                break;
            case "GBP":
                switch (nach) {
                    case "EUR":
                        result = 1.25 * startvalue;
                        break;
                    case "USD":
                        result = 1.57 * startvalue;
                        break;
                }
                break;
            case "USD":
                switch (nach) {
                    case "EUR":
                        result = 0.78 * startvalue;
                        break;
                    case "GBP":
                        result = startvalue * 0.64;
                        break;
                }
                break;

        }
        return (int) result;
    }

}
