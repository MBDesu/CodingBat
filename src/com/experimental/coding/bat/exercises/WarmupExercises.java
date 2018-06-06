package com.experimental.coding.bat.exercises;

public class WarmupExercises {

	public static void main(String[] args) {
		new WarmupExercises();
	}

	public WarmupExercises() {

	}

	public boolean sleepIn(boolean weekday, boolean vacation) {
		return(!weekday || vacation);
	}

	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		return (aSmile && bSmile) || (!aSmile && !bSmile);
	}

	public int sumDouble(int a, int b) {
		if(a == b) return (a + b) * 2;
		return a + b;
	}

	public int diff21(int n) {
		if(n <= 21) return 21 - n;
		return (n - 21) * 2;
	}

	public boolean parrotTrouble(boolean talking, int hour) {
		return(talking && (hour > 20 || hour < 7));
	}

	public boolean makes10(int a, int b) {
		return a == 10 || b == 10 || a + b == 10;
	}

	public boolean nearHundred(int n) {
		return Math.abs(n - 100) <= 10 || Math.abs(n - 200) <= 10;
	}

	public boolean posNeg(int a, int b, boolean negative) {
		if(!negative) return a < 0 ^ b < 0;
		return a < 0 && b < 0;
	}

	public String notString(String str) {
		return str.startsWith("not") ? str : "not " + str;
	}

	public String missingChar(String str, int n) {
		return str.substring(0, n) + str.substring(n + 1);
	}

	public String frontBack(String str) {
		if(str.length() < 2) return str;
		String first = str.substring(0, 1);
		String last = str.substring(str.length() - 1);
		String middle = str.substring(1, str.length() - 1);
		return last + middle + first;
	}

	public String front3(String str) {
		if(str.length() < 3) return str + str + str;
		String ret = str.substring(0, 3);
		return ret + ret + ret;
	}

	public String backAround(String str) {
		String last = str.substring(str.length() - 1);
		return last + str + last;
	}

	public boolean or35(int n) {
		return n % 5 == 0 || n % 3 == 0;
	}

	public String front22(String str) {
		if(str.length() < 2) return str + str + str;
		String front = str.substring(0, 2);
		return front + str + front;
	}

	public boolean startHi(String str) {
		return str.toLowerCase().startsWith("hi");
	}

	public boolean icyHot(int temp1, int temp2) {
		return (temp1 > 100 && temp2 < 0) || (temp1 < 0 && temp2 > 100);
	}

	public boolean in1020(int a, int b) {
		return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
	}

	public boolean hasTeen(int a, int b, int c) {
		return isTeen(a) || isTeen(b) || isTeen(c);
	}

	private boolean isTeen(int n) {
		return n >= 13 && n <= 19;
	}

	public boolean loneTeen(int a, int b) {
		return isTeen(a) ^ isTeen(b);
	}

	public String delDel(String str) {
		if(str.length() < 4) return str;
		if("del".equals(str.substring(1, 4))) return str.substring(0, 1) + str.substring(4);
		return str;
	}

	public boolean mixStart(String str) {
		return str.matches("^.{1}(ix).*$");
	}

	public String startOz(String str) {
		String result = "";
		int len = str.length();
		if(len >= 1 && str.charAt(0) == 'o') result += str.charAt(0);
		if(len >= 2 && str.charAt(1) == 'z') result += str.charAt(1);
		return result;
	}

	public int intMax(int a, int b, int c) {
		return Math.max(a, Math.max(b, c));
	}

	public int close10(int a, int b) {
		int diffA = Math.abs(10 - a);
		int diffB = Math.abs(10 - b);
		if(diffA == diffB) return 0;
		return diffA > diffB ? b : a;
	}
	
	public boolean in3050(int a, int b) {
		return (((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) ||
				((a >= 40 && a <= 50) && (b >= 40 && b <= 50)));
	}
	
	public int max1020(int a, int b) {
		a = a >= 10 && a <= 20 ? a : 0;
		b = b >= 10 && b <= 20 ? b : 0;
		return Math.max(a, b);
	}
	
	public boolean stringE(String str) {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'e') count++;
		}
		return count >= 1 && count <= 3;
	}
	
	public boolean lastDigit(int a, int b) {
		return a % 10 == b % 10;
	}
	
	public String endUp(String str) {
		int len = str.length();
		if(len < 3) return str.toUpperCase();
		String front = str.substring(0, len - 3);
		String back = str.substring(len - 3).toUpperCase();
		return front + back;
	}
	
	public String everyNth(String str, int n) {
		String result = "";
		for(int i = 0; i < str.length(); i += n) {
			result += str.charAt(i);
		}
		return result;
	} // END OF Warmup-1
	
	public String stringTimes(String str, int n) {
		if(n == 0 || "".equals(str)) return "";
		if(n == 1) return str;
		return str + stringTimes(str, --n);
	}
	
	public String frontTimes(String str, int n) {
		if(n == 0 || "".equals(str)) return "";
		String front = str.length() < 3 ? str : str.substring(0, 3);
		if(n == 1) return front;
		return front + frontTimes(str, --n);
	}
	
	public int countXX(String str) {
		if(str.length() < 2) return 0;
		return "xx".equals(str.substring(0, 2)) ? 1 + countXX(str.substring(1)) : countXX(str.substring(1));
	}
	
	public boolean doubleX(String str) {
		int pos = str.indexOf('x');
		if(pos+1 >= str.length()) return false;
		return pos >= 0 ? str.charAt(pos + 1) == 'x' : false;
	}
	
	public String stringBits(String str) {
		String result = "";
		for(int i = 0; i < str.length(); i+=2) {
			result += str.substring(i, i+1);
		}
		return result;
	}
	
	public String stringSplosion(String str) {
		String result = "";
		for(int i = 0; i < str.length(); i++) {
			result += str.substring(0, i+1);
		}
		return result;
	}
	
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
	
	public int arrayCount9(int[] nums) {
		int count = 0;
		for(Integer i : nums) {
			if(i == 9) count++;
		}
		return count;
	}
	
	public boolean arrayFront9(int[] nums) {
		int bound = nums.length < 4 ? nums.length : 4;
		for(int i = 0; i < bound; i++) {
			if(nums[i] == 9) return true;
		}
		return false;
	}
	
	public boolean array123(int[] nums) {
		for(int i = 0; i < nums.length - 2; i++) {
			if((nums[i] == 1)) {
				if(nums[i + 1] == 2 && nums[i + 2] == 3) return true;
			}
		}
		return false;
	}
	
	public int stringMatch(String a, String b) {
		int count = 0;
		int len = Math.min(a.length(), b.length());
		for(int i = 0; i < len-1; i++) {
			if(a.substring(i, i+2).equals(b.substring(i, i+2))) count++;
		}
		return count;
	}
	
	public String stringX(String str) {
		String result = "";
		for(int i = 0; i < str.length(); i++) {
			if(!(i > 0 && i < str.length() - 1 && str.substring(i, i+1).equals("x"))) result += str.substring(i, i+1);
		}
		return result;
	}
	
	public String altPairs(String str) {
		String result = "";
		for(int i = 0; i < str.length(); i+=4) { 
			int end = i + 2;
			if(end > str.length()) end = str.length();
			result += str.substring(i, end);
		}
		return result;
	}
	
	public String stringYak(String str) {
		return str.replaceAll("([yY]{1}.{1}[kK]{1})", "");
	}
	
	public int array667(int[] nums) {
		int count = 0;
		for(int i = 0; i < nums.length - 1; i++) {
			if(nums[i] == 6 && (nums[i+1] == 6 || nums[i+1] == 7)) count++;
		}
		return count;
	}
	
	public boolean noTriples(int[] nums) {
		for(int i = 1; i < nums.length - 1; i++) {
			if(nums[i] == nums[i-1] && nums[i] == nums[i+1]) return false;
		}
		return true;
	}
	
	public boolean has271(int[] nums) {
		for(int i = 1; i < nums.length - 1; i++) {
			if((nums[i-1] == nums[i] - 5) && Math.abs((nums[i-1] - 1) - nums[i+1]) <= 2) return true;
		}
		return false;
	} // END OF Warmup-2

}
