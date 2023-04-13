
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Vector;

public class BJ10828 {
	public static void main(String[] args) throws Exception {
//      Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

		int num = Integer.parseInt(br.readLine());
		Vector v = new Vector<>();
//		String str[];
		StringTokenizer str;
		for (int i = 0; i < num; i++) {
//			if(i == num -1) {
//				sc.nextLine();
//			}
//			System.out.println("num:"+i);
			str = new StringTokenizer(br.readLine());
			// str = sc.nextLine().split(" ");
			switch (str.nextToken()) {
			case "push": {
				int x = Integer.parseInt(str.nextToken());
				v.add(x);
				break;
			}
			case "top": {
				if (v.isEmpty())
//					System.out.println(-1);
					sb.append("-1").append("\n");
				else
//					System.out.println(v.lastElement());
					sb.append(v.lastElement()).append("\n");
					break;
			}
			case "size": {
//				System.out.println(v.size());
				sb.append(v.size()).append("\n");
				break;
			}
			case "empty": {
				if (v.isEmpty())
//					System.out.println(1);
					sb.append("1").append("\n");
				else
//					System.out.println(0);
					sb.append("0").append("\n");
				break;
			}
			case "pop": {
				if (v.isEmpty())
//					System.out.println(-1);
					sb.append("-1").append("\n");
				else {
//					System.out.println(v.lastElement());
					sb.append(v.lastElement()).append("\n");
					v.removeElementAt(v.size() - 1);
				}
				break;
			}
			}// swich end
				// sc.nextLine();
		} // for end
		System.out.println(sb);
	}
}