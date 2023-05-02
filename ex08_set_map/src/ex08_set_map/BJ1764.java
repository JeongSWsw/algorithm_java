package ex08_set_map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class BJ1764 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		Set<String> set = new HashSet<>();
		Set<String> answer = new TreeSet<>();
		int cnt = 0;
		for(int i =0; i < a; i++) {
			set.add(br.readLine());
		}
		for(int i = 0; i < b; i++) {
			String str = br.readLine();
			if(set.contains(str)) {
				cnt++;
				answer.add(str);
			}
		}
		System.out.println(cnt);
		for(String item: answer) {
			System.out.println(item);
		}
	}
}
