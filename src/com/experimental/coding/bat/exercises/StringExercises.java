package com.experimental.coding.bat.exercises;

public class StringExercises {

	public static void main(String[] args) {
		new StringExercises();
	}

	public StringExercises() {
		
	}

	/*
	 * Given a string name, e.g. "Bob", return a greeting of the form
	 * "Hello Bob!".
	 */
	public String helloName(String name) {
		return "Hello " + name + "!";
	}

	/*
	 * Given two strings, a and b, return the result of putting them together in
	 * the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
	 */
	public String makeAbba(String a, String b) {
		return a + b + b + a;
	}

	/*
	 * The web is built with HTML strings like "<i>Yay</i>" which draws Yay as
	 * italic text. In this example, the "i" tag makes <i> and </i> which
	 * surround the word "Yay". Given tag and word strings, create the HTML
	 * string with tags around the word, e.g. "<i>Yay</i>".
	 */
	public String makeTags(String tag, String word) {
		return "<" + tag + ">" + word + "</" + tag + ">";
	}

	/*
	 * Given an "out" string length 4, such as "<<>>", and a word, return a new
	 * string where the word is in the middle of the out string, e.g.
	 * "<<word>>". Note: use str.substring(i, j) to extract the String starting
	 * at index i and going up to but not including index j.
	 */
	public String makeOutWord(String out, String word) {
		return out.substring(0,out.length()/2) + word + out.substring((out.length()/2));
	}

	/*
	 * Given a string, return a new string made of 3 copies of the last 2 chars
	 * of the original string. The string length will be at least 2.
	 */
	public String extraEnd(String str) {
		String end = str.substring(str.length()-2);
		return end + end + end;
	}

	/*
	 * Given a string, return the string made of its first two chars, so the
	 * String "Hello" yields "He". If the string is shorter than length 2,
	 * return whatever there is, so "X" yields "X", and the empty string ""
	 * yields the empty string "". Note that str.length() returns the length of
	 * a string.
	 */
	public String firstTwo(String str) {
		return str.length() >= 2 ? str.substring(0,2) : str;
	}

	/*
	 * Given a string of even length, return the first half. So the string
	 * "WooHoo" yields "Woo".
	 */
	public String firstHalf(String str) {
		return str.substring(0,str.length()/2);
	}

	/*
	 * Given a string, return a version without the first and last char, so
	 * "Hello" yields "ell". The string length will be at least 2.
	 */
	public String withoutEnd(String str) {
		return str.substring(1,str.length()-1);
	}

	/*
	 * Given 2 strings, a and b, return a string of the form short+long+short,
	 * with the shorter string on the outside and the longer string on the
	 * inside. The strings will not be the same length, but they may be empty
	 * (length 0).
	 */
	public String comboString(String a, String b) {
		return a.length() > b.length() ? b + a + b : a + b + a;
	}

	/*
	 * Given 2 strings, return their concatenation, except omit the first char
	 * of each. The strings will be at least length 1.
	 */
	public String nonStart(String a, String b) {
		return a.substring(1) + b.substring(1);
	}

	/*
	 * Given a string, return a "rotated left 2" version where the first 2 chars
	 * are moved to the end. The string length will be at least 2.
	 */
	public String left2(String str) {
		return str.substring(2) + str.substring(0,2);
	}

	/*
	 * Given a string, return a "rotated right 2" version where the last 2 chars
	 * are moved to the start. The string length will be at least 2.
	 */
	public String right2(String str) {
		return str.substring(str.length()-2) + str.substring(0,str.length()-2);
	}

	/*
	 * Given a string, return a string length 1 from its front, unless front is
	 * false, in which case return a string length 1 from its back. The string
	 * will be non-empty.
	 */
	public String theEnd(String str, boolean front) {
		return front ? str.substring(0,1) : str.substring(str.length()-1);
	}

	/*
	 * Given a string, return a version without both the first and last char of
	 * the string. The string may be any length, including 0.
	 */
	public String withouEnd2(String str) {
		return str.length() <= 2 ? "" : str.substring(1,str.length()-1);
	}

