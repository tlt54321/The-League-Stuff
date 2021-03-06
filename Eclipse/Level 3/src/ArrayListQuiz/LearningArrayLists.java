package ArrayListQuiz;

import java.util.ArrayList;

public class LearningArrayLists {

	public static ArrayList createArrayList() {
		ArrayList testList = new ArrayList();
		testList.add("Hello");
		return testList;
	}

	public static ArrayList addToArrayList(ArrayList arrayList, Object e) {
		arrayList.add(e);
		return arrayList;
	}

	public static int getNumberOfItems(ArrayList arrayList) {
		int x = arrayList.size();
		return x;
	}

	public static Object getItem(ArrayList arrayList, int position) {
		Object e = arrayList.get(position);
		return e;
	}

	public static String iterateOver(ArrayList<String> arrayList) {
		String full = "";
		for (String s : arrayList) {
			full += s;
		}
		return full;
	}

	public static int findItemOnList(ArrayList<String> arrayList,
			String string) {
		int counter = 0;
		for (String s : arrayList) {
			if (s.equals(string)) {
				return counter;
			} else {
				counter++;
			}
		}
		return counter;
	}

	public static ArrayList<String> replaceItem(ArrayList arrayList,
			int position, String string) {
		arrayList.remove(position);
		arrayList.add(position, string);
		return arrayList;
	}

	public static ArrayList<String> insertItem(ArrayList arrayList,
			int position, String string) {
		arrayList.add(position, string);
		return arrayList;
	}

	public static ArrayList<Integer> createTypedArrayList() {
		ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
		return integerArrayList;
	}

	public static int addAllInteger(ArrayList<Integer> arrayList) {
		int total = 0;
		for (Integer i : arrayList) {
			total += i;
		}
		return total;
	}

	public static ArrayList<String> createStringTypedArrayList() {
		ArrayList<String> stringArrayList = new ArrayList<String>();
		return stringArrayList;
	}

	public static String addAllString(ArrayList<String> arrayList) {
		String total = "";
		for (String s : arrayList) {
			total += s;
		}
		return total;
	}
}
