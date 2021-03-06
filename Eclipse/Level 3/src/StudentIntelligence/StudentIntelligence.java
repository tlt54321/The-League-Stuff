package StudentIntelligence;

import java.util.ArrayList;
import java.util.Random;

public class StudentIntelligence {
	public static void main(String args[]) {
		new Classroom(30);
	}
}

class Student {
	private int intelligence;
	private String name;

	Student(int intelligence, String name) {
		this.intelligence = intelligence;
		this.name = name;
	}

	public int getIntelligence() {
		return intelligence;
	}
	public String getName() {
		return name;
	}
}

class Classroom {
	private int size;
	private String[] names = {"Tommy", "Tyler", "Bob", "Joe", "Sam", "Dave",
			"Alberto"};

	Classroom(int size) {
		this.size = size;
		ArrayList<Student> classRm = new ArrayList();
		for (int i = 0; i < size; i++) {
			int randNum = new Random().nextInt(10) + 1;
			int randName = new Random().nextInt(names.length - 1);
			classRm.add(new Student(randNum, names[randName]));
		}

		int totalIQ = 0;
		for (Student s : classRm) {
			totalIQ += s.getIntelligence();
		}

		float averageIQ = totalIQ / (float) size;
		System.out.print(averageIQ);
	}

	public int getSize() {
		return size;
	}
}