package slideDeckChallenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example04SortingCollections {

	public static void main(String[] args) {
		
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		
		List<String> list = Arrays.asList(suits);
		
		System.out.printf("Unsorted array of elements %s\n", list);
		
		Collections.sort(list);
		
		System.out.printf("Sorted array of elements %s\n", list);
		
		Collections.sort(list, Collections.reverseOrder());
		
		System.out.printf("Sorted array of elements in reverse order %s\n", list);
		
	}

}
