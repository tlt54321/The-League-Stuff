package IntroToArrays;

public class IntroToArrays {

	public static void main(String[] args) {
		threeDArray();
	}

	public static void basicArray() {
		int x[] = {7, 8, 9};

		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}

	public static void twoDArray() {
		int x[][] = new int[5][5];

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[0].length; j++) {
				System.out.print(x[i][j]);
			}
			System.out.println();
		}
	}

	public static void threeDArray() {
		int x[][][] = {{{2, 3, 4}, {4, 5, 8}, {3, 7, 9}},
				{{2, 3, 4}, {4, 5, 8}, {3, 7, 9}},
				{{2, 3, 4}, {4, 5, 8}, {3, 7, 9}}};
		System.out.println(x[0].length);
	}

}
