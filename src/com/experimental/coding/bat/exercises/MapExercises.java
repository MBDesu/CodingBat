package com.experimental.coding.bat.exercises;

import java.util.HashMap;
import java.util.Map;

public class MapExercises {

	public static void main(String[] args) {
		new MapExercises();
	}

	public MapExercises() {
		
	}

	/*
	 * Modify and return the given map as follows: if the key "a" has a value,
	 * set the key "b" to have that value, and set the key "a" to have the value
	 * "". Basically "b" is a bully, taking the value and replacing it with the
	 * empty string.
	 */
	public Map<String, String> mapBully(Map<String, String> map) {
		if(map.containsKey("a")) {
			map.put("b", map.put("a", ""));
		}
		return map;
	}

	/*
	 * Modify and return the given map as follows: if the key "a" has a value,
	 * set the key "b" to have that same value. In all cases remove the key "c",
	 * leaving the rest of the map unchanged.
	 */
	public Map<String, String> mapShare(Map<String, String> map) {
		if(map.containsKey("a")) map.put("b", map.get("a"));
		if(map.containsKey("c")) map.remove("c");
		return map;
	}

	/*
	 * Modify and return the given map as follows: for this problem the map may
	 * or may not contain the "a" and "b" keys. If both keys are present, append
	 * their 2 string values together and store the result under the key "ab".
	 */
	public Map<String, String> mapAB(Map<String, String> map) {
		if(map.containsKey("a") && map.containsKey("b")) {
			map.put("ab", map.get("a") + map.get("b"));
		}
		return map;
	}

	/*
	 * Given a map of food keys and topping values, modify and return the map as
	 * follows: if the key "ice cream" is present, set its value to "cherry". In
	 * all cases, set the key "bread" to have the value "butter".
	 */
	public Map<String, String> topping1(Map<String, String> map) {
		if(map.containsKey("ice cream")) map.put("ice cream", "cherry");
		map.put("bread", "butter");
		return map;
	}

	/*
	 * Given a map of food keys and their topping values, modify and return the
	 * map as follows: if the key "ice cream" has a value, set that as the value
	 * for the key "yogurt" also. If the key "spinach" has a value, change that
	 * value to "nuts".
	 */
	public Map<String, String> topping2(Map<String, String> map) {
		if(map.containsKey("ice cream")) map.put("yogurt", map.get("ice cream"));
		if(map.containsKey("spinach")) map.put("spinach", "nuts");
		return map;
	}

	/*
	 * Given a map of food keys and topping values, modify and return the map as
	 * follows: if the key "potato" has a value, set that as the value for the
	 * key "fries". If the key "salad" has a value, set that as the value for
	 * the key "spinach".
	 */
	public Map<String, String> topping3(Map<String, String> map) {
		if(map.containsKey("potato")) map.put("fries", map.get("potato"));
		if(map.containsKey("salad")) map.put("spinach", map.get("salad"));
		return map;
	}

	/*
	 * Modify and return the given map as follows: if the keys "a" and "b" are
	 * both in the map and have equal values, remove them both.
	 */
	public Map<String, String> mapAB2(Map<String, String> map) {
		if((map.containsKey("a") && map.containsKey("b")) && (map.get("a").equals(map.get("b")))) {
			map.remove("a");
			map.remove("b");
		}
		return map;
	}

	/*
	 * Modify and return the given map as follows: if exactly one of the keys
	 * "a" or "b" has a value in the map (but not both), set the other to have
	 * that same value in the map.
	 */
	public Map<String, String> mapAB3(Map<String, String> map) {
		if(map.containsKey("a") ^ map.containsKey("b")) {
			boolean aIsSet = map.containsKey("a");
			map.put(aIsSet ? "b" : "a", map.get(aIsSet ? "a" : "b"));
		}
		return map;
	}

	/*
	 * Modify and return the given map as follows: if the keys "a" and "b" have
	 * values that have different lengths, then set "c" to have the longer
	 * value. If the values exist and have the same length, change them both to
	 * the empty string in the map.
	 */
	public Map<String, String> mapAB4(Map<String, String> map) {
		if(map.containsKey("a") && map.containsKey("b")) {
			int a = map.get("a").length();
			int b = map.get("b").length();
			if(a != b) map.put("c", map.get(a > b ? "a" : "b"));
			else {
				map.put("a", "");
				map.put("b", "");
			}
		}
		return map;
	} // END OF Map-1
	
