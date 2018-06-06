package com.experimental.coding.bat.exercises;

import java.util.HashMap;
import java.util.Map;

public class MapExercises {

	public static void main(String[] args) {
		new MapExercises();
	}

	public MapExercises() {
		
	}

	public Map<String, String> mapBully(Map<String, String> map) {
		if(map.containsKey("a")) {
			map.put("b", map.put("a", ""));
		}
		return map;
	}
	
	public Map<String, String> mapShare(Map<String, String> map) {
		if(map.containsKey("a")) map.put("b", map.get("a"));
		if(map.containsKey("c")) map.remove("c");
		return map;
	}
	
	public Map<String, String> mapAB(Map<String, String> map) {
		if(map.containsKey("a") && map.containsKey("b")) {
			map.put("ab", map.get("a") + map.get("b"));
		}
		return map;
	}
	
	public Map<String, String> topping1(Map<String, String> map) {
		if(map.containsKey("ice cream")) map.put("ice cream", "cherry");
		map.put("bread", "butter");
		return map;
	}
	
	public Map<String, String> topping2(Map<String, String> map) {
		if(map.containsKey("ice cream")) map.put("yogurt", map.get("ice cream"));
		if(map.containsKey("spinach")) map.put("spinach", "nuts");
		return map;
	}
	
	public Map<String, String> topping3(Map<String, String> map) {
		if(map.containsKey("potato")) map.put("fries", map.get("potato"));
		if(map.containsKey("salad")) map.put("spinach", map.get("salad"));
		return map;
	}
	
	public Map<String, String> mapAB2(Map<String, String> map) {
		if((map.containsKey("a") && map.containsKey("b")) && (map.get("a").equals(map.get("b")))) {
			map.remove("a");
			map.remove("b");
		}
		return map;
	}
	
	public Map<String, String> mapAB3(Map<String, String> map) {
		if(map.containsKey("a") ^ map.containsKey("b")) {
			boolean aIsSet = map.containsKey("a");
			map.put(aIsSet ? "b" : "a", map.get(aIsSet ? "a" : "b"));
		}
		return map;
	}
	
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
	
	public Map<String, Integer> word0(String[] strings) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 0; i < strings.length; i++) {
			map.put(strings[i], 0);
		}
		return map;
	}
	
	public Map<String, Integer> wordLen(String[] strings) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 0; i < strings.length; i++) {
			map.put(strings[i], strings[i].length());
		}
		return map;
	}
	
	public Map<String, String> pairs(String[] strings) {
		Map<String, String> map = new HashMap<String, String>();
		for(int i = 0; i < strings.length; i++) {
			map.put(strings[i].substring(0,1), strings[i].substring(strings[i].length()-1));
		}
		return map;
	}
	
	public Map<String, Integer> wordCount(String[] strings) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 0; i < strings.length; i++) {
			map.put(strings[i], map.containsKey(strings[i]) ? map.get(strings[i]) + 1 : 1);
		}
		return map;
	}
	
	public Map<String, String> firstChar(String[] strings) {
		Map<String, String> map = new HashMap<String, String>();
		for(int i = 0; i < strings.length; i++) {
			String firstLetter = strings[i].substring(0,1);
			map.put(firstLetter, map.containsKey(firstLetter) ? map.get(firstLetter) + strings[i] : strings[i]);
		}
		return map;
	}
	
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
	
	public Map<String, Boolean> wordMultiple(String[] strings) {
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		for(int i = 0; i < strings.length; i++) {
			if(map.containsKey(strings[i])) map.put(strings[i], true);
			else map.put(strings[i], false);
		}
		return map;
	}
	
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