	/*
	 * Given a string of even length, return a string made of the middle two
	 * chars, so the string "string" yields "ri". The string length will be at
	 * least 2.
	 */
	public String middleTwo(String str) {
		return str.substring((str.length()/2)-1,str.length()/2+1);
	}

	/*
	 * Given a string, return true if it ends in "ly".
	 */
	public boolean endsLy(String str) {
		return str.endsWith("ly");
	}

	/*
	 * Given a string and an int n, return a string made of the first and last n
	 * chars from the string. The string length will be at least n.
	 */
	public String nTwice(String str, int n) {
		return str.substring(0, n) + str.substring(str.length() - n);
	}

	/*
	 * Given a string and an index, return a string length 2 starting at the
	 * given index. If the index is too big or too small to define a string
	 * length 2, use the first 2 chars. The string length will be at least 2.
	 */
	public String twoChar(String str, int index) {
		if(str.length() < index || str.length() - index < 2 || index < 0) return str.substring(0,2);
		return str.substring(index, index + 2);
	}

	/*
	 * Given a string of odd length, return the string length 3 from its middle,
	 * so "Candy" yields "and". The string length will be at least 3.
	 */
	public String middleThree(String str) {
		return str.substring((str.length()/2)-1, (str.length()/2)+2);
	}

	/*
	 * Given a string, return true if "bad" appears starting at index 0 or 1 in
	 * the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The
	 * string may be any length, including 0. Note: use .equals() to compare 2
	 * strings.
	 */
	public boolean hasBad(String str) {
		if(str.length() < 3) return false;
		if(str.length() < 4) return "bad".equals(str.substring(0,3));
		return "bad".equals(str.substring(0,3)) || "bad".equals(str.substring(1,4));
	}

	/*
	 * Given a string, return a string length 2 made of its first 2 chars. If
	 * the string length is less than 2, use '@' for the missing chars.
	 */
	public String atFirst(String str) {
		if(str.length() < 1) return "@@";
		return str.length() < 2 ? str + "@" : str.substring(0,2);
	}

	/*
	 * Given 2 strings, a and b, return a new string made of the first char of a
	 * and the last char of b, so "yo" and "java" yields "ya". If either string
	 * is length 0, use '@' for its missing char.
	 */
	public String lastChars(String a, String b) {
		String aReturn = a.length() < 1 ? "@" : a.substring(0,1);
		String bReturn = b.length() < 1 ? "@" : b.substring(b.length()-1);
		return aReturn + bReturn;
	}

	/*
	 * Given two strings, append them together (known as "concatenation") and
	 * return the result. However, if the concatenation creates a double-char,
	 * then omit one of the chars, so "abc" and "cat" yields "abcat".
	 */
	public String conCat(String a, String b) {
		if(a.length() < 1 || b.length() < 1) return a.length() < 1 ? b : a;
		return a.charAt(a.length()-1) == b.charAt(0) ? a.substring(0, a.length()-1) + b : a + b;
	}

	/*
	 * Given a string of any length, return a new string where the last 2 chars,
	 * if present, are swapped, so "coding" yields "codign".
	 */
	public String lastTwo(String str) {
		if(str.length() < 2) return str;
		if(str.length() == 2) return str.substring(1) + str.substring(0,1);
		return str.substring(0,str.length()-2) + str.substring(str.length()-1) + str.substring(str.length()-2, str.length()-1);
	}

	/*
	 * Given a string, if the string begins with "red" or "blue" return that
	 * color string, otherwise return the empty string.
	 */
	public String seeColor(String str) {
		if(!(str.startsWith("red") || str.startsWith("blue"))) return "";
		return str.startsWith("red") ? "red" : "blue";
	}

	/*
	 * Given a string, return true if the first 2 chars in the string also
	 * appear at the end of the string, such as with "edited".
	 */
	public boolean frontAgain(String str) {
		if(str.length() < 2) return false;
		return str.substring(0,2).equals(str.substring(str.length()-2));
	}

