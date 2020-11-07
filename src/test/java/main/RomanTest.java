package main;


import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class RomanTest {

    @Test
    public void testAllCases() {
        Map<Integer, String> m = new HashMap<>();
        m.put(1, "I");
        m.put(2, "II");
        m.put(3, "III");
        m.put(4, "IV");
        m.put(5, "V");
        m.put(6, "VI");
        m.put(7, "VII");
        m.put(8, "VIII");
        m.put(9, "IX");
        m.put(10, "X");;
        m.put(14, "XIV");
        m.put(15, "XV");
        m.put(20, "XX");
        Roman roman = new Roman();
        for (Integer arabicNumber: m.keySet()) {
            String romanNumber = m.get(arabicNumber);
            assertEquals(romanNumber, roman.toRoman(arabicNumber));
        }
    }
}
