package SearchingAndSortingAlgorithms;

import java.util.Collections;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			String crack = eggs.get(i);
			if (crack.equals("cracked")) {
				return i;
			}
		}
		return 0;
	}

	public static int countPearls(List<Boolean> oysters) {
		for (int i = 0; i < oysters.size(); i++) {
			Boolean pearl = oysters.get(i);
			if (pearl.equals(true)) {
				return i;
			}
		}
		return 0;
	}

	public static Double findTallest(List<Double> peeps) {
		Double big = peeps.get(0);
		for (int i = 1; i < peeps.size(); i++) {
			if (big < peeps.get(i)) {
				big = peeps.get(i);
			}
		}
		return big;
	}

	public static String findLongestWord(List<String> words) {
		String big = words.get(0);
		for (int i = 1; i < words.size(); i++) {
			if (big.length() < words.get(i).length()) {
				big = words.get(i);
			}
		}
		return big;
	}

	public static Boolean containsSOS(List<String> morse) {
		if (morse.contains(" ... --- ... ")) {
			return true;
		}
		else{
			return false;	
		}
	}

	public static List<Double> sortScores(List<Double> results) {
		Collections.sort(results);
		return results;
	}

	public static List<String> sortDNA(List<String> unsortedSequences){
		return unsortedSequences;
		
	}
	
	public static List<String> sortWords(List<String> words){
		Collections.sort(words);
		return words;
	}
	// Add other methods here
}