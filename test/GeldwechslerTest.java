/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static junit.framework.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import studientag.Geldwechsler;

/**
 *
 * @author goesta
 */
public class GeldwechslerTest {

    Geldwechsler g;

    public GeldwechslerTest() {
    }

    @Before
    public void setUp() {
        g = new Geldwechsler();
    }

    @Test
    public void testeWechsler() {
        assertEquals("Die Umrechnung von Euro in Dollar ist nicht korrekt.", 2540, g.wechsle("EUR", "USD", 2000));
        assertEquals("Die Umrechnung von Dollar in Pfund ist nicht korrekt.", 1280, g.wechsle("USD", "GBP", 2000));
        assertEquals("Die Umrechnung von Pfund in Euro ist nicht korrekt.", 2500, g.wechsle("GBP", "EUR", 2000));
    }

}
