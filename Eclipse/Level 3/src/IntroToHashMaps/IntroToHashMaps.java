package IntroToHashMaps;

import java.util.HashMap;

public class IntroToHashMaps {

	public static void main(String[] args) {
		new IntroToHashMaps();
	}

	IntroToHashMaps() {
		HashMap<String, Integer> hashBrown = new HashMap<String, Integer>();
		hashBrown.put("Bob", 69);
		hashBrown.put("Bob", 420);
		System.out.println(hashBrown.get("Bob"));
	}

}