	/*
	 * Given two strings, append them together (known as "concatenation") and
	 * return the result. However, if the strings are different lengths, omit
	 * chars from the longer string so it is the same length as the shorter
	 * string. So "Hello" and "Hi" yield "loHi". The strings may be any length.
	 */
	public String minCat(String a, String b) {

		if(a.length() == b.length()) return a + b;
		return a.length() > b.length() ? a.substring(a.length() - b.length()) + b :
			a + b.substring(b.length() - a.length());
	}

	/*
	 * Given a string, return a new string made of 3 copies of the first 2 chars
	 * of the original string. The string may be any length. If there are fewer
	 * than 2 chars, use whatever is there.
	 */
	public String extraFront(String str) {
		if(str.length() <= 2) return str + str + str;
		return str.substring(0,2) + str.substring(0,2) + str.substring(0,2);
	}

	/*
	 * Given a string, if a length 2 substring appears at both its beginning and
	 * end, return a string without the substring at the beginning, so "HelloHe"
	 * yields "lloHe". The substring may overlap with itself, so "Hi" yields "".
	 * Otherwise, return the original string unchanged.
	 */
	public String without2(String str) {
		if(str.length() < 2) return str;
		return str.substring(0,2).equals(str.substring(str.length()-2)) ? 
				str.substring(2) : str;
	}

	/*
	 * Given a string, return a version without the first 2 chars. Except keep
	 * the first char if it is 'a' and keep the second char if it is 'b'. The
	 * string may be any length. Harder than it looks.
	 */
	public String deFront(String str) {    
		if(str.length() < 2) return str;
		if(str.charAt(0) == 'a' && !(str.charAt(1) == 'b')) {
			return str.substring(0,1) + str.substring(2);
		} else if(!(str.charAt(0) == 'a') && str.charAt(1) == 'b') {
			return str.substring(1);
		} else if(str.charAt(0) == 'a' && str.charAt(1) == 'b') {
			return str;
		} else {
			return str.substring(2);
		}

	}

	/*
	 * Given a string and a second "word" string, we'll say that the word
	 * matches the string if it appears at the front of the string, except its
	 * first char does not need to match exactly. On a match, return the front
	 * of the string, or otherwise return the empty string. So, so with the
	 * string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The
	 * word will be at least length 1.
	 */
	public String startWord(String str, String word) {
		if (word.length() > str.length()) return "";
		if (str.substring(0, word.length()).equals(word)) return word;
		if (str.substring(1, word.length()).equals(word.substring(1)))
			return str.charAt(0) + word.substring(1);
		return "";

	}

	/*
	 * Given a string, if the first or last chars are 'x', return the string
	 * without those 'x' chars, and otherwise return the string unchanged.
	 */
	public String withoutX(String str) {
		if(str.startsWith("x")) str = str.substring(1);
		if(str.endsWith("x")) str = str.substring(0,str.length()-1);
		return str;
	}

	/*
	 * Given a string, if one or both of the first 2 chars is 'x', return the
	 * string without those 'x' chars, and otherwise return the string
	 * unchanged. This is a little harder than it looks.
	 */
	public String withoutX2(String str) {
		if(str.length() < 2) return str.contains("x") ? "" : str;
		if(str.charAt(0) == 'x' && str.charAt(1) != 'x') return str.substring(1);
		if(str.charAt(0) != 'x' && str.charAt(1) == 'x') return str.substring(0,1) + str.substring(2);
		if(str.charAt(0) == 'x' && str.charAt(1) == 'x') return str.substring(2);
		return str;
	} // END OF String-1

	/*
	 * Given a string, return a string where for every char in the original,
	 * there are two chars.
	 */
	public String doubleChar(String str) {
		String result = "";
		for(int i = 0; i < str.length(); i++) {
			result += str.substring(i, i+1) + str.substring(i, i+1);
		}
		return result;
	}

