package main;

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

		if (arabicNumber >= 4) {
			result.append("V");
			arabicNumber -= 5;
		}
		for (int i = arabicNumber; i < 0; ++i) {
			result.insert(0, "I");
		}
		for (int i = arabicNumber; i > 0; --i) {
			result.append("I");
		}
		return result.toString();
	}

}
