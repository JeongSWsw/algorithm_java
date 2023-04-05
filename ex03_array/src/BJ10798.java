import java.util.Scanner;

public class BJ10798 {
	public static void main(String[] args) {
		int MAX_row = 5;
		int MAX_col = 15;
		char[][] array = new char[MAX_row][MAX_col];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {
			String line = sc.nextLine();
			for (int j = 0; j < array[0].length; j++) {
				if (j < line.length()) {
					array[i][j] = line.charAt(j);
				}
			} // j end
		} // i end

		for (int i = 0; i < array[0].length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[j][i] != '\0')
					System.out.print(array[j][i]);
			}
		}
	}
}

