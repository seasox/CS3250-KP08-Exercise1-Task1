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
		StringBuilder result = new StringBuilder();
		
		while (arabicNumber > 0) {
			result.append("I");
			arabicNumber--;
		}
		return result.toString();
	}

	private static class NotImplementedException extends RuntimeException {
		NotImplementedException(String message) {
			super(message);
		}
	}
}
