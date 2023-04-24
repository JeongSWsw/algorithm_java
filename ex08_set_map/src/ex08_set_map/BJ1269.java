package ex08_set_map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BJ1269 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int numA = Integer.parseInt(st.nextToken());
		int numB = Integer.parseInt(st.nextToken());
		
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		st = new StringTokenizer(br.readLine());
		for(int i =0; i<numA; i++) {
			a.add(Integer.parseInt(st.nextToken()));
		}
		st = new StringTokenizer(br.readLine());
		for(int i =0; i<numB; i++) {
			b.add(Integer.parseInt(st.nextToken()));
		}
		int cntAmiB = 0;
		Set<Integer> aMiB = new HashSet<>();
		Set<Integer> bMiA = new HashSet<>();
		for(int num : b) {
			if(!a.contains(num)) {
				bMiA.add(num);
			}
		}
		for(int num : a) {
			if(!b.contains(num)) {
				aMiB.add(num);
			}
		}
		System.out.println(aMiB.size()+bMiA.size());
		
	}
}
