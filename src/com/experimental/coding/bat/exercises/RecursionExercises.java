package com.experimental.coding.bat.exercises;

public class RecursionExercises {

	public static void main(String[] args) {
		// avoid static context stuff; do testing in constructor
		new RecursionExercises();
	}

	public RecursionExercises() {
		// do testing here

	}

	public int factorial(int n) {
		if(n == 1) return 1;
		return n * factorial(--n);
	}

	public int bunnyEars(int bunnies) {
		if(bunnies == 0) return 0;
		return 2 + bunnyEars(--bunnies);
	}

	public int fibonacci(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public int bunnyEars2(int bunnies) {
		if(bunnies == 0) return 0;
		return bunnies % 2 == 0 ? 3 + bunnyEars2(--bunnies) : 2 + bunnyEars2(--bunnies);
	}

	public int triangle(int rows) {
		if(rows <= 1) return rows;
		return rows + triangle(rows - 1);
	}

	public int sumDigits(int n) {
		if(n < 10) return n;
		return n % 10 + sumDigits(n / 10);
	}

	public int count7(int n) {
		if(n < 10) return n == 7 ? 1 : 0;
		return n % 10 == 7 ? 1 + count7(n / 10) : count7(n / 10);
	}

	public int count8(int n) {
		if (n < 1) return 0;
		if (n % 10 == 8 && (n / 10) % 10 == 8) return 2 + count8(n/10);
		else if (n % 10 == 8) return 1 + count8(n/10);
		else return count8(n/10);
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

	public String changePi(String str) {
		if(str.length() < 2) return str;
		if("pi".equals(str.substring(0,2))) return "3.14" + changePi(str.substring(2));
		return str.substring(0,1) + changePi(str.substring(1));
	}

	public String noX(String str) {
		if(str.length() < 1) return "";
		return "x".equals(str.substring(0,1)) ? "" + noX(str.substring(1)) : str.substring(0,1) + noX(str.substring(1));
	}

	public boolean array6(int[] nums, int index) {
		if(nums.length < 1) return false;
		if(index >= nums.length - 1)  return nums[index] == 6;
		return nums[index] == 6 ? true : array6(nums, ++index);
	}

	public int array11(int[] nums, int index) {
		if(nums.length < 1) return 0;
		if(index >= nums.length - 1) return nums[index] == 11 ? 1 : 0;
		return nums[index] == 11 ? 1 + array11(nums, ++index) : array11(nums, ++index);
	}

	public boolean array220(int[] nums, int index) {
		if (index >= nums.length-1) return false;
		if (nums[index+1] == nums[index] * 10) return true;
		return array220(nums, index+1);
	}

	public String allStar(String str) {
		if(str.length() < 2) return str;
		return str.substring(0,1) + "*" + allStar(str.substring(1));
	}

	public String pairStar(String str) {
		if (str.equals("") || str.length() == 1) return str;
		if (str.charAt(0) == str.charAt(1)) 
			return str.charAt(0) + "*" + pairStar(str.substring(1));
		else
			return str.charAt(0) + pairStar(str.substring(1));
	}

	public String endX(String str) {
		if (str.equals("")) return str;
		if (str.charAt(0) == 'x') return endX(str.substring(1)) + 'x';
		else return str.charAt(0) + endX(str.substring(1));
	}

	public int countPairs(String str) {
		if (str.equals("") || str.length() < 3) return 0;
		if (str.charAt(0) == str.charAt(2)) return 1 + countPairs(str.substring(1));
		else return countPairs(str.substring(1));
	}

	public int countAbc(String str) {
		if (str.length() < 3) return 0;
		if (str.substring(0,3).equals("abc") || str.substring(0,3).equals("aba"))
			return 1 + countAbc(str.substring(1));
		else
			return countAbc(str.substring(1));
	}

	public int count11(String str) {
		if (str.length() < 2) return 0;
		if (str.substring(0,2).equals("11"))
			return 1 + count11(str.substring(2));
		else
			return count11(str.substring(1));
	}

	public String stringClean(String str) {
		if (str.length() < 2) return str;
		if (str.charAt(0) == str.charAt(1))
			return stringClean(str.substring(1));
		else
			return str.charAt(0) + stringClean(str.substring(1));
	}

	public int countHi2(String str) {
		int len = str.length();
		if (len < 2) return 0;
		if (str.substring(len-2, len).equals("hi")) {
			if ((len > 2 && str.charAt(len-3) != 'x') || len == 2 )
				return 1 + countHi2(str.substring(0, len-1));
		}
		return countHi2(str.substring(0, len-1));
	}

	public String parenBit(String str) {
		if (str.equals("")) return str;
		if (str.charAt(0) == '(') {
			if (str.charAt(str.length()-1) == ')')
				return str;
			else 
				return parenBit(str.substring(0, str.length()-1));
		} else
			return parenBit(str.substring(1));
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

	// the following are not CodingBat exercises, but exercises from elsewhere

	public boolean isPowerOfTwo(int i) {
		if(i == 1) return true;
		return i % 2 == 0 ? isPowerOfTwo(i / 2) : false;
	}

	public int gcf(int x, int y) {
		if(x == 0) return 1;
		return x % y == 0 ? y : gcf(y, x % y);
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

}
