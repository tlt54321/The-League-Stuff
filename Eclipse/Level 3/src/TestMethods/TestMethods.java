package TestMethods;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

public class TestMethods {

	@Test
	public void test1() {
		String s = "my dog has fleas";
		String[] s2 = {"my", "dog", "has", "fleas"};
		assertArrayEquals(s2, createWordList(s));
	}

	@Test
	public void test2() {
		String s = "my dog has fleas";
		String[] s2 = {"dog", "fleas", "has", "my"};
		assertArrayEquals(s2, createSortedWordList(s));
	}

	public String[] createWordList(String s) {
		ArrayList<String> list = new ArrayList<String>();
		String word = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				list.add(word);
				word = "";
			} else if (i == s.length() - 1) {
				word += s.charAt(i);
				list.add(word);
				word = "";
			} else {
				word += s.charAt(i);
			}
		}
		String[] returnString = new String[list.size()];
		returnString = list.toArray(returnString);
		return returnString;
	}

	public String[] createSortedWordList(String s) {
		ArrayList<String> list = new ArrayList<String>();
		String word = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				list.add(word);
				word = "";
			} else if (i == s.length() - 1) {
				word += s.charAt(i);
				list.add(word);
				word = "";
			} else {
				word += s.charAt(i);
			}
		}
		Collections.sort(list);
		String[] returnString = new String[list.size()];
		returnString = list.toArray(returnString);
		return returnString;
	}

}
