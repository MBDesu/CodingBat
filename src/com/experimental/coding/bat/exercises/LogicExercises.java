package com.experimental.coding.bat.exercises;

public class LogicExercises {

	public static void main(String[] args) {
		new LogicExercises();
	}

	public LogicExercises() {
		makeChocolate(4, 1, 9);
		makeChocolate(4, 1, 10);
	}

	public boolean cigarParty(int cigars, boolean isWeekend) {
		return isWeekend ? cigars >= 40 : cigars >= 40 && cigars <= 60;
	}

	public int dateFashion(int you, int date) {
		if(you <= 2 || date <= 2) return 0;
		if(you >= 8 || date >= 8) return 2;
		return 1;
	}

	public boolean squirrelPlay(int temp, boolean isSummer) {
		if(temp >= 60) return isSummer ? temp <= 100 : temp <= 90;
		return false;
	}

	public int caughtSpeeding(int speed, boolean isBirthday) {
		if(isBirthday) speed -= 5;
		if(speed <= 60) return 0;
		else if(speed >= 61 && speed <= 80) return 1;
		return 2;
	}

	public int sortaSum(int a, int b) {
		int sum = a + b;
		return sum >= 10 && sum <= 19 ? 20 : sum;
	}

	public String alarmClock(int day, boolean vacation) {
		if(vacation) {
			return day >= 1 && day <= 5 ? "10:00" : "off";
		}
		return day >= 1 && day <= 5 ? "7:00" : "10:00";
	}

	public boolean love6(int a, int b) {
		return a + b == 6 || Math.abs(a - b) == 6 || a == 6 || b == 6;
	}

	public boolean in1To10(int n, boolean outsideMode) {
		return outsideMode ? n <= 1 || n >= 10 : n >= 1 && n <= 10;
	}

	public boolean specialEleven(int n) {
		return n % 11 == 0 || n % 11 == 1;
	}

	public boolean more20(int n) {
		return n % 20 == 1 || n % 20 == 2;
	}

	public boolean old35(int n) {
		return n % 3 == 0 ^ n % 5 == 0;
	}

	public boolean less20(int n) {
		return n % 20 == 19 || n % 20 == 18;
	}

	public boolean nearTen(int n) {
		return n % 10 >= 8 || n % 10 <= 2;
	}

	public int teenSum(int a, int b) {
		return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) ? 19 : a + b;
	}

	public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		if(isAsleep) return false;
		if(isMorning) {
			if(isMom) return true;
			return false;
		}
		return true;
	}

	public int teaParty(int tea, int candy) {
		if(tea < 5 || candy < 5) return 0;
		if(tea >= candy * 2 || candy >= tea * 2) return 2;
		return 1;
	}

	public String fizzString(String str) {
		if(str.startsWith("f") ^ str.endsWith("b")) {
			return str.startsWith("f") ? "Fizz" : "Buzz";
		}
		return str.startsWith("f") && str.endsWith("b") ? "FizzBuzz" : str;
	}

	public String fizzString2(int n) {
		boolean multipleOf5 = n % 5 == 0;
		boolean multipleOf3 = n % 3 == 0;

		if(multipleOf5 && multipleOf3) return "FizzBuzz!";
		if(multipleOf5) return "Buzz!";
		if(multipleOf3) return "Fizz!";
		return n + "!";
	}

	public boolean twoAsOne(int a, int b, int c) {
		return a + b == c || b + c == a || a + c == b;
	}

	public boolean inOrder(int a, int b, int c, boolean bOk) {
		return bOk ? c > b : b > a && c > b;
	}

	public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
		return equalOk ? a <= b && b <= c : a < b && b < c;
	}

	public boolean lastDigit(int a, int b, int c) {
		return a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10;
	}

	public boolean lessBy10(int a, int b, int c) {
		return Math.abs(a - b) >= 10 || Math.abs(a - c) >= 10 || Math.abs(b - c) >= 10;
	}

	public int withoutDoubles(int die1, int die2, boolean noDoubles) {
		if(noDoubles && die1 == die2) {
			if(die2 == 6) die2 = 1;
			else die2 += 1;
		}
		return die1 + die2;
	}

	public int maxMod5(int a, int b) {
		if(a == b) return 0;
		if(a % 5 == b % 5) return a > b ? b : a;
		return a > b ? a : b;
	}

	public int redTicket(int a, int b, int c) {
		if(a == b && b == c) {
			if(a == 2) return 10;
			return 5;
		} else if(a != b && a != c) {
			return 1;
		}
		return 0;
		/*if(a == 2 && a == b && a == c) return 10;
		if(a == b && b == c) return 5;
		if(a != b && a != c) return 1;
		return 0;*/
	}

	public int greenTicket(int a, int b, int c) {
		if(a == b && b == c) return 20;
		if(a == b || b == c || c == a) return 10;
		return 0;
	}

	public int blueTicket(int a, int b, int c) {
		int ab = a + b;
		int bc = b + c;
		int ac = a + c;
		if(ab == 10 || bc == 10 || ac == 10) return 10;
		if(ab - 10 == bc || ab - 10 == ac) return 5;
		return 0;
	}

	public boolean shareDigit(int a, int b) {
		int al = a / 10;
		int ar = a % 10;
		int bl = b / 10;
		int br = b % 10;

		return al == bl || al == br || ar == bl || ar == br;
	}

	public int sumLimit(int a, int b) {
		return String.valueOf(a + b).length() > String.valueOf(a).length() ? a : a + b;
	}

	public boolean makeBricks(int small, int big, int goal) {
		if(goal > big * 5 + small) return false;
		if(goal % 5 > small) return false;
		return true;
	}

	public int loneSum(int a, int b, int c) {
		int sum = 0;
		if(a != b && a != c) sum += a;
		if(b != a && b != c) sum += b;
		if(c != a && c != b) sum += c;
		return sum;
	}

	public int luckySum(int a, int b, int c) {
		int sum = 0;
		if(a == 13) return sum;
		sum += a;
		if(b == 13) return sum;
		sum += b;
		if(c == 13) return sum;
		return sum + c;
	}

	public int noTeenSum(int a, int b, int c) {
		return fixTeen(a) + fixTeen(b) + fixTeen(c);
	}

	private int fixTeen(int n) {
		if(n >= 13 && n <= 19) {
			if(n == 15 || n == 16) {
				return n;
			}
			return 0;
		}
		return n;
	}

	public int roundSum(int a, int b, int c) {
		return round10(a) + round10(b) + round10(c);
	}

	private int round10(int num) {
		int rightDigit = num % 10;
		num -= rightDigit;
		if(rightDigit >= 5) {
			num += 10;
		}
		return num;
	}

	public boolean closeFar(int a, int b, int c) {
		boolean bIsClose = Math.abs(a - b) > 1;
		boolean cIsClose = Math.abs(a - c) > 1;
		if(bIsClose ^ cIsClose) {
			return (Math.abs(b - c) >= 2 && Math.abs(b - a) >= 2) ^ (Math.abs(c - a) >= 2 && Math.abs(c - b) >= 2);
		}
		return false;
	}

	public int blackjack(int a, int b) {
		if(a > 21 && b > 21) return 0;
		if(a > 21) return b;
		if(b > 21) return a;
		return a > b ? a : b;
	}
	
	public boolean evenlySpaced(int a, int b, int c) {
		return ((a + b) == 2 * c) || ((a + c) == 2 * b) || ((b + c) == 2 * a);
	}
	
	public int makeChocolate(int small, int big, int goal) {
		int s = goal - Math.min(big,  goal / 5) * 5;
		return s <= small ? s : -1;
	}

}
