import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ10870 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int result = fibonacci(num);
		System.out.println(result);
	}

	private static int fibonacci(int num) {
		if(num==0) return 0;
		else if(num==1) return 1;
		else return fibonacci(num-1)+fibonacci(num-2);
		
	}
}
