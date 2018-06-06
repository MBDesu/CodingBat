package com.experimental.coding.bat.exercises;

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
	
}
