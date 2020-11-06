package main;


import org.junit.Test;

import static org.junit.Assert.*;

public class RomanTest {

    @Test
    public void testI() {
        Roman roman = new Roman();
        assertEquals(roman.toRoman(1), "I");
    }

}
