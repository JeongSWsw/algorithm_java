import java.util.Scanner;

public class BJ10810 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int basket = sc.nextInt();
		int num = sc.nextInt();
		int[] arr = new int[basket];
		for(int i = 0; i < num; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			int ballNum = sc.nextInt();
			for(int j = start-1; j <= end-1; j++){
				arr[j] = ballNum;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
