package SearchingAndSortingAlgorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for(int i = 0; i < eggs.size(); i++){
			String crack = eggs.get(i);
			if(crack.equals("cracked")) {
				
				return i;
			}
		}
			
		
		return 0; //<- this needs changing
	}
	
	//Add other methods here
}