import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class BJ10773 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Vector<Integer> arr = new Vector<>();
		int num = Integer.parseInt(br.readLine());
		int sum = 0;
		for (int i = 0; i < num; i++) {
			int x = Integer.parseInt(br.readLine());
			if (x == 0) {
				arr.remove(arr.size()-1);
			}
			else {
				arr.add(x);
			}
		}
		for (int i = 0; i < arr.size(); i++) {
				sum += arr.get(i);
		}
		System.out.println(sum);
	}
}
