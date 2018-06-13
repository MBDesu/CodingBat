package com.experimental.coding.bat.exercises;

public class WarmupExercises {

	public static void main(String[] args) {
		new WarmupExercises();
	}

	public WarmupExercises() {

	}
	
	/*
	 * The parameter weekday is true if it is a weekday, and the parameter
	 * vacation is true if we are on vacation. We sleep in if it is not a
	 * weekday or we're on vacation. Return true if we sleep in.
	 */
	public boolean sleepIn(boolean weekday, boolean vacation) {
		return(!weekday || vacation);
	}

	/*
	 * We have two monkeys, a and b, and the parameters aSmile and bSmile
	 * indicate if each is smiling. We are in trouble if they are both smiling
	 * or if neither of them is smiling. Return true if we are in trouble.
	 */
	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		return (aSmile && bSmile) || (!aSmile && !bSmile);
	}

	/*
	 * Given two int values, return their sum. Unless the two values are the
	 * same, then return double their sum.
	 */
	public int sumDouble(int a, int b) {
		if(a == b) return (a + b) * 2;
		return a + b;
	}

	/*
	 * Given an int n, return the absolute difference between n and 21, except
	 * return double the absolute difference if n is over 21.
	 */
	public int diff21(int n) {
		if(n <= 21) return 21 - n;
		return (n - 21) * 2;
	}

	/*
	 * We have a loud talking parrot. The "hour" parameter is the current hour
	 * time in the range 0..23. We are in trouble if the parrot is talking and
	 * the hour is before 7 or after 20. Return true if we are in trouble.
	 */
	public boolean parrotTrouble(boolean talking, int hour) {
		return(talking && (hour > 20 || hour < 7));
	}

	/*
	 * Given 2 ints, a and b, return true if one if them is 10 or if their sum
	 * is 10.
	 */
	public boolean makes10(int a, int b) {
		return a == 10 || b == 10 || a + b == 10;
	}

	/*
	 * Given an int n, return true if it is within 10 of 100 or 200. Note:
	 * Math.abs(num) computes the absolute value of a number.
	 */
	public boolean nearHundred(int n) {
		return Math.abs(n - 100) <= 10 || Math.abs(n - 200) <= 10;
	}

	/*
	 * Given 2 int values, return true if one is negative and one is positive.
	 * Except if the parameter "negative" is true, then return true only if both
	 * are negative.
	 */
	public boolean posNeg(int a, int b, boolean negative) {
		if(!negative) return a < 0 ^ b < 0;
		return a < 0 && b < 0;
	}

	/*
	 * Given a string, return a new string where "not " has been added to the
	 * front. However, if the string already begins with "not", return the
	 * string unchanged. Note: use .equals() to compare 2 strings.
	 */
	public String notString(String str) {
		return str.startsWith("not") ? str : "not " + str;
	}

	/*
	 * Given a non-empty string and an int n, return a new string where the char
	 * at index n has been removed. The value of n will be a valid index of a
	 * char in the original string (i.e. n will be in the range
	 * 0..str.length()-1 inclusive).
	 */
	public String missingChar(String str, int n) {
		return str.substring(0, n) + str.substring(n + 1);
	}

	/*
	 * Given a string, return a new string where the first and last chars have
	 * been exchanged.
	 */
	public String frontBack(String str) {
		if(str.length() < 2) return str;
		String first = str.substring(0, 1);
		String last = str.substring(str.length() - 1);
		String middle = str.substring(1, str.length() - 1);
		return last + middle + first;
	}

	/*
	 * Given a string, we'll say that the front is the first 3 chars of the
	 * string. If the string length is less than 3, the front is whatever is
	 * there. Return a new string which is 3 copies of the front.
	 */
	public String front3(String str) {
		if(str.length() < 3) return str + str + str;
		String ret = str.substring(0, 3);
		return ret + ret + ret;
	}

	/*
	 * Given a string, take the last char and return a new string with the last
	 * char added at the front and back, so "cat" yields "tcatt". The original
	 * string will be length 1 or more.
	 */
	public String backAround(String str) {
		String last = str.substring(str.length() - 1);
		return last + str + last;
	}

	/*
	 * Return true if the given non-negative number is a multiple of 3 or a
	 * multiple of 5. Use the % "mod" operator
	 */
	public boolean or35(int n) {
		return n % 5 == 0 || n % 3 == 0;
	}

	/*
	 * Given a string, take the first 2 chars and return the string with the 2
	 * chars added at both the front and back, so "kitten" yields"kikittenki".
	 * If the string length is less than 2, use whatever chars are there.
	 */
	public String front22(String str) {
		if(str.length() < 2) return str + str + str;
		String front = str.substring(0, 2);
		return front + str + front;
	}

	/*
	 * Given a string, return true if the string starts with "hi" and false
	 * otherwise.
	 */
	public boolean startHi(String str) {
		return str.toLowerCase().startsWith("hi");
	}

	/*
	 * Given two temperatures, return true if one is less than 0 and the other
	 * is greater than 100.
	 */
	public boolean icyHot(int temp1, int temp2) {
		return (temp1 > 100 && temp2 < 0) || (temp1 < 0 && temp2 > 100);
	}

	/*
	 * Given 2 int values, return true if either of them is in the range 10..20
	 * inclusive.
	 */
	public boolean in1020(int a, int b) {
		return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
	}

	/*
	 * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
	 * Given 3 int values, return true if 1 or more of them are teen.
	 */
	public boolean hasTeen(int a, int b, int c) {
		return isTeen(a) || isTeen(b) || isTeen(c);
	}

	private boolean isTeen(int n) {
		return n >= 13 && n <= 19;
	}

	/*
	 * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
	 * Given 2 int values, return true if one or the other is teen, but not
	 * both.
	 */
	public boolean loneTeen(int a, int b) {
		return isTeen(a) ^ isTeen(b);
	}

	/*
	 * Given a string, if the string "del" appears starting at index 1, return a
	 * string where that "del" has been deleted. Otherwise, return the string
	 * unchanged.
	 */
	public String delDel(String str) {
		if(str.length() < 4) return str;
		if("del".equals(str.substring(1, 4))) return str.substring(0, 1) + str.substring(4);
		return str;
	}

	/*
	 * Return true if the given string begins with "mix", except the 'm' can be
	 * anything, so "pix", "9ix" .. all count.
	 */
	public boolean mixStart(String str) {
		return str.matches("^.{1}(ix).*$");
	}

	/*
	 * Given a string, return a string made of the first 2 chars (if present),
	 * however include first char only if it is 'o' and include the second only
	 * if it is 'z', so "ozymandias" yields "oz".
	 */
	public String startOz(String str) {
		String result = "";
		int len = str.length();
		if(len >= 1 && str.charAt(0) == 'o') result += str.charAt(0);
		if(len >= 2 && str.charAt(1) == 'z') result += str.charAt(1);
		return result;
	}

	/* Given three int values, a b c, return the largest. */
	public int intMax(int a, int b, int c) {
		return Math.max(a, Math.max(b, c));
	}

	/*
	 * Given 2 int values, return whichever value is nearest to the value 10, or
	 * return 0 in the event of a tie. Note that Math.abs(n) returns the
	 * absolute value of a number.
	 */
	public int close10(int a, int b) {
		int diffA = Math.abs(10 - a);
		int diffB = Math.abs(10 - b);
		if(diffA == diffB) return 0;
		return diffA > diffB ? b : a;
	}

	/*
	 * Given 2 int values, return true if they are both in the range 30..40
	 * inclusive, or they are both in the range 40..50 inclusive.
	 */
	public boolean in3050(int a, int b) {
		return (((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) ||
				((a >= 40 && a <= 50) && (b >= 40 && b <= 50)));
	}

	/*
	 * Given 2 positive int values, return the larger value that is in the range
	 * 10..20 inclusive, or return 0 if neither is in that range.
	 */
	public int max1020(int a, int b) {
		a = a >= 10 && a <= 20 ? a : 0;
		b = b >= 10 && b <= 20 ? b : 0;
		return Math.max(a, b);
	}

	/*
	 * Return true if the given string contains between 1 and 3 'e' chars.
	 */
	public boolean stringE(String str) {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'e') count++;
		}
		return count >= 1 && count <= 3;
	}

	/*
	 * Given two non-negative int values, return true if they have the same last
	 * digit, such as with 27 and 57. Note that the % "mod" operator computes
	 * remainders, so 17 % 10 is 7.
	 */
	public boolean lastDigit(int a, int b) {
		return a % 10 == b % 10;
	}

	/*
	 * Given a string, return a new string where the last 3 chars are now in
	 * upper case. If the string has less than 3 chars, uppercase whatever is
	 * there. Note that str.toUpperCase() returns the uppercase version of a
	 * string.
	 */
	public String endUp(String str) {
		int len = str.length();
		if(len < 3) return str.toUpperCase();
		String front = str.substring(0, len - 3);
		String back = str.substring(len - 3).toUpperCase();
		return front + back;
	}

	/*
	 * Given a non-empty string and an int N, return the string made starting
	 * with char 0, and then every Nth char of the string. So if N is 3, use
	 * char 0, 3, 6, ... and so on. N is 1 or more.
	 */
	public String everyNth(String str, int n) {
		String result = "";
		for(int i = 0; i < str.length(); i += n) {
			result += str.charAt(i);
		}
		return result;
	} // END OF Warmup-1
	
	/*
	 * Given a string and a non-negative int n, return a larger string that is n
	 * copies of the original string.
	 */
	public String stringTimes(String str, int n) {
		if(n == 0 || "".equals(str)) return "";
		if(n == 1) return str;
		return str + stringTimes(str, --n);
	}

	/*
	 * Given a string and a non-negative int n, we'll say that the front of the
	 * string is the first 3 chars, or whatever is there if the string is less
	 * than length 3. Return n copies of the front;
	 */
	public String frontTimes(String str, int n) {
		if(n == 0 || "".equals(str)) return "";
		String front = str.length() < 3 ? str : str.substring(0, 3);
		if(n == 1) return front;
		return front + frontTimes(str, --n);
	}

	/*
	 * Count the number of "xx" in the given string. We'll say that overlapping
	 * is allowed, so "xxx" contains 2 "xx".
	 */
	public int countXX(String str) {
		if(str.length() < 2) return 0;
		return "xx".equals(str.substring(0, 2)) ? 1 + countXX(str.substring(1)) : countXX(str.substring(1));
	}

	/*
	 * Given a string, return true if the first instance of "x" in the string is
	 * immediately followed by another "x".
	 */
	public boolean doubleX(String str) {
		int pos = str.indexOf('x');
		if(pos+1 >= str.length()) return false;
		return pos >= 0 ? str.charAt(pos + 1) == 'x' : false;
	}

	/*
	 * Given a string, return a new string made of every other char starting
	 * with the first, so "Hello" yields "Hlo".
	 */
	public String stringBits(String str) {
		String result = "";
		for(int i = 0; i < str.length(); i+=2) {
			result += str.substring(i, i+1);
		}
		return result;
	}

	/*
	 * Given a non-empty string like "Code" return a string like "CCoCodCode".
	 */
	public String stringSplosion(String str) {
		String result = "";
		for(int i = 0; i < str.length(); i++) {
			result += str.substring(0, i+1);
		}
		return result;
	}

	/*
	 * Given a string, return the count of the number of times that a substring
	 * length 2 appears in the string and also as the last 2 chars of the
	 * string, so "hixxxhi" yields 1 (we won't count the end substring).
	 */
	public int last2(String str) {
		int len = str.length();
		if(len <= 2) return 0;
		int count = 0;
		String end = str.substring(len - 2);
		for(int i = 0; i < len - 2; i++) {
			if(str.substring(i, i + 2).equals(end)) count++;
		}
		return count;
	}

	/*
	 * Given an array of ints, return the number of 9's in the array.
	 */
	public int arrayCount9(int[] nums) {
		int count = 0;
		for(Integer i : nums) {
			if(i == 9) count++;
		}
		return count;
	}

	/*
	 * Given an array of ints, return true if one of the first 4 elements in the
	 * array is a 9. The array length may be less than 4.
	 */
	public boolean arrayFront9(int[] nums) {
		int bound = nums.length < 4 ? nums.length : 4;
		for(int i = 0; i < bound; i++) {
			if(nums[i] == 9) return true;
		}
		return false;
	}

	/*
	 * Given an array of ints, return true if the sequence of numbers 1, 2, 3
	 * appears in the array somewhere.
	 */
	public boolean array123(int[] nums) {
		for(int i = 0; i < nums.length - 2; i++) {
			if((nums[i] == 1)) {
				if(nums[i + 1] == 2 && nums[i + 2] == 3) return true;
			}
		}
		return false;
	}

	/*
	 * Given 2 strings, a and b, return the number of the positions where they
	 * contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3,
	 * since the "xx", "aa", and "az" substrings appear in the same place in
	 * both strings.
	 */
	public int stringMatch(String a, String b) {
		int count = 0;
		int len = Math.min(a.length(), b.length());
		for(int i = 0; i < len-1; i++) {
			if(a.substring(i, i+2).equals(b.substring(i, i+2))) count++;
		}
		return count;
	}

	/*
	 * Given a string, return a version where all the "x" have been removed.
	 * Except an "x" at the very start or end should not be removed.
	 */
	public String stringX(String str) {
		String result = "";
		for(int i = 0; i < str.length(); i++) {
			if(!(i > 0 && i < str.length() - 1 && str.substring(i, i+1).equals("x"))) result += str.substring(i, i+1);
		}
		return result;
	}

	/*
	 * Given a string, return a string made of the chars at indexes 0,1, 4,5,
	 * 8,9 ... so "kittens" yields "kien".
	 */
	public String altPairs(String str) {
		String result = "";
		for(int i = 0; i < str.length(); i+=4) { 
			int end = i + 2;
			if(end > str.length()) end = str.length();
			result += str.substring(i, end);
		}
		return result;
	}

	/*
	 * Suppose the string "yak" is unlucky. Given a string, return a version
	 * where all the "yak" are removed, but the "a" can be any char. The "yak"
	 * strings will not overlap.
	 */
	public String stringYak(String str) {
		return str.replaceAll("([yY]{1}.{1}[kK]{1})", "");
	}

	/*
	 * Given an array of ints, return the number of times that two 6's are next
	 * to each other in the array. Also count instances where the second "6" is
	 * actually a 7.
	 */
	public int array667(int[] nums) {
		int count = 0;
		for(int i = 0; i < nums.length - 1; i++) {
			if(nums[i] == 6 && (nums[i+1] == 6 || nums[i+1] == 7)) count++;
		}
		return count;
	}

	/*
	 * Given an array of ints, we'll say that a triple is a value appearing 3
	 * times in a row in the array. Return true if the array does not contain
	 * any triples.
	 */
	public boolean noTriples(int[] nums) {
		for(int i = 1; i < nums.length - 1; i++) {
			if(nums[i] == nums[i-1] && nums[i] == nums[i+1]) return false;
		}
		return true;
	}

	/*
	 * Given an array of ints, return true if it contains a 2, 7, 1 pattern: a
	 * value, followed by the value plus 5, followed by the value minus 1.
	 * Additionally the 271 counts even if the "1" differs by 2 or less from the
	 * correct value.
	 */
	public boolean has271(int[] nums) {
		for(int i = 1; i < nums.length - 1; i++) {
			if((nums[i-1] == nums[i] - 5) && Math.abs((nums[i-1] - 1) - nums[i+1]) <= 2) return true;
		}
		return false;
	} // END OF Warmup-2

}
