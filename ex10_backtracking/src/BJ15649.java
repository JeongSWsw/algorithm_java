import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ15649 {
	public static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
//		StringBuilder sb = new StringBuilder();
		final int N = Integer.parseInt(st.nextToken());
		final int M = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[M];
		boolean[] isVisited = new boolean[N];
		
		dfs(N, M, 0, arr, isVisited);
		System.out.println(sb);
	}

	private static void dfs(int N, int M, int depth, int[] arr, boolean[] isVisited) {
		
		if (depth == M) {
			for(int item : arr) {
				sb.append(item).append(' ');
			}
			sb.append('\n');
			return;
		}
		for(int i = 0; i < N; i++) {
			if(!isVisited[i]) {
				isVisited[i]=true;
				arr[depth] = i + 1;
				dfs(N, M, depth + 1, arr, isVisited);
				isVisited[i] = false;
			}
		}
	}
}
