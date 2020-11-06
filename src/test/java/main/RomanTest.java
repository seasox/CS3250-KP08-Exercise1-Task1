package main;


import org.junit.Test;

import static org.junit.Assert.*;

public class RomanTest {

    @Test
    public void testI() {
        Roman roman = new Roman();
        assertEquals(roman.toRoman(1), "I");
    }

    @Test
    public void testII() {
        Roman roman = new Roman();
        assertEquals(roman.toRoman(2), "II");
    }

    @Test
    public void testIII() {
        Roman roman = new Roman();
        assertEquals(roman.toRoman(3), "III");
    }
}
