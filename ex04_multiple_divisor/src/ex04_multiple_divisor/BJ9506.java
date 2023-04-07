package ex04_multiple_divisor;

import java.util.Scanner;

public class BJ9506 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			sb.setLength(0);
			int num = sc.nextInt();
			int[] divisor = new int[num + 1];
			if (num == -1) {
				break;
			}
			for (int i = 1; i <= num; i++) {
				if (isDivisor(num, i)) {
					divisor[i] = i;
				}
			}

			if (isComplete(divisor, num)) {
				sb.append(num+" = ");
				for (int j = 1; j < divisor.length; j++) {
					if (divisor[j] == num) {
						sb.delete(sb.length()-3, sb.length());
						System.out.println(sb);
						break;
					}
					if (divisor[j] == 0)
						continue;
					sb.append(divisor[j]+" + ");
					
				}
			} else
				System.out.println(num + " is NOT perfect.");
		}//while end
	}

	public static boolean isDivisor(int x, int y) {
		boolean flag = false;
		if (x % y == 0) {
			flag = true;
		}
		return flag;
	}

	public static boolean isComplete(int[] arr, int num) {
		boolean flag = false;
		int sum = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			sum += arr[i];
		}
		if (sum == num) {
			flag = true;
		}
		return flag;
	}
}
