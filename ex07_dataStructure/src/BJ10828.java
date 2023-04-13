import java.util.Scanner;
import java.util.Vector;

public class BJ10828 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Vector v = new Vector<>();
		String str = "";
		for (int i = 0; i < num; i++) {
			str = sc.next();
			switch (str) {
			case "push": {
				int x = sc.nextInt();
				v.add(x);
				break;
			}
			case "top": {
				if (v.isEmpty())
					System.out.println(-1);
				else
					System.out.println(v.lastElement());
				break;
			}
			case "size": {
				System.out.println(v.size());
				break;
			}
			case "empty": {
				if (v.isEmpty())
					System.out.println(1);
				else
					System.out.println(0);
				break;
			}
			case "pop": {
				if (v.isEmpty())
					System.out.println(-1);
				else {
					System.out.println(v.lastElement());
					v.removeElementAt(v.size()-1);
				}
				break;
			}
			default :{
				str = "";
				break;
			}
			

			}
		}
	}
}
