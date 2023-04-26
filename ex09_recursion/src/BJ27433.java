import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ27433 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		Long result = factorial(num);
		System.out.println(result);
	}

	private static Long factorial(int num) {
		if(num <= 1) return 1L;
		else return (num * factorial(num-1));
	}
	
}
