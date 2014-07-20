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
        int returnValue = 0;
        switch (von) {
            case "EUR":
                switch (nach) {
                    case "USD":
                        returnValue = 1270 / 1000 * startvalue;

                    case "GPB":
                        returnValue = 800 / 1000 * startvalue;
                }
            case "USD":
                switch (nach) {
                    case "EUR":
                        returnValue = 780 / 1000 * startvalue;
                    case "GPB":
                        returnValue = 640 / 1000 * startvalue;
                }
            case "GBP":
                switch (nach) {
                    case "EUR":
                        returnValue = 1250 / 1000 * startvalue;
                    case "USD":
                        returnValue = 1570 / 1000 * startvalue;
                }

        }
        System.out.println("returnValue = " + returnValue);
        return returnValue;
    }

}
