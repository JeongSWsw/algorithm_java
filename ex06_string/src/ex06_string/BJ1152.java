package ex06_string;

import java.util.Scanner;

public class BJ1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine().trim();
		line = line.trim();
		String[] arr = line.split(" ");

		if (arr.length == 1 && arr[0].equals("")) {
			System.out.println(0);
		} else {
			System.out.println(arr.length);
		}
	}
}
