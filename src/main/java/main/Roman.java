package main;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Roman {
	
	public Roman() {
		
	}
	
	/**
	 * Converts an Arabic number into a Roman number.
	 * 
	 * @param arabicNumber The Arabic number to convert.
	 * @return The corresponding Roman number as String.
	 */
	public String toRoman(int arabicNumber) {
		if (arabicNumber == 1) {
			return "I";
		} else if (arabicNumber == 2) {
			return "II";
		} else if (arabicNumber == 3) {
			return "III";
		}
		throw new NotImplementedException("Roman numbers not implemented for " + arabicNumber);
	}

	private static class NotImplementedException extends RuntimeException {
		NotImplementedException(String message) {
			super(message);
		}
	}
}
