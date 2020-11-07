package main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

		List<Numeral> numerals = Numerals.descending();

		for (Numeral numeral: numerals) {
			while (numeral.getValue() <= arabicNumber) {
				result.append(numeral.name());
				arabicNumber -= numeral.getValue();
			}
		}

		return result.toString();
	}

	/**
	 * An enum representing a roman number
	 */
	private enum Numeral {
		I(1),
		IV(4),
		V(5),
		IX(9),
		X(10);

		private final int value;

		Numeral(int value) {
			this.value = value;
		}

		/**
		 * Getter for int value
		 * @return this numeral's value
		 */
		public int getValue() {
			return value;
		}
	}

	/**
	 * Utility class to create list of numerals
	 */
	private static class Numerals {
		/**
		 * Get List of Numerals in descending order
		 * @return All numerals, in descending order
		 */
		static List<Numeral> descending() {
			return Arrays
					.stream(Numeral.values())
					.sorted(Comparator.comparingInt(Numeral::getValue).reversed())
					.collect(Collectors.toList());
		}
	}
}
