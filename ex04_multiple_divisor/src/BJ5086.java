import java.util.Scanner;

public class BJ5086 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			int x = new Scanner(System.in).nextInt();
			int y = new Scanner(System.in).nextInt();
			System.out.println(x + " " + y);
			if (x == 0 && y == 0)
				break;

			if (y % x == 0) {
				System.out.println("factor");
			} else if (x % y == 0) {
				System.out.println("multiple");
			} else {
				System.out.println("neither");
			}
		}
	}
}
