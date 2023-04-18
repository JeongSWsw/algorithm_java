package ex08_set_map;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BJ10815{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		Set<Integer> set = new HashSet<>();
		for(int i =0; i < N; i++) {
			set.add(sc.nextInt());
		}
		int M = sc.nextInt();
		for(int j = 0; j<M; j++) {
			if(set.contains(new Integer(sc.next()))) {
				sb.append("1").append(" ");
			}
			else
				sb.append("0").append(" ");
		}
		sb.delete(sb.length()-1,sb.length());
		System.out.println(sb);
	}
}
