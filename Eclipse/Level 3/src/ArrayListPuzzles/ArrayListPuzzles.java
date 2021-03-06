package ArrayListPuzzles;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

public class ArrayListPuzzles {

	public static void main(String[] args) {
		comedy();
	}

	public static void food() {
		ArrayList<String> food = new ArrayList();
		food.add("pie");
		food.add("pizza");
		food.add("pasta");
		food.add("fish");

		Random rand = new Random();
		System.out.println("You will eat " + food.get(rand.nextInt(food.size()))
				+ " for dinner.");
	}

	public static void comedy() {
		ArrayList<String> joke = new ArrayList();
		joke.add("Why did the chicken cross the road?");
		ArrayList<String> punch = new ArrayList();
		punch.add("To get to the other side.");

		int rand = new Random().nextInt(joke.size());
		System.out.println(joke.get(rand));

		new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar() == KeyEvent.VK_SPACE) {
					System.out.println(punch.get(rand));
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

		};

	}

}
