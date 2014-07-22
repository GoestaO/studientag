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

    public int wechsle(String von, String nach, int startvalue) {
//- 10,00 EURO werden zu 12,70 DOLLAR
//- 10,00 EURO werden zu 8,00 PFUND
//- 10,00 DOLLAR werden zu 7,80 EURO
//- 10,00 DOLLAR werden zu 6,40 PFUND
//- 10,00 PFUND werden zu 12,50 EURO
//- 10,00 PFUND werden zu 15,70 DOLLAR
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
            case "GBP":
                switch (nach) {
                    case "EUR":
                        result = 1250 / 1000 * startvalue;
                        break;
                    case "USD":
                        result = 1570 / 1000 * startvalue;
                        break;
                }
            case "USD":
                switch (nach) {
                    case "EUR":
                        result = 780 / 1000 * startvalue;
                        break;
                    case "GPB":
                        result = 640 / 1000 * startvalue;
                        break;
                }

        }
        return (int) result;
    }

}
