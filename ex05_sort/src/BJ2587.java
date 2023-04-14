import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ2587 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int num = 5;
		int[] arr = new int[num];
		int sum = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		
		for(int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println(sum/5);
		System.out.println(arr[2]);
		
	}
}
