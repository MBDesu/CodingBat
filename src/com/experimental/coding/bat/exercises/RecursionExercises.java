package com.experimental.coding.bat.exercises;

public class RecursionExercises {
	
	public static void main(String[] args) {
		// avoid static context stuff; do testing in constructor
		new RecursionExercises();
	}
	
	public RecursionExercises() {
		// do testing here
		
	}

	public boolean isPowerOfTwo(int i) {
		if(i == 1) return true;
		return i % 2 == 0 ? isPowerOfTwo(i / 2) : false;
	}

	public int gcf(int x, int y) {
		if(x == 0) return 1;
		return x % y == 0 ? y : gcf(y, x % y);
	}

	public int powerN(int base, int n) {
		if(n == 0) return 1;
		if(n == 1) return base;
		return base * powerN(base, --n);
	}

	public int countX(String str) {
		if(str.length() < 1) return 0;
		return "x".equals(str.substring(0,1)) ? 1 + countX(str.substring(1)) : countX(str.substring(1));
	}

	public int countHi(String str) {
		if(str.length() < 2) return 0;
		return "hi".equals(str.substring(0,2)) ? 1 + countHi(str.substring(2)) : countHi(str.substring(1));
	}

	public String changeXY(String str) {
		return changeXY(str, 0);
	}

	private String changeXY(String str, int i) {
		if(str.length() < 1) return "";
		return str.charAt(i) == 'x' ? "y" + changeXY(str.substring(++i)) : str.charAt(i) + changeXY(str.substring(++i));
	}

	public int sum(int n) {
		if(n == 1) return 1;
		return n + sum(--n);
	}

	public int findMin(int[] a, int n) {
		if(n == 0) return a[0];
		int[] b = a.clone();
		if(a[0] > a[n - 1]) b[0] = a[n - 1];
		return findMin(b, --n);
	}

	public int findSum(int[] a, int n) {
		return n == 1 ? a[0] : a[n - 1] + findSum(a, --n);
	}

	public boolean isPalindrome(char[] a) {
		return isPalindrome(a, a.length); 
	}
	
	private boolean isPalindrome(char[] a, int n) {
		if(n <= 1) return true;
		return a[Math.abs(n - a.length)] == a[n - 1] ? isPalindrome(a, --n) : false;
	}

	public boolean isPalindrome(String str) {
		return isPalindrome(str, str.length());
	}

	private boolean isPalindrome(String str, int n) {
		if(n <= 1) return true;
		return str.charAt(Math.abs(n - str.length())) == str.charAt(n - 1) ? isPalindrome(str, --n) : false;
	}
	
	// this one uses backtracking, which is hard af
	public boolean groupSum(int start, int[] nums, int target) {
		if(start >= nums.length) return (target == 0);
		if(groupSum(start + 1, nums, target - nums[start])) return true;
		if(groupSum(start + 1, nums, target)) return true;
		return false;
	}
	
	public boolean nestParen(String str) {
		return nestParen(str, str.length());
	}
	
	private boolean nestParen(String str, int n) {
		if(n <= 1) return true;
		char firstChar = str.charAt(Math.abs(n - str.length()));
		char secondChar = str.charAt(n - 1);
		return (firstChar == '(' && secondChar == ')') || (firstChar == ')' && secondChar == '(') ? nestParen(str, --n) : false;
	}
	
	public int strCount(String str, String sub) {
		if(str.length() < sub.length()) return 0;
		return str.substring(0, sub.length()).equals(sub) ? 1 + strCount(str.substring(sub.length()), sub) : strCount(str.substring(1), sub);
	}
	
	public boolean strCopies(String str, String sub, int n) {
		if(n == 0) return true;
		if(str.length() < sub.length()) return false;
		if(str.substring(0, sub.length()).equals(sub)) return strCopies(str.substring(1), sub, --n);
		else return strCopies(str.substring(1), sub, n);
		// return str.substring(0, sub.length()).equals(sub) ? strCopies(str.substring(1), sub, --n) : strCopies(str.substring(1), sub, n);
	}
	
}
