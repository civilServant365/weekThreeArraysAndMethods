package week3;

import java.util.Arrays;

public class week3 {

	// Methods

	/**
	 * #1
	 * 
	 * @param sub    input array of ages
	 * @param length number of values in array
	 * @return last value of array minus the first value
	 */

	public static int arraySubtraction(int sub[], int length) {

		int agesLengthForLoop = length - 1;
		int lastMinusFirst = 0;

		for (int i = 0; i <= agesLengthForLoop; ++i) {
			if (i == agesLengthForLoop) {
				lastMinusFirst = sub[i] - sub[0];
			}
		}
		return lastMinusFirst;
	}

	/**
	 * #7.
	 * 
	 * @param word input string for concatenation
	 * @param n    number of words
	 * @return concatenated word
	 */

	public static String numberSevenMethod(String word, int n) {

		int i = 1;
		String wordDefault = new String(word);
		while (i < n) {
			i++;

			word = word + wordDefault;

		}
		return word;
	}

	/**
	 * #8
	 * 
	 * @param firstName
	 * @param lastName
	 * @return full name
	 */
	public static String numberEight(String firstName, String lastName) {
		String fullName = new String(firstName + " " + lastName);
		return fullName;
	}

	/**
	 * #9
	 * 
	 * @param oneHundredSum array to add values
	 * @return sum of values of array greater than 100-true
	 */
	public static boolean numberNine(int oneHundredSum[]) {
		int oneHundredSumValue = 0;
		boolean greaterThan = false;
		for (int i = 0; i <= oneHundredSum.length - 1; i++) {
			oneHundredSumValue += oneHundredSum[i];
		}

		if (oneHundredSumValue > 100) {
			greaterThan = true;
		}

		return greaterThan;
	}

	/**
	 * #10
	 * 
	 * @param avgDouble array of double values for which to take average
	 * @return average of array values
	 */
	public static double numberTen(double avgDouble[]) {
		double sumDoubleArrVar = 0;
		for (int i = 0; i < avgDouble.length; i++) {
			sumDoubleArrVar += avgDouble[i];
		}
		double avgDoubleValue = sumDoubleArrVar / avgDouble.length;
		return avgDoubleValue;
	}

	/**
	 * #11
	 * 
	 * @param avgDoubleOne average of first double array
	 * @param avgDoubleTwo average of second double array
	 * @return if the first array is greater average then true
	 */
	public static boolean numberEleven(double avgDoubleOne[], double avgDoubleTwo[]) {
		double sumDoubleArrVarOne = 0;
		boolean oneGreaterThanTwo = true;
		for (int i = 0; i < avgDoubleOne.length; i++) {
			sumDoubleArrVarOne += avgDoubleOne[i];
		}
		double avgDoubleValueOne = sumDoubleArrVarOne / avgDoubleOne.length;

		double sumDoubleArrVarTwo = 0;
		for (int i = 0; i < avgDoubleTwo.length; i++) {
			sumDoubleArrVarTwo += avgDoubleTwo[i];
		}
		double avgDoubleValueTwo = sumDoubleArrVarTwo / avgDoubleTwo.length;
		if (avgDoubleValueOne <= avgDoubleValueTwo) {
			oneGreaterThanTwo = false;
		}
		return oneGreaterThanTwo;

	}

	/**
	 * #12
	 * 
	 * @param isHotOutside  boolean to determine whether to buy drink
	 * @param moneyInPocket amount of cash
	 * @return true if decide to buy drink
	 */
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		boolean decision = true;
		if (isHotOutside == true && moneyInPocket > 10.50) {
			decision = true;
		} else {
			decision = false;
		}
		return decision;

	}

	/**
	 * #13
	 * 
	 * @param pennies
	 * @param nickels
	 * @param dimes
	 * @param quarters
	 * @return total change
	 */
	public static double coinCounter(int pennies, int nickels, int dimes, int quarters) {
		double totalChange = pennies * .01 + nickels * .05 + dimes * .10 + quarters * .25;
		return totalChange;
	}

