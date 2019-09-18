package snail;

public class Snail {
	
	// 달팽이 배열
	public static void main(String[] args) {
		
		draw(4);
		draw(5);

	}

	public static void draw(int size) {
		int input = size;
		int cnt = 1;
		int row = 0, col = -1, direction = 1;
		int[][] snailArray = new int[size][size];

		for (int i = input; i >= 0; i--) {
			for (int j = 0; j < input; j++) {
				col += direction;
				snailArray[row][col] = cnt;
				cnt++;
			}
			input--;

			for (int j = 0; j < input; j++) {
				row += direction;
				snailArray[row][col] = cnt;
				cnt++;
			}
			direction = direction * (-1);
		}

		for (int m = 0; m < size; m++) {
			for (int n = 0; n < size; n++) {
				System.out.print(snailArray[m][n] + "\t");
			}
			System.out.println("");
		}
		System.out.println("");

	}

}
