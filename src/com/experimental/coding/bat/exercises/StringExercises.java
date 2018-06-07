package com.experimental.coding.bat.exercises;

public class StringExercises {

	public static void main(String[] args) {
		new StringExercises();
	}

	public StringExercises() {
		System.out.println(getSandwich("breadjambread"));
	}

	public String helloName(String name) {
		return "Hello " + name + "!";
	}

	public String makeAbba(String a, String b) {
		return a + b + b + a;
	}

	public String makeTags(String tag, String word) {
		return "<" + tag + ">" + word + "</" + tag + ">";
	}

	public String makeOutWord(String out, String word) {
		return out.substring(0,out.length()/2) + word + out.substring((out.length()/2));
	}

	public String extraEnd(String str) {
		String end = str.substring(str.length()-2);
		return end + end + end;
	}

	public String firstTwo(String str) {
		return str.length() >= 2 ? str.substring(0,2) : str;
	}

	public String firstHalf(String str) {
		return str.substring(0,str.length()/2);
	}

	public String withoutEnd(String str) {
		return str.substring(1,str.length()-1);
	}

	public String comboString(String a, String b) {
		return a.length() > b.length() ? b + a + b : a + b + a;
	}

	public String nonStart(String a, String b) {
		return a.substring(1) + b.substring(1);
	}

	public String left2(String str) {
		return str.substring(2) + str.substring(0,2);
	}

	public String right2(String str) {
		return str.substring(str.length()-2) + str.substring(0,str.length()-2);
	}

	public String theEnd(String str, boolean front) {
		return front ? str.substring(0,1) : str.substring(str.length()-1);
	}

	public String withouEnd2(String str) {
		return str.length() <= 2 ? "" : str.substring(1,str.length()-1);
	}

	public String middleTwo(String str) {
		return str.substring((str.length()/2)-1,str.length()/2+1);
	}

	public boolean endsLy(String str) {
		return str.endsWith("ly");
	}

	public String nTwice(String str, int n) {
		return str.substring(0, n) + str.substring(str.length() - n);
	}

	public String twoChar(String str, int index) {
		if(str.length() < index || str.length() - index < 2 || index < 0) return str.substring(0,2);
		return str.substring(index, index + 2);
	}

	public String middleThree(String str) {
		return str.substring((str.length()/2)-1, (str.length()/2)+2);
	}

	public boolean hasBad(String str) {
		if(str.length() < 3) return false;
		if(str.length() < 4) return "bad".equals(str.substring(0,3));
		return "bad".equals(str.substring(0,3)) || "bad".equals(str.substring(1,4));
	}

	public String atFirst(String str) {
		if(str.length() < 1) return "@@";
		return str.length() < 2 ? str + "@" : str.substring(0,2);
	}

	public String lastChars(String a, String b) {
		String aReturn = a.length() < 1 ? "@" : a.substring(0,1);
		String bReturn = b.length() < 1 ? "@" : b.substring(b.length()-1);
		return aReturn + bReturn;
	}

	public String conCat(String a, String b) {
		if(a.length() < 1 || b.length() < 1) return a.length() < 1 ? b : a;
		return a.charAt(a.length()-1) == b.charAt(0) ? a.substring(0, a.length()-1) + b : a + b;
	}

	public String lastTwo(String str) {
		if(str.length() < 2) return str;
		if(str.length() == 2) return str.substring(1) + str.substring(0,1);
		return str.substring(0,str.length()-2) + str.substring(str.length()-1) + str.substring(str.length()-2, str.length()-1);
	}

	public String seeColor(String str) {
		if(!(str.startsWith("red") || str.startsWith("blue"))) return "";
		return str.startsWith("red") ? "red" : "blue";
	}

	public boolean frontAgain(String str) {
		if(str.length() < 2) return false;
		return str.substring(0,2).equals(str.substring(str.length()-2));
	}

	public String minCat(String a, String b) {

		if(a.length() == b.length()) return a + b;
		return a.length() > b.length() ? a.substring(a.length() - b.length()) + b :
			a + b.substring(b.length() - a.length());
	}

	public String extraFront(String str) {
		if(str.length() <= 2) return str + str + str;
		return str.substring(0,2) + str.substring(0,2) + str.substring(0,2);
	}

	public String without2(String str) {
		if(str.length() < 2) return str;
		return str.substring(0,2).equals(str.substring(str.length()-2)) ? 
				str.substring(2) : str;
	}

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

	public String startWord(String str, String word) {
		if (word.length() > str.length()) return "";
		if (str.substring(0, word.length()).equals(word)) return word;
		if (str.substring(1, word.length()).equals(word.substring(1)))
			return str.charAt(0) + word.substring(1);
		return "";

	}

	public String withoutX(String str) {
		if(str.startsWith("x")) str = str.substring(1);
		if(str.endsWith("x")) str = str.substring(0,str.length()-1);
		return str;
	}

	public String withoutX2(String str) {
		if(str.length() < 2) return str.contains("x") ? "" : str;
		if(str.charAt(0) == 'x' && str.charAt(1) != 'x') return str.substring(1);
		if(str.charAt(0) != 'x' && str.charAt(1) == 'x') return str.substring(0,1) + str.substring(2);
		if(str.charAt(0) == 'x' && str.charAt(1) == 'x') return str.substring(2);
		return str;
	} // END OF String-1

	public String doubleChar(String str) {
		String result = "";
		for(int i = 0; i < str.length(); i++) {
			result += str.substring(i, i+1) + str.substring(i, i+1);
		}
		return result;
	}

	public int countHi(String str) {
		if(str.length() < 2) return 0;
		return "hi".equals(str.substring(0,2)) ? 1 + countHi(str.substring(1)) : countHi(str.substring(1));
	}

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

	public int countCode(String str) {
		int count = 0;
		for(int i = 0; i < str.length()-3; i++) {
			if("co".equals(str.substring(i, i + 2)) 
					&& 'e' == str.charAt(i + 3))
				count++;
		}
		return count;
	}

	public boolean endOther(String a, String b) {
		a = a.toLowerCase();
		b = b.toLowerCase();
		return b.endsWith(a) || a.endsWith(b);
	}

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

	public boolean bobThere(String str) {
		return str.matches("[a-zA-z0-9]{0,}[b]{1}[a-zA-z0-9]{1}[b]{1}[a-zA-z0-9]{0,}");
	}

	public boolean xyBalance(String str) {
		boolean balanced = false;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'x') balanced = false;
			if(str.charAt(i) == 'y') balanced = true;
		}
		return balanced || !(str.contains("x"));
	}

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

	public String repeatEnd(String str, int n) {
		String result = "";
		for(int i = 0; i < n; i++) {
			result += str.substring(str.length()-n);
		}
		return result;
	}

	public String repeatFront(String str, int n) {
		String result = "";
		for(int i = n; i > 0; i--) {
			result += str.substring(0, i);
		}
		return result;
	}

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

	public boolean prefixAgain(String str, int n) {
		String prefix = str.substring(0, n);
		for(int i = n; i <= str.length() - n; i++) {
			if(str.substring(i, i + n).equals(prefix)) return true;
		}
		return false;
	}

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

	public String oneTwo(String str) {
		StringBuffer result = new StringBuffer(str.length());
		for(int i = 0; i < str.length() - 2; i += 3) {
			result.append(str.substring(i+1, i+3) + str.substring(i, i+1));
		}
		return result.toString();
	}

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
	}

}
