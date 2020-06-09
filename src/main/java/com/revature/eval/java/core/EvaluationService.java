package com.revature.eval.java.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class EvaluationService {

	/**
	 * 1.A Speed Converter - Convert to MilesPerHour
	 * 
	 * Write a method called toMilesPerHour that has 1 parameter of type double with
	 * the name kilometersPerHour. This method needs to return the rounded value of
	 * the calculation of type long.
	 * 
	 * If the parameter kilometersPerHour is less than 0, the method toMilesPerHour
	 * needs to return -1 to indicate an invalid value.
	 * 
	 * Otherwise if it is positive, calculate the value of miles per hour, round it
	 * and return it. For conversion and rounding use Math.round().
	 */
	static class SpeedConverter {

		public static long toMilesPerHour(double kilometersPerHour) {
		
			long mph;		
			mph=Math.round((kilometersPerHour/1.609344));	

			if(mph > 0) {				
				return  mph;
			}		 
			else {				
				return -1;
			}		
		}

		/**
		 * 1.B Speed Converter - Print Conversion
		 * 
		 * Write another method called printConversion with 1 parameter of type double
		 * with the name kilometersPerHour. This method needs to return a String and
		 * needs to calculate milesPerHour from the kilometersPerHour parameter.
		 * 
		 * The String should print in the format: "XX km/h = YY mi/h"
		 * 
		 * XX represents the original value kilometersPerHour. YY represents the rounded
		 * milesPerHour from the kilometersPerHour parameter.
		 * 
		 * If the parameter kilometersPerHour is < 0, then print the text "Invalid
		 * Value"
		 */
		public static String printConversion(double kilometersPerHour) {
			
			String printMPH= " "; 			
			long mph = toMilesPerHour(kilometersPerHour);
			
			if(kilometersPerHour> 0) {	
				printMPH  = kilometersPerHour + " km/h = " + mph + " mi/h";		
				return  printMPH;
			}		 
			else {				
				return "Invalid Value";
			}
		}
	}

	/**
	 * 2. MegaBytes and KiloBytes
	 * 
	 * Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type
	 * int with the name kiloBytes.
	 * 
	 * The method should return a String and it needs to calculate the megabytes and
	 * remaining kilobytes from the kilobytes parameter.
	 * 
	 * Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".
	 * 
	 * XX represents the original value kiloBytes. YY represents the calculated
	 * megabytes. ZZ represents the calculated remaining kilobytes.
	 * 
	 * For examples, when the parameter kiloBytes is 2500 it needs to print "2500 KB
	 * = 2 MB and 452 KB"
	 * 
	 * If the parameter kiloBytes is less than 0 then print the text "Invalid
	 * Value".
	 */
	public String printMegaBytesAndKiloBytes(int XX) {
			
		String printMBAKB = " ";
		int YY = XX/1024;
		int ZZ = XX%1024;
		
		if (XX > 0 ) {
			printMBAKB= XX + " KB = " + YY + " MB " + "and " + ZZ + " KB";	
			return printMBAKB;
		}
		else {
			return "Invalid Value";
		}
	}
	/**
	 * 3. Barking Dog
	 * 
	 * We have a dog that loves to bark. We need to wake up if the dog is barking at
	 * night!
	 * 
	 * Write a method shouldWakeUp that has 2 parameters.
	 * 
	 * 1st parameter should be of type boolean and be named "barking". It represents
	 * if our dog is currently barking. 2nd parameter represents the hour of the day
	 * and is of type int with the name hourOfDay and has a valid range of 0-23.
	 * 
	 * We have to wake up if the dog is barking before 8 or after 22 hours, so in
	 * that case return true.
	 * 
	 * In all other cases return false.
	 * 
	 * If the hourOfDay parameter is less than 0 or greater than 23, return false.
	 */
	public boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
	
		if(isBarking) {
			if (hourOfDay > 0 && hourOfDay < 8 || hourOfDay ==23) {
				return true;
			}		
			else {
			return false;
			}
		}
		return false;
	}

	/**
	 * 4. DecimalComparator
	 * 
	 * Write a method areEqualByThreeDecimalPlaces with two parameters of type
	 * double.
	 * 
	 * The method should return boolean and it needs to return true if two double
	 * numbers are the same up to three decimal places.
	 * 
	 * Otherwise, return false;
	 */
	public boolean areEqualByThreeDecimalPlaces(double firstNum, double secondNum) {
		
		if( (int) (firstNum*1000) == (int) (secondNum*1000) ){
			return true;
		}
		else {
		return false;
		}
	}

	/**
	 * 5. Teen Number Checker
	 * 
	 * We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
	 * Write a method named hasTeen with 3 parameters of type int.
	 * 
	 * The method should return boolean and it needs to return true if ONE of the
	 * parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return
	 * false.
	 */
	static class TeenNumberChecker {

		public static boolean hasTeen(int x, int y, int z) {
			if (isTeen(x) || isTeen(y) || isTeen(z) ) {
				return true;
			}
			else {
				return false;
			}
		}

		public static boolean isTeen(int number) {
			if (number > 12 &&  number < 20 )  {
				return true;
			}
			else {
				return false;
			}			
		}
	}

	/**
	 * 6. Minutes To Years and Days Calculator
	 * 
	 * Write a method printYearsAndDays with parameter of type long named minutes.
	 * The method should return a String and it needs to calculate the
	 * years and days from the minutes parameter.
	 * 
	 * If the parameter is less than 0, return "Invalid Value".
	 * 
	 * Otherwise, if the parameter is valid then it needs to return a message in the
	 * format "XX min = YY y and ZZ d".
	 * 
	 * XX represents the original value minutes. YY represents the calculated years.
	 * ZZ represents the calculated days.
	 */
	public String printYearsAndDays(long minutes) {
	
		String printYAD = " ";
		long XX = minutes;
		long YY = XX/525600; //years
		long remainingMinutes = minutes % 525600;
		long ZZ = (remainingMinutes/1440); //days
						
		if (minutes > 0 ) {
			printYAD= XX + " min = " + YY + " y " + "and " + ZZ + " d";	
			return printYAD;
		}
		else {
			return "Invalid Value";
		}
	}

	/**
	 * 7. Number In Word
	 * 
	 * Write a method called printNumberInWord. The method has one parameter number
	 * which is the whole number. The method needs to print "ZERO", "ONE", "TWO",
	 * ... "NINE", "OTHER" if the int parameter number is 0, 1, 2, .... 9 or other
	 * for any other number including negative numbers. You can use if-else
	 * statement or switch statement whatever is easier for you.
	 */
	public String printNumberInWord(int number) {
		
		String printNumberInWord = " ";
			
		printNumberInWord = Switch(number);
				
		return printNumberInWord;
	}

	private String Switch(int number) {
		
		String switchToNumber = " ";
		
		switch(number){
		
		case 0:
			switchToNumber="ZERO";
            break;
		case 1:
			switchToNumber="ONE";
            break;
        case 2:
        	switchToNumber="TWO";
            break;
        case 3:
        	switchToNumber="THREE";
            break;
        case 4:
        	switchToNumber="FOUR";
            break;
        case 5:
        	switchToNumber="FIVE";
            break;
        case 6:
        	switchToNumber="SIX";
            break;
        case 7:
        	switchToNumber=("SEVEN");
            break;
        case 8:
        	switchToNumber=("EIGHT");
            break;
        case 9:
        	switchToNumber=("NINE");
            break;
        default:
        	switchToNumber=("OTHER");
            break;    
		}
		return switchToNumber;
	}

	/**
	 * 8. Greatest Common Divisor
	 * 
	 * Write a method named getGreatestCommonDivisor with two parameters of type int
	 * named first and second.
	 * 
	 * If one of the parameters is < 10, the method should return -1 to indicate an
	 * invalid value. The method should return the greatest common divisor of the
	 * two numbers (int).
	 * 
	 * The greatest common divisor is the largest positive integer that can fully
	 * divide each of the integers (i.e. without leaving a remainder).
	 * 
	 * For example 12 and 30: 12 can be divided by 1, 2, 3, 4, 6, 12, while 30 can be
	 * divided by 1, 2, 3, 5, 6, 10, 15, 30
	 * 
	 * The greatest common divisor is 6 since both 12 and 30 can be divided by 6,
	 * and there is no resulting remainder.
	 */
	public int getGreatestCommonDivisor(int first, int second) {

		int n; //the number of times  is found common in first and second if none of them is zero
	    for (n = 0; ((first | second) & 1) == 0; n++) {
	        first >>= 1;
	        second >>= 1;
	    }
	    while ((first & 1) == 0) {
	    	first >>= 1;
	    }
	 
	    //
	    if ((first | second) >10 ) {
	    do {
	        while ((second & 1) == 0) {
	        	second >>= 10;
	        }
	    if (first > second) {
            int temp = first;
            first = second;
            second = temp;
        }
	    	second = (second - first);
	   }
	    while (second != 0);
	    return first << n;
	    }//
	    else {
	    	return -1;
	    }
	}

	/**
	 * 9. First and Last Digit Sum
	 * 
	 * Write a method named sumFirstAndLastDigit with one parameter of type int
	 * called number.
	 * 
	 * The method needs to find the first and the last digit of the parameter number
	 * passed to the method, using a loop and return the sum of the first and the
	 * last digit of that number.
	 * 
	 * If the number is negative then the method needs to return -1 to indicate an
	 * invalid value.
	 */
	public int sumFirstAndLastDigit(int num) throws NumberFormatException{			
	//		int firstDigit  = Integer.parseInt(Integer.toString(num).substring(0, 1)); find 1 digit in a number
				
			int lastDigit = num % 10;		
			int x = num;
			while(x >= 10){
				   x = num / 10;
				}
				int firstDigit = x ;
			
			if(num >=0) {		
				return firstDigit + lastDigit;
			}
				else {
				return -1;
			}
		}
	/**
	 * 10. Reverse String
	 * 
	 * Without using the StringBuilder or StringBuffer class, write a method that
	 * reverses a String. Example: reverse("example"); -> "elpmaxe"
	 */
	public String reverse(String string) {
		
		int size= string.length();
		String reverse = "";
		
		for (int i=size -1; i>=0; i--) {
			reverse = reverse + string.charAt(i);
		}
		return reverse;

	}

	/**
	 * 11. Acronyms
	 * 
	 * Convert a phrase to its acronym. Techies love their TLA (Three Letter
	 * Acronyms)! Help generate some jargon by writing a program that converts a
	 * long name like Portable Network Graphics to its acronym (PNG).
	 */
	public String acronym(String phrase) {
		
		String myAcronym = "";
		
		myAcronym += phrase.toUpperCase().charAt(0);

        for (int i = 1; i <= phrase.length() - 1; i++) {
            if (phrase.charAt(i - 1) == ' ' || phrase.charAt(i - 1) == '-') {
                myAcronym += phrase.toUpperCase().charAt(i);
            }
        }
        return myAcronym;
	}

	/**
	 * 12. Triangles
	 * 
	 * Determine if a triangle is equilateral, isosceles, or scalene. An equilateral
	 * triangle has all three sides the same length. An isosceles triangle has at
	 * least two sides the same length.
	 * 
	 * (It is sometimes specified as having exactly two sides the same length, but
	 * for the purposes of this exercise we'll say at least two.) A scalene triangle
	 * has all sides of different lengths.
	 */
	static class Triangle {
		private double sideOne;
		private double sideTwo;
		private double sideThree;

		public Triangle() {
			super();
		}

		public Triangle(double sideOne, double sideTwo, double sideThree) {
			this();
			this.sideOne = sideOne;
			this.sideTwo = sideTwo;
			this.sideThree = sideThree;
		}

		public double getSideOne() {
			return sideOne;
		}

		public void setSideOne(double sideOne) {
			this.sideOne = sideOne;
		}

		public double getSideTwo() {
			return sideTwo;
		}

		public void setSideTwo(double sideTwo) {
			this.sideTwo = sideTwo;
		}

		public double getSideThree() {
			return sideThree;
		}

		public void setSideThree(double sideThree) {
			this.sideThree = sideThree;
		}

		public boolean isEquilateral() {
			if(sideOne == sideTwo && sideOne == sideThree) {
				return true;
			}
			else {	
			return false;
			}
		}

		public boolean isIsosceles() {
			if(sideOne == sideTwo || sideTwo == sideThree || sideOne == sideThree) {
				return true;
			}
			else {	
			return false;
			}
		}

		public boolean isScalene() {
			if(sideOne != sideTwo && sideOne != sideThree && sideTwo != sideThree) {
				return true;
			}
			else {	
			return false;
			}
		}

	}

	/**
	 * 13. Scrabble Score
	 * 
	 * Given a word, compute the scrabble score for that word.
	 * 
	 * --Letter Values-- Letter Value A, E, I, O, U, L, N, R, S, T = 1; D, G = 2; B,
	 * C, M, P = 3; F, H, V, W, Y = 4; K = 5; J, X = 8; Q, Z = 10; Examples
	 * "cabbage" should be scored as worth 14 points:
	 * 
	 * 3 points for C, 1 point for A, twice 3 points for B, twice 2 points for G, 1
	 * point for E And to total:
	 * 
	 * 3 + 2*1 + 2*3 + 2 + 1 = 3 + 2 + 6 + 3 = 5 + 9 = 14
	 */
	public int getScrabbleScore(String string) {
		
		string=string.toUpperCase();
		char[] Word = string.toCharArray(); 

		int score = 0;
		
		for( Character letter: Word) {
			score += getValueOfEachLetter(letter);
			System.out.println(score);
		}
		
		return score;
	}
		int getValueOfEachLetter(char letter){		
		switch (letter) {
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
		case 'L':
		case 'N':
		case 'R':
		case 'S':
		case 'T':return 1;
	
        case 'D':
        case 'G': return 2;

        case 'B':
        case 'C':
        case 'M':
        case 'P': return 3;

        case 'F':
        case 'H':
        case 'V':
        case 'W':
        case 'Y': return 4;

        case 'K': return 5;

        case 'J':
        case 'X': return 8;

        case 'Q':
        case 'Z': return 10;

		}
		
		 return letter;
	}
		
	/**
	 * 14. Clean the Phone Number
	 * 
	 * Clean up user-entered phone numbers so that they can be sent SMS messages.
	 * 
	 * The North American Numbering Plan (NANP) is a telephone numbering system used
	 * by many countries in North America like the United States, Canada or Bermuda.
	 * All NANP-countries share the same international country code: 1.
	 * 
	 * NANP numbers are ten-digit numbers consisting of a three-digit Numbering Plan
	 * Area code, commonly known as area code, followed by a seven-digit local
	 * number. The first three digits of the local number represent the exchange
	 * code, followed by the unique four-digit number which is the subscriber
	 * number.
	 * 
	 * The format is usually represented as
	 * 
	 * 1 (NXX)-NXX-XXXX where N is any digit from 2 through 9 and X is any digit
	 * from 0 through 9.
	 * 
	 * Your task is to clean up differently formatted telephone numbers by removing
	 * punctuation and the country code (1) if present.
	 * 
	 * For example, the inputs
	 * 
	 * +1 (613)-995-0253 613-995-0253 1 613 995 0253 613.995.0253 should all produce
	 * the output
	 * 
	 * 6139950253
	 * 
	 * Note: As this exercise only deals with telephone numbers used in
	 * NANP-countries, only 1 is considered a valid country code.
	 */
	public String cleanPhoneNumber(String string) {
			
		String phoneNumber = "";
		
		phoneNumber = string.replaceAll("[^a-zA-Z0-9]", ""); //removes all special characters
		
		if (phoneNumber.length()>11 ) {
			throw new IllegalArgumentException("primitives expected");
		}
		else if (!phoneNumber.matches("^[0-9]+$")){
			throw new IllegalArgumentException("invalidWithNonNumeric");
		}
		else
		{
		return phoneNumber;
		}
	}

	/**
	 * 15. Recurring Word Counter
	 * 
	 * Given a phrase, count the occurrences of each word in that phrase.
	 * 
	 * For example for the input "olly olly in come free" olly: 2 in: 1 come: 1
	 * free: 1
	 */
	public Map<String, Integer> wordCount(String string) {
		
		Map<String, Integer> expectedWordCount = new HashMap<>();
	
	String temp[] = string.split("\\,\\\n| |\\,");
		
		for (int j = 0; j < temp.length; j++) {   
		
		String word = temp[j];
		
		int count = 0;
	      for (int i = 0; i < temp.length; i++) {
	         if (word.equals(temp[i])) 
	            count++;
	         expectedWordCount.put(word, count);	
	      }		
		}
		return expectedWordCount;
	}


	/**
	 * 16. Armstrong Number
	 * 
	 * An Armstrong number is a number that is the sum of its own digits each raised
	 * to the power of the number of digits.
	 * 
	 * For example:
	 * 
	 * 9 is an Armstrong number, because 9 = 9^1 = 9; 10 is not an Armstrong number,
	 * because 10 != 1^2 + 0^2 = 2; 153 is an Armstrong number, because: 153 = 1^3 +
	 * 5^3 + 3^3 = 1 + 125 + 27 = 153; 154 is not an Armstrong number, because: 154
	 * != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190 Write some code to determine whether
	 * a number is an Armstrong number.
	 */
	public boolean isArmstrongNumber(int input) {
		
			//n=number of digit; d=every digit, input number = input, compute d-to-power(n). 
			int n = order(input);
			int temp=input; 
			int	sum=0; 
			
	        while (temp!=0) 
	        { 
	            int d = temp%10; 
	            sum = sum + power(d,n); 
	            temp = temp/10; 
	        } 
	  
	        // It satisfies Armstrong condition 
	        return (sum == input); 
		    
		}
		
		// Let calculate input raised to the power of y
		private int power(int input, int y) {
			if( y == 0) 
	            return 1; 
	        if (y%2 == 0) 
	            return power(input, y/2)*power(input, y/2); 
	        return input*power(input, y/2)*power(input, y/2);
		}
		
		//Lwr calculate order of the number
		private int order(int input) {
			 int n = 0; 
		        while (input != 0) 
		        { 
		            n++; 
		            input = input/10; 
		        } 
		        return n; 
		}
	/**
	 * 17. Prime Factors
	 * 
	 * Compute the prime factors of a given natural number. A prime number is only
	 * evenly divisible by itself and 1.
	 * 
	 * Note that 1 is not a prime number.
	 */
	public List<Long> calculatePrimeFactorsOf(long l) {
	
		//Remain to do: work out the rest besides 1	
		
		List<Long> list=new ArrayList<Long>();
//		list.add(l);
		
		// number that 2n divide l eg 2
		while (l%2==0) {
			 list.add(2L);
			 l /= 2;
		}
		//number that divide l when l is odd eg 9
		for (int i = 3; i <= Math.sqrt(l); i+= 2) 
        { 
            while (l%i == 0) 
            {
            	list.add(i* 1L);
                l /= i; 
            }
            } 
		// when l>2
		if (l>2) {		
			//list.add(i);
			list.add(l);
        } 
		return list;
	}
		

	/**
	 * 18. Calculate Nth Prime
	 * 
	 * Given a number n, determine what the nth prime is.
	 * 
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
	 * that the 6th prime is 13.
	 * 
	 * If your language provides methods in the standard library to deal with prime
	 * numbers, pretend they don't exist and implement them yourself.
	 */
	public int calculateNthPrime(int k) {
		
		//Remain to do: catch illegal exception; only the last method does not work
		int count=0;
		
		if (k!=0) {
		
			for(int i=2; count<k; i++) {
			
				if(k%i==0) {
				++count;
				}
			}
			return count;
		} else {
			throw new IllegalArgumentException("n must be positive");
		}
	}
		

	/**
	 * 19. Pangram
	 * 
	 * Determine if a sentence is a pangram. A pangram (Greek: παν γράμμα, pan
	 * gramma, "every letter") is a sentence using every letter of the alphabet at
	 * least once. The best known English pangram is:
	 * 
	 * The quick brown fox jumps over the lazy dog.
	 * 
	 * The alphabet used consists of ASCII letters a to z, inclusive, and is case
	 * insensitive. Input will not contain non-ASCII symbols.
	 */
	public boolean isPangram(String string) {
		String lowercaseInput = string.toLowerCase();
		
		Map<Character, Integer> frequencyMap = new HashMap<>();
		
		for(char c: lowercaseInput.toCharArray()) {
			if(frequencyMap.containsKey(c)) {
				frequencyMap.put(c, 1 + frequencyMap.get(c));
				//Increment the count of this letter by 1
			} else
			{
				frequencyMap.put(c,1);
				//If this is the first time we spot this letter
				//the count should be set to 1
			}
		}
		
		for(char c = 'a'; c<='z'; c++) {
			if(!frequencyMap.containsKey(c)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 20. Sum of Multiples 
	 * 
	 * Given a number, find the sum of all the unique multiples of particular
	 * numbers up to but not including that number.
	 * 
	 * If we list all the natural numbers below 20 that are multiples of 3 or 5, we
	 * get 3, 5, 6, 9, 10, 12, 15, and 18.
	 * 
	 * The sum of these multiples is 78.
	 */
	public int getSumOfMultiples(int i, int[] set) {

		//needs to be done
		int answer = 0;
//		getSumOfMultiples =
		int siz = set.length;
		System.out.println(i);
		System.out.println(siz);
		for (int temp : set) {
			System.out.println(temp);
	//		hashSet.add(temp);
		
		}
		//System.out.println(set);
		Set<Integer> hashSet = new HashSet<Integer>();
//		
//		for (Integer m: hashSet) {
//		       m=hashSet.iterator().next();
//		}
//		hashSet.add(temp);
		
//		for (Integer m: hashSet) {
//	       m=hashSet.iterator().next();
		while (hashSet.iterator().hasNext()) {
	         System.out.println(hashSet.iterator().next());
		}
//		}	
	

		hashSet.add(6);
		hashSet.add(8);
		hashSet.add(12);
//		

	
	      Integer[] array = new Integer[hashSet.size()];	      
	      int j = 0;
	      for (Integer k: hashSet) {
	         array[j++] = k;
	      //   System.out.println(k);
	        answer = answer+ k;
	       //  System.out.println(answer);
	      }
	        
	      // 4 and 6
	      //4, 6, 8, 12 added together (multiples of 4 and 6 not to exceed 15) 
	      //15 is i
	      //5, 10, 15, 20, 25, 30, 35,40,45, 50 = 275
	//	int j = 0;
	//      for (Integer n: hashSet) {
	//         array[j++] = n;
	 //     }  
	    
	    

		
//		int sum = i * multipleTimesOf20 (multipleTimesOfI + 1)/2;
		
//		int answer = i* sum;
		
		
		
		return answer;
	}
	
	/**
	 * 21. Three Magic Numbers
	 * 
	 * You work at a casino in Las Vegas.  Your job is to program a slot machine to
	 * return 3 random numbers using the java.util.Random class.
	 * 
	 * Write a method to return an int array of 3 random numbers between 1 - 100.
	 * Generate the 3 random numbers (1 - 100 inclusive) using the java.util.Random class.
	 */
	
	public int[] threeLuckyNumbers() {
		
		Random randum = new Random();
		
		int [] threeRandom = new int[3];
		
		int randum1 = randum.nextInt(100);
		int randum2 = randum.nextInt(100);
		int randum3 = randum.nextInt(100);
		
		threeRandom [0] = randum1;
		threeRandom [1] = randum2;
		threeRandom [2] = randum3;
		
		return threeRandom;
	}
	
	/*
	 * 22. Easy Guessing Game
	 * 
	 * Create a program to generate a number between the given range:
	 * int x = minimum
	 * iny y = maximum (inclusive)
	 * 
	 * You must use the Math.random class to generate a random number between x and y.
	 */
	
	public int guessingGame(int x, int y) {
		
		int range = y-x+1;
		int random = 0;	
		for(int i=0; i<y; i++) {
			 random = (int) (Math.random() * range) + x;
		}
		return random;
	}
}

/*
 * Concatenate world countries
 
FROM world
WHERE capital = concat(name, ' City');
*/