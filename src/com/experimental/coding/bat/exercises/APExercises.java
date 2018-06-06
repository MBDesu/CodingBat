package com.experimental.coding.bat.exercises;

import java.util.ArrayList;
import java.util.List;

public class APExercises {

	public static void main(String[] args) {
		new APExercises();
	}

	public APExercises() {

	}

	// start AP-1

	public boolean scoresIncreasing(int[] scores) {
		for(int i = 1; i < scores.length; i++)
			if(scores[i] < scores[i - 1]) return false;
		return true;
	}

	public boolean scores100(int[] scores) {
		for(int i = 1; i < scores.length; i++)
			if(scores[i - 1] == 100 && scores[i] == 100) return true;
		return false;
	}

	public boolean scoresClump(int[] scores) {
		for(int i = 1; i < scores.length - 1; i++)
			if(Math.abs(scores[i - 1] - scores[i]) > 2 || Math.abs(scores[i + 1] - scores[i]) > 2) return false;
		return true;
	}

	public int scoresAverage(int[] scores) {
		return average(scores, 0, scores.length / 2) + average(scores, scores.length / 2 + 1, scores.length - 1);
	}

	public int average(int[] scores, int start, int end) {
		int sum = 0;
		for(int i = start; i <= end; i++) {
			sum += scores[start];
		}
		return sum / (end - start);
	}

	public int wordsCount(String[] words, int len) {
		int count = 0;
		for(String s : words)
			if(s.length() == len) count++;
		return count;
	}

	public String[] wordsFront(String[] words, int n) {
		String[] result = new String[n];
		for(int i = 0; i < n; i++)
			result[i] = words[i];
		return result;
	}

	public List<String> wordsWithoutList(String[] words, int len) {
		List<String> result = new ArrayList<String>();
		for(int i = 0; i < words.length; i++) {
			if(words[i].length() != len) result.add(words[i]);
		}
		return result;
	}

	public boolean hasOne(int n) {
		if(n < 10) return n == 1;
		return n % 10 == 1 ? true : hasOne(n / 10);
	}

	public boolean dividesSelf(int n) {
		int copy = n;
		while(copy > 0) {
			int rightDigit = copy % 10;
			if(rightDigit == 0 || n % rightDigit != 0) return false;
			copy /= 10;
		}
		return true;
	}

	public int[] copyEvens(int[] nums, int count) {
		int[] result = new int[count];
		int evenCount = 0;
		for(int i = 0; i < nums.length && evenCount < count; i++) {
			if(nums[i] % 2 == 0) {
				result[evenCount] = nums[i];
				evenCount++;
			}
		}
		return result;
	}

	public int[] copyEndy(int[] nums, int count) {
		int[] result = new int[count];
		int endyCount = 0;
		for(int i = 0; endyCount < count; i++) {
			if(isEndy(nums[i])) {
				result[endyCount] = nums[i];
				endyCount++;
			}
		}
		return result;
	}

	private boolean isEndy(int n) {
		return (n >= 0 && n <= 10) || (n >= 90 && n <= 100);
	}

	public int matchUp(String[] a, String[] b) {
		int count = 0;
		for(int i = 0; i < a.length; i++) {
			if(!("".equals(a[i]) || "".equals(b[i]))) {
				if(a[i].charAt(0) == b[i].charAt(0)) count++;
			}
		}
		return count;
	}

	public int scoreUp(String[] key, String[] answers) {
		int score = 0;
		for(int i = 0; i < key.length; i++) {
			if(answers[i].equals("?")) score +=0;
			else if(answers[i].equals(key[i])) score += 4;
			else score -= 1;
		}
		return score;
	}

	public String[] wordsWithout(String[] words, String target) {
		int count = 0;
		for(int i = 0; i < words.length; i++) {
			count += words[i].equals(target) ? 0 : 1;
		}
		String[] result = new String[count];
		for(int i = 0, j = 0; i < words.length && j < count; i++) {
			if(!(words[i].equals(target))) {
				result[j++] = words[i];
			}
		}
		return result;
	}

	public int scoresSpecial(int[] a, int[] b) {
		return largestSpecial(a) + largestSpecial(b);
	}

	private int largestSpecial(int[] a) {
		int largest = 0;
		for(int i : a) {
			if(i > largest && i >= 10 && i % 10 == 0) largest = i;
		}
		return largest;
	}

	public int sumHeights(int[] heights, int start, int end) {
		int sum = 0;
		for(int i = start; i < end; i++) {
			sum += Math.abs(heights[i] - heights[i + 1]);
		}
		return sum;
	}

	public int sumHeights2(int[] heights, int start, int end) {
		int sum = 0;
		for(int i = start; i < end; i++) {
			if(heights[i] < heights[i + 1]) sum += Math.abs(heights[i] - heights[i + 1]) * 2;
			else sum += Math.abs(heights[i] - heights[i + 1]);
		}
		return sum;
	}

	public int bigHeights(int[] heights, int start, int end) {
		int sum = 0;
		for(int i = start; i < end; i++) {
			int delta = Math.abs(heights[i] - heights[i + 1]);
			if(delta >= 5) sum ++;
		}
		return sum;
	}

}
