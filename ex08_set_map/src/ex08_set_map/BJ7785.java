package ex08_set_map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class BJ7785 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		TreeSet<String> s = new TreeSet<>();
		int num = Integer.parseInt(br.readLine());
		for(int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str1 = st.nextToken();
			String str2 = st.nextToken();
			switch(str2) {
			case "enter":
				s.add(str1);
				break;
			case "leave":
				s.remove(str1);
				break;
			}
		}
		for(String name : s.descendingSet()) {
			System.out.println(name);
		}
	}
}
