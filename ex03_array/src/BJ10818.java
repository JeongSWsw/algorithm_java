import java.util.Scanner;

public class BJ10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		int min = arr[0];
		for(int j = 1; j < num; j++) {
			if(max < arr[j]) {
				max = arr[j];
			}
			if(min > arr[j]) {
				min = arr[j];
			}
		}
		System.out.println(min+" "+max);
	}
}