	/*
	 * Return the number of times that the string "hi" appears anywhere in the
	 * given string.
	 */
	public int countHi(String str) {
		if(str.length() < 2) return 0;
		return "hi".equals(str.substring(0,2)) ? 1 + countHi(str.substring(1)) : countHi(str.substring(1));
	}

	/*
	 * Return true if the string "cat" and "dog" appear the same number of times
	 * in the given string.
	 */
	public boolean catDog(String str) {
		if(str.length() < 3) return true;
		int cat = 0;
		int dog = 0;
		for(int i = 0; i < str.length() - 2; i++) {
			String check = str.substring(i, i+3);
			if("cat".equals(check)) cat++;
			if("dog".equals(check)) dog++;
		}
		return dog == cat;
	}

	/*
	 * Return the number of times that the string "code" appears anywhere in the
	 * given string, except we'll accept any letter for the 'd', so "cope" and
	 * "cooe" count.
	 */
	public int countCode(String str) {
		int count = 0;
		for(int i = 0; i < str.length()-3; i++) {
			if("co".equals(str.substring(i, i + 2)) 
					&& 'e' == str.charAt(i + 3))
				count++;
		}
		return count;
	}

	/*
	 * Given two strings, return true if either of the strings appears at the
	 * very end of the other string, ignoring upper/lower case differences (in
	 * other words, the computation should not be "case sensitive"). Note:
	 * str.toLowerCase() returns the lowercase version of a string.
	 */
	public boolean endOther(String a, String b) {
		a = a.toLowerCase();
		b = b.toLowerCase();
		return b.endsWith(a) || a.endsWith(b);
	}

	/*
	 * Return true if the given string contains an appearance of "xyz" where the
	 * xyz is not directly preceeded by a period (.). So "xxyz" counts but
	 * "x.xyz" does not.
	 */
	public boolean xyzThere(String str) {
		for(int i = 0; i < str.length()-2; i++) {
			String check = str.substring(i, i+3);
			if("xyz".equals(check)) {
				if(i == 0) return true;
				if(str.charAt(i - 1) != '.') return true;
			}
		}
		return false;
	}

	/*
	 * Return true if the given string contains a "bob" string, but where the
	 * middle 'o' char can be any char.
	 */
	public boolean bobThere(String str) {
		return str.matches("[a-zA-z0-9]{0,}[b]{1}[a-zA-z0-9]{1}[b]{1}[a-zA-z0-9]{0,}");
	}

