import java.util.Scanner;

public class BJ1934 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
		}
	}

	public static int 최소공배수(int a, int b) {
		int result = 0;
		int MAX = 0;
		int max = a < b ? b : a;
		int[] arr = new int[MAX];
		int j = 0;
		for (int i = 2; i < max; i++) {
			while (a % i == 0 && b % i == 0) {
				arr[j] = i;
				j++;
			}
		}
		return result;
	}
}
