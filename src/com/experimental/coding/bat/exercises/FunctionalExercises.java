package com.experimental.coding.bat.exercises;

import java.util.List;
import java.util.stream.Collectors;

public class FunctionalExercises {

	public static void main(String[] args) {
		new FunctionalExercises();
	}

	public FunctionalExercises() {

	}

	public List<Integer> doubling(List<Integer> nums) {
		nums.replaceAll(n -> n * 2);
		return nums;
	}

	public List<Integer> square(List<Integer> nums) {
		nums.replaceAll(n -> n * n);
		return nums;
	}

	public List<String> addStar(List<String> strings) {
		strings.replaceAll(n -> n + "*");
		return strings;
	}

	public List<String> copies3(List<String> strings) {
		strings.replaceAll(n -> n += n + n);
		return strings;
	}

	public List<String> moreY(List<String> strings) {
		strings.replaceAll(n -> "y" + n + "y");
		return strings;
	}

	public List<Integer> math1(List<Integer> nums) {
		nums.replaceAll(n -> (n + 1) * 10);
		return nums;
	}

	public List<Integer> rightDigit(List<Integer> nums) {
		nums.replaceAll(n -> n % 10);
		return nums;
	}

	public List<String> lower(List<String> strings) {
		strings.replaceAll(n -> n.toLowerCase());
		return strings;
	}

	public List<String> noX(List<String> strings) {
		strings.replaceAll(n -> n.replaceAll("x", ""));
		return strings;
	} // END OF Functional-1

	public List<Integer> noNeg(List<Integer> nums) {
		nums.removeIf(n -> n < 0);
		return nums;
	}

	public List<Integer> no9(List<Integer> nums) {
		nums.removeIf(n -> (n % 10) == 9);
		return nums;
	}

	public List<Integer> noTeen(List<Integer> nums) {
		nums.removeIf(n -> (n >= 13 && n <= 19));
		return nums;
	}

	public List<String> noLong(List<String> strings) {
		strings.removeIf(n -> n.length() >= 4);
		return strings;
	}

	public List<String> noZ(List<String> strings) {
		strings.removeIf(n -> n.contains("z"));
		return strings;
	}

	public List<String> no34(List<String> strings) {
		strings.removeIf(n -> n.length() == 3 || n.length() == 4);
		return strings;
	}

	public List<String> noYY(List<String> strings) {
		return strings.stream()
				.map(s -> s + "y")
				.filter(s -> !s.contains("yy"))
				.collect(Collectors.toList());
	}

	public List<Integer> two2(List<Integer> nums) {
		return nums.stream()
				.map(n -> n * 2)
				.filter(n -> !(n % 10 == 2))
				.collect(Collectors.toList());
	}

	public List<Integer> square56(List<Integer> nums) {
		return nums.stream()
				.map(n -> (n * n) + 10)
				.filter(n -> !(n % 10 == 5 || n % 10 == 6))
				.collect(Collectors.toList());
	} // END OF Functional-2

}
