package ex04_multiple_divisor;

import java.util.Scanner;

public class BJ11653 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num==1) System.exit(0);
		for(int i = 2 ; i <= num; i++) {
			while(num % i==0) {
				System.out.println(i);
				num /= i;
			}
		}
	}
}
