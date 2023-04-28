import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ11866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		int size = Integer.parseInt(st.nextToken());
		int num = Integer.parseInt(st.nextToken());
		
		Queue<Integer> queue = new LinkedList<>();
		for(int i =1; i <= size; i++) {
			queue.add(i);
		}
		int k = 1;
		while(queue.size()>0) {
			if(k%num == 0){
			sb.append(queue.poll()+", ");
			}
			else {
				queue.add(queue.poll());				
			}
			k++;
		}
		sb.delete(sb.length()-2, sb.length());
		sb.append(">");
		System.out.println(sb);
		
	}
}
