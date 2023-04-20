package ex08_set_map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BJ14425 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int cnt = 0;
		Set<String> s = new HashSet<>();
		for(int i =0; i < n; i++) {
			s.add(br.readLine());
		}
		for(int j =0; j < m; j++) {
			if(s.contains(br.readLine())) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