//main method
	public static void main(String[] args) {
		

//1. 
		int[] ages = new int[8];

		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
		int agesLengthForAvg = ages.length;

//1B. 
		int[] ages2 = new int[9];

		ages2[0] = 3;
		ages2[1] = 9;
		ages2[2] = 23;
		ages2[3] = 64;
		ages2[4] = 2;
		ages2[5] = 8;
		ages2[6] = 28;
		ages2[7] = 93;
		ages2[8] = 50;
		int agesLength = ages.length;
		int ages2Length = ages2.length;
//1C. 
		int sum = 0;
		for (int num : ages) {
			sum = sum + num;
		}
		int avgAges = sum / agesLengthForAvg;

		System.out.println("1A. Last digit minus the first digit of the 8 digit array is "
				+ arraySubtraction(ages, agesLength) + ".");
		System.out.println("1B. Last digit minus the first digit of the 9 digit array is "
				+ arraySubtraction(ages2, ages2Length) + ".");
		System.out.println("1C. The average age of the 8 digit array is " + avgAges + ".");

//2A. 
		String names[] = new String[6];
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		double avgCharacters = 0;
		double sumCharacters = 0;
		for (int i = 0; i <= names.length - 1; i++) {

			sumCharacters = sumCharacters + names[i].length();
			avgCharacters = sumCharacters / names.length;

		}

		System.out.print("2A. The average character number of the array of strings is ");
		System.out.printf("%.2f", avgCharacters);
		System.out.println(".");
// 2B.
		System.out.print("2B. ");
		for (int i = 0; i <= names.length - 1; i++) {
			System.out.print(names[i] + " ");
		}
// 5
		int nameLengths[] = new int[6];
		System.out.println("");
		for (int i = 0; i <= names.length - 1; i++) {

			nameLengths[i] = names[i].length();
		}
		System.out.println("5. This is the nameLengths array " + Arrays.toString(nameLengths) + ".");

// 6.
		int sumNumber6 = 0;
		for (int i = 0; i <= names.length - 1; i++) {
			sumNumber6 = sumNumber6 + nameLengths[i];

		}
		System.out.println("6. This is the sum of the values of nameLength: " + sumNumber6 + ".");
// 7
		System.out.println("7. " + numberSevenMethod("Hello", 3) + ".");

//8.
		System.out.println("8. This is the full name, " + numberEight("Bob", "Ross") + ".");

// 9
		int[] oneHundredAndOne = { 33, 33, 35 };
		int[] oneHundred = { 33, 33, 34 };
		System.out
				.println("9. This prints true if the value is greater than 100: " + numberNine(oneHundredAndOne) + ".");
		System.out.println("9Test. This prints false because it is 100 or less: " + numberNine(oneHundred) + ".");
// 10
		double[] doubleArr = { 1.0, 25.23, 50.21 };
		double[] doubleArrTwo = { 1.0, 25.23, 50.21 };
		double[] doubleArrThree = { 1.1, 25.23, 50.21 };
		System.out.print("10. This is the average of a double array: ");
		System.out.printf("%.2f", numberTen(doubleArr));
		System.out.println(".");
//11.
		System.out.println("11. The average of doubleArr and doubleArrTwo is equal so numberEleven: "
				+ numberEleven(doubleArr, doubleArrTwo));
		System.out.println("11cont. The average of doubleArrThree is greater than doubleArr thus it is: "
				+ numberEleven(doubleArrThree, doubleArr));
//12.
		System.out.println(
				"12. willBuyDrink is true because both conditions are satisfied: " + willBuyDrink(true, 10.51) + ".");
		System.out.println("12. willBuyDrink is false because both conditions are not satisfied: "
				+ willBuyDrink(true, 10.50) + ".");
		System.out.println("12. willBuyDrink is false because both conditions are not satisfied: "
				+ willBuyDrink(false, 10.51) + ".");
//13.
		System.out.println("13. This is a change counter with 5 pennies, 2 nickels,");
		System.out.println(" 4 dimes, and 3 quarters. The total is: $" + coinCounter(5, 2, 4, 3) + ".");

	}

}
