import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BJ2164 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		LinkedList<Integer> q = new LinkedList<>();
		for(int i = 1; i <= num; i++) {
			q.add(i);
		}
		int i =0 ;
		while(q.size()>1) {
			if(i%2==0) {
				q.removeFirst();
			}
			else {
				q.add(q.get(0));
				q.removeFirst();
			}
			i++;
		}
		System.out.println(q.get(0));
	}
}