	/*
	 * We'll say that a String is xy-balanced if for all the 'x' chars in the
	 * string, there exists a 'y' char somewhere later in the string. So "xxy"
	 * is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return
	 * true if the given string is xy-balanced.
	 */
	public boolean xyBalance(String str) {
		boolean balanced = false;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'x') balanced = false;
			if(str.charAt(i) == 'y') balanced = true;
		}
		return balanced || !(str.contains("x"));
	}

	/*
	 * Given two strings, a and b, create a bigger string made of the first char
	 * of a, the first char of b, the second char of a, the second char of b,
	 * and so on. Any leftover chars go at the end of the result.
	 */
	public String mixString(String a, String b) {
		String bigger = a.length() > b.length() ? a : b;
		String smaller = a.length() > b.length() ? b : a;
		String result = "";
		int i = 0;
		while(i < smaller.length()) {
			result += a.substring(i, i+1) + b.substring(i, i+1);
			i++;
		}
		result += bigger.substring(i);
		return result;
	}

	/*
	 * Given a string and an int n, return a string made of n repetitions of the
	 * last n characters of the string. You may assume that n is between 0 and
	 * the length of the string, inclusive.
	 */
	public String repeatEnd(String str, int n) {
		String result = "";
		for(int i = 0; i < n; i++) {
			result += str.substring(str.length()-n);
		}
		return result;
	}

	/*
	 * Given a string and an int n, return a string made of the first n
	 * characters of the string, followed by the first n-1 characters of the
	 * string, and so on. You may assume that n is between 0 and the length of
	 * the string, inclusive (i.e. n >= 0 and n <= str.length()).
	 */
	public String repeatFront(String str, int n) {
		String result = "";
		for(int i = n; i > 0; i--) {
			result += str.substring(0, i);
		}
		return result;
	}

	/*
	 * Given two strings, word and a separator sep, return a big string made of
	 * count occurrences of the word, separated by the separator string.
	 */
	public String repeatSeparator(String word, String sep, int count) {
		if(count == 0) return "";
		if(count == 1) return word;
		String result = "";
		for(int i = 1; i < count; i++) {
			result = result + word + sep;
		}
		result = result + word;
		return result;
	}

	/*
	 * Given a string, consider the prefix string made of the first N chars of
	 * the string. Does that prefix string appear somewhere else in the string?
	 * Assume that the string is not empty and that N is in the range
	 * 1..str.length().
	 */
	public boolean prefixAgain(String str, int n) {
		String prefix = str.substring(0, n);
		for(int i = n; i <= str.length() - n; i++) {
			if(str.substring(i, i + n).equals(prefix)) return true;
		}
		return false;
	}

	/*
	 * Given a string, does "xyz" appear in the middle of the string? To define
	 * middle, we'll say that the number of chars to the left and right of the
	 * "xyz" must differ by at most one. This problem is harder than it looks.
	 */
	public boolean xyzMiddle(String str) {
		int len = str.length();
		int middle = len / 2;
		if(len < 3) return false;
		if(len % 2 != 0) {
			if("xyz".equals(str.substring(middle - 1, middle + 2))) return true;
			else return false;
		} else if("xyz".equals(str.substring(middle - 1, middle + 2)) || 
				"xyz".equals(str.substring(middle - 2, middle + 1))) return true;
		return false;
	}

	/*
	 * A sandwich is two pieces of bread with something in between. Return the
	 * string that is between the first and last appearance of "bread" in the
	 * given string, or return the empty string "" if there are not two pieces
	 * of bread.
	 */
	public String getSandwich(String str) {
		// I feel clever, though I doubt the efficiency of breadCount
		int breadCount = (str.length() - str.replaceAll("bread", "").length()) / 5;
		if(breadCount < 2) return "";
		int firstBreadPos = str.indexOf("bread");
		int secondBreadPos = -1;
		for(int i = str.length(); i > 5; i--) {
			if("bread".equals(str.substring(i-5, i))) {
				secondBreadPos = i - 5;
				break;
			}
		}
		return str.substring(firstBreadPos+5, secondBreadPos);
	}

	/*
	 * Returns true if for every '*' (star) in the string, if there are chars
	 * both immediately before and after the star, they are the same.
	 */
	public boolean sameStarChar(String str) {
		for(int i = 0; i < str.length() - 1; i++) {
			if(i > 0 && str.charAt(i) == '*') {
				if(str.charAt(i - 1) != str.charAt(i + 1)) {
					return false;
				}
			}
		}
		return true;
	}

	/*
	 * Given a string, compute a new string by moving the first char to come
	 * after the next two chars, so "abc" yields "bca". Repeat this process for
	 * each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any
	 * group of fewer than 3 chars at the end.
	 */
	public String oneTwo(String str) {
		StringBuffer result = new StringBuffer(str.length());
		for(int i = 0; i < str.length() - 2; i += 3) {
			result.append(str.substring(i+1, i+3) + str.substring(i, i+1));
		}
		return result.toString();
	}

	/*
	 * Look for patterns like "zip" and "zap" in the string -- length-3,
	 * starting with 'z' and ending with 'p'. Return a string where for all such
	 * words, the middle letter is gone, so "zipXzap" yields "zpXzp".
	 */
	public String zipZap(String str) {
		int len = str.length();
		String result = "";
		for(int i = 0; i < len; i++) {
			result += str.substring(i, i+1);
			if(i > 0 && i < len-1) {
				if(str.charAt(i - 1) == 'z' && str.charAt(i + 1) == 'p') {
					result = result.substring(0, result.length()-1);
				}
			}
		}
		return result;
	}

	/*
	 * Return a version of the given string, where for every star (*) in the
	 * string the star and the chars immediately to its left and right are gone.
	 * So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
	 */
	public String starOut(String str) {
		int len = str.length();
		String result = "";
		for(int i = 0; i < len; i++) {
			if(i == 0 && str.charAt(i) != '*') result += str.charAt(i);
			if(i > 0 && str.charAt(i) != '*' && str.charAt(i - 1) != '*') result += str.charAt(i);
			if(i > 0 && str.charAt(i) == '*' && str.charAt(i - 1) != '*') result = result.substring(0, result.length() - 1);
		}
		return result;
	}

	/*
	 * Given a string and a non-empty word string, return a version of the
	 * original String where all chars have been replaced by pluses ("+"),
	 * except for appearances of the word string which are preserved unchanged.
	 */
	public String plusOut(String str, String word) {
		String result = "";
		int strLen = str.length();
		int wordLen = word.length();
		for(int i = 0; i < strLen; i++) {
			if(i <= strLen - wordLen) {
				String check = str.substring(i, i+wordLen);
				if(check.equals(word)) {
					result += word;
					i += wordLen - 1;
				} else {
					result += "+";
				}
			} else {
				result += "+";
			}
		}
		return result;
	}

	/*
	 * Given a string and a non-empty word string, return a string made of each
	 * char just before and just after every appearance of the word in the
	 * string. Ignore cases where there is no char before or after the word, and
	 * a char may be included twice if it is between two words.
	 */
	public String wordEnds(String str, String word) {
		String result = "";
		int position = str.indexOf(word);
		while(position != -1) {
			if(position != 0) result += str.charAt(position - 1);
			if(position + word.length() == str.length()) break;
			result += str.charAt(position + word.length());
			position = str.indexOf(word, position + 1);
		}
		return result;
	} // END OF String-2

	/*
	 * Given a string, count the number of words ending in 'y' or 'z' -- so the
	 * 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow"
	 * (not case sensitive). We'll say that a y or z is at the end of a word if
	 * there is not an alphabetic letter immediately following it. (Note:
	 * Character.isLetter(char) tests if a char is an alphabetic letter.)
	 */
	public int countYZ(String str) {
		int count = 0;
		String[] words = str.split("([^a-zA-Z])");
		for(String word : words) {
			if(word.matches("(^.*[yYzZ]{1,}$)")) count++;
		}
		return count;
		// regexes feel like cheating
	}

	/*
	 * Given two strings, base and remove, return a version of the base string
	 * where all instances of the remove string have been removed (not case
	 * sensitive). You may assume that the remove string is length 1 or more.
	 * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves
	 * "x".
	 */
	public String withoutString(String base, String remove) {
		return base.replaceAll("(?i)"+remove, "");
		// regexes are cheating
	}

	/*
	 * Given a string, return true if the number of appearances of "is" anywhere
	 * in the string is equal to the number of appearances of "not" anywhere in
	 * the string (case sensitive).
	 */
	public boolean equalsIsNot(String str) {
		// hey I get to use my clever algorithm that's probably horrible again
		int numIs = (str.length() - str.replaceAll("is", "").length()) / 2;
		int numNot = (str.length() - str.replaceAll("not", "").length()) / 3;
		return numIs == numNot;
	}

	/*
	 * We'll say that a lowercase 'g' in a string is "happy" if there is another
	 * 'g' immediately to its left or right. Return true if all the g's in the
	 * given string are happy.
	 */
	public boolean gHappy(String str) {
		int len = str.length();
		boolean flag = true;
		for(int i = 0; i < len; i++) {
			if(str.charAt(i) == 'g') {
				if(i > 0 && str.charAt(i-1) == 'g') flag = true;
				else if(i < len-1 && str.charAt(i+1) == 'g') flag = true;
				else flag = false;
			}
		}
		return flag;
	}

	/*
	 * We'll say that a "triple" in a string is a char appearing three times in
	 * a row. Return the number of triples in the given string. The triples may
	 * overlap.
	 */
	public int countTriple(String str) {
		int count = 0;
		for(int i = 1; i < str.length()-1; i++) {
			if(str.charAt(i) == str.charAt(i-1) && str.charAt(i) == str.charAt(i+1)) count++;
		}
		return count;
	}

	/*
	 * Given a string, return the sum of the digits 0-9 that appear in the
	 * string, ignoring all other characters. Return 0 if there are no digits in
	 * the string. (Note: Character.isDigit(char) tests if a char is one of the
	 * chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an
	 * int.)
	 */
	public int sumDigits(String str) {
		int sum = 0;
		for(int i = 0; i < str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) sum += Integer.parseInt(str.substring(i, i+1)); 
		}
		return sum;
	}

	/*
	 * Given a string, return the longest substring that appears at both the
	 * beginning and end of the string without overlapping. For example,
	 * sameEnds("abXab") is "ab".
	 */
	public String sameEnds(String string) {
		int len = string.length();
		String result = "";
		String temp = "";
		for(int i = 0; i < len; i++) {
			temp += string.charAt(i);
			int tempLen = temp.length();
			if(i < len / 2 && temp.equals(string.substring(len-tempLen, len))) result = temp;
		}
		return result;
	} 

	/*
	 * Given a string, look for a mirror image (backwards) string at both the
	 * beginning and end of the given string. In other words, zero or more
	 * characters at the very begining of the given string, and at the very end
	 * of the string in reverse order (possibly overlapping). For example, the
	 * string "abXYZba" has the mirror end "ab".
	 */
	public String mirrorEnds(String string) {
		int len = string.length();
		String result = "";
		String frontTemp = "";
		String backTemp = "";
		for(int i = 0; i < len; i++) {
			frontTemp += string.charAt(i);
			backTemp += string.charAt((len - i) - 1);
			if(frontTemp.equals(backTemp)) result = frontTemp;
			else break;
		}
		return result;
	}

	/*
	 * Given a string, return the length of the largest "block" in the string. A
	 * block is a run of adjacent chars that are the same.
	 */
	public int maxBlock(String str) {
		int max = 0;
		int count = 1;
		for(int i = 0; i < str.length()-1; i++) {
			if(str.charAt(i) == str.charAt(i + 1)) { 
				count++;
			}
			else count = 1;
			if(count > max) max = count;
		}
		return max;
	}

	/*
	 * Given a string, return the sum of the numbers appearing in the string,
	 * ignoring all other characters. A number is a series of 1 or more digit
	 * chars in a row. (Note: Character.isDigit(char) tests if a char is one of
	 * the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to
	 * an int.)
	 */
	public int sumNumbers(String str) {
		int sum = 0;
		for(int i = 0; i < str.length(); i++) {
			String bigNum = "";
			while(i < str.length() && Character.isDigit(str.charAt(i))){
				bigNum += str.charAt(i);
				i++;
			}
			if(!"".equals(bigNum)) sum += Integer.parseInt(bigNum);
		}
		return sum;
	}

	/*
	 * Given a string, return a string where every appearance of the lowercase
	 * word "is" has been replaced with "is not". The word "is" should not be
	 * immediately preceeded or followed by a letter -- so for example the "is"
	 * in "this" does not count. (Note: Character.isLetter(char) tests if a char
	 * is a letter.)
	 */
	public String notReplace(String str) {
		String result = "";
		for(int i = 0; i < str.length(); i++) {
			if(i-1 >=0 && Character.isLetter(str.charAt(i-1)) || i+2 < str.length() && Character.isLetter(str.charAt(i+2))) {
				result += str.charAt(i);
			} else if(i+1 < str.length() && str.substring(i, i+2).equals("is")) {
				result += "is not";
				i++;
			} else {
				result += str.charAt(i);
			}
		}
		return result;
	} // END OF String-3

}
