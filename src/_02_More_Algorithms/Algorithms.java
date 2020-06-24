package _02_More_Algorithms;

import java.util.Arrays;
import java.util.List;

import _00_Sorting_Algorithms._00_SortedArrayChecker;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return -1;
	}
	
	public static int countPearls(List<Boolean> oysters) {
		int counter = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				counter++;
			}
		}
		return counter;
	}
	
	public static Double findTallest(List<Double> people) {
		Double tallest = 0.0;
		for (int i = 0; i < people.size(); i++) {
			if (people.get(i) > tallest) {
				tallest = people.get(i);
			}
		}
		return tallest;
	}
	
	public static String findLongestWord(List<String> words) {
		String longest = "";
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > longest.length()) {
				longest = words.get(i);
			}
		}
		return longest;
	}
	
	public static Boolean containsSOS(List<String> message) {
		for (int i = 0; i < message.size(); i++) {
			if (message.get(i).equals("... --- ...")) {
				return true;
			}
		}
		return false;
	}
	
	public static List<Double> sortScores(List<Double> scores){
		Double placeHolder = 0.0;
		boolean sorted = false;
		while (sorted == false) {
			sorted = true;
			for (int i = 0; i < scores.size() - 1; i++) {
				if (scores.get(i) > scores.get(i + 1)) {
					placeHolder = scores.get(i);
					scores.set(i, scores.get(i + 1));
					scores.set(i + 1, placeHolder);
					sorted = false;
				}
			}
		}
		return scores;
	}
}