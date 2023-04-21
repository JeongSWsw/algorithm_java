

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ9012 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Stack<Character> s = new Stack<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < num; i++) {
			String str = br.readLine();
			boolean isFinished = false;
			for(int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				if(ch=='(') {
					s.push(ch);
				}
				else if(s.isEmpty() && ch==')' ) {
					sb.append("NO").append("\n");
					isFinished = true;
					break;
				}
				else if(ch==')'){
					s.pop();
				}
			} //inner for
			if(s.isEmpty() && isFinished==false){
				sb.append("YES").append("\n");
			}
			else if(isFinished==false) {
				sb.append("NO").append("\n");
			}
			
			s.clear();
		} // outer for
		System.out.println(sb);
	}
}
