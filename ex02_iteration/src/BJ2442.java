import java.util.Scanner;

public class BJ2442 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int row = 1; row <= num; row++) {
			
			for(int i = 1; i <= num-row; i++) {
				System.out.print(" ");
			}
			for(int j = 1; j <=(2*row -1); j++) {
				System.out.print("*");
			}
//			for(int i = 1; i <= num-row; i++) {
//				System.out.print(" ");
//			}
			
			System.out.println();
		}
	}
}