	/*
	 * Given an array of strings, return a Map<String, Integer> containing a key
	 * for every different string in the array, always with the value 0. For
	 * example the string "hello" makes the pair "hello":0. We'll do more
	 * complicated counting later, but for this problem the value is simply 0.
	 */
	public Map<String, Integer> word0(String[] strings) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 0; i < strings.length; i++) {
			map.put(strings[i], 0);
		}
		return map;
	}

	/*
	 * Given an array of strings, return a Map<String, Integer> containing a key
	 * for every different string in the array, and the value is that string's
	 * length.
	 */
	public Map<String, Integer> wordLen(String[] strings) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 0; i < strings.length; i++) {
			map.put(strings[i], strings[i].length());
		}
		return map;
	}

	/*
	 * Given an array of non-empty strings, create and return a Map<String,
	 * String> as follows: for each string add its first character as a key with
	 * its last character as the value.
	 */
	public Map<String, String> pairs(String[] strings) {
		Map<String, String> map = new HashMap<String, String>();
		for(int i = 0; i < strings.length; i++) {
			map.put(strings[i].substring(0,1), strings[i].substring(strings[i].length()-1));
		}
		return map;
	}

	/*
	 * The classic word-count algorithm: given an array of strings, return a
	 * Map<String, Integer> with a key for each different string, with the value
	 * the number of times that string appears in the array.
	 */
	public Map<String, Integer> wordCount(String[] strings) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 0; i < strings.length; i++) {
			map.put(strings[i], map.containsKey(strings[i]) ? map.get(strings[i]) + 1 : 1);
		}
		return map;
	}

	/*
	 * Given an array of non-empty strings, return a Map<String, String> with a
	 * key for every different first character seen, with the value of all the
	 * strings starting with that character appended together in the order they
	 * appear in the array.
	 */
	public Map<String, String> firstChar(String[] strings) {
		Map<String, String> map = new HashMap<String, String>();
		for(int i = 0; i < strings.length; i++) {
			String firstLetter = strings[i].substring(0,1);
			map.put(firstLetter, map.containsKey(firstLetter) ? map.get(firstLetter) + strings[i] : strings[i]);
		}
		return map;
	}

	/*
	 * Loop over the given array of strings to build a result string like this:
	 * when a string appears the 2nd, 4th, 6th, etc. time in the array, append
	 * the string to the result. Return the empty string if no string appears a
	 * 2nd time.
	 */
	public String wordAppend(String[] strings) {
		String result = "";
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 0; i < strings.length; i++) {
			map.put(strings[i], map.containsKey(strings[i]) ? 1 + map.get(strings[i]) : 1);
			if(map.get(strings[i]) % 2 == 0) {
				result += strings[i];
			}
		}
		return result;
	}

	/*
	 * Given an array of strings, return a Map<String, Boolean> where each
	 * different string is a key and its value is true if that string appears 2
	 * or more times in the array.
	 */
	public Map<String, Boolean> wordMultiple(String[] strings) {
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		for(int i = 0; i < strings.length; i++) {
			if(map.containsKey(strings[i])) map.put(strings[i], true);
			else map.put(strings[i], false);
		}
		return map;
	}

	/*
	 * We'll say that 2 strings "match" if they are non-empty and their first
	 * chars are the same. Loop over and then return the given array of
	 * non-empty strings as follows: if a string matches an earlier string in
	 * the array, swap the 2 strings in the array. When a position in the array
	 * has been swapped, it no longer matches anything. Using a map, this can be
	 * solved making just one pass over the array. More difficult than it looks.
	 */
	public String[] allSwap(String[] strings) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 0; i < strings.length; i++) {
			String key = strings[i].substring(0,1);
			if(map.containsKey(key)) { // key exists already; swap with previous entry, remove key
				int matchIndex = map.get(key);
				String temp = strings[i]; // store strings[i] before making it the previous value
				strings[i] = strings[matchIndex]; // store the previous value in strings[i]
				strings[matchIndex] = temp; // store the new value in the previous index
				map.remove(key); // remove the key
			} else {
				map.put(key, i);
			}
		}
		return strings;
	}

	/*
	 * We'll say that 2 strings "match" if they are non-empty and their first
	 * chars are the same. Loop over and then return the given array of
	 * non-empty strings as follows: if a string matches an earlier string in
	 * the array, swap the 2 strings in the array. A particular first char can
	 * only cause 1 swap, so once a char has caused a swap, its later swaps are
	 * disabled. Using a map, this can be solved making just one pass over the
	 * array. More difficult than it looks.
	 */
	public String[] firstSwap(String[] strings) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		Map<String, Boolean> used = new HashMap<String, Boolean>();
		for(int i = 0; i < strings.length; i++) {
			String key = strings[i].substring(0,1);
			if(map.containsKey(key)) {
				int matchIndex = map.get(key);
				if(!used.containsKey(key)) {
					used.put(key, true);
					String temp = strings[i];
					strings[i] = strings[matchIndex];
					strings[matchIndex] = temp;
				}
			} else {
				map.put(key, i);
			}
		}
		return strings;
	} // END OF Map-2

}
