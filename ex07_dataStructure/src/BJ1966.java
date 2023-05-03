import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
class Document implements Comparable<Document>{
		private Integer docuNum;
		private Integer priority;
		
		public Document(Integer docuNum, Integer priority) {
			this.docuNum = docuNum;
			this.priority = priority;
		}

		public Integer getDocuNum() {
			return docuNum;
		}

		public Integer getPriority() {
			return priority;
		}

		@Override
		public int compareTo(Document o) {
			if(this.priority > o.priority) return 1;
			else if(this.priority < o.priority) return -1;
			else return 0;
		}

		
	}
public class BJ1966 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		Queue<Document> queue = new LinkedList<>();
		
		int num = Integer.parseInt(br.readLine());
		for(int i = 0; i < num; i++) {
			st = new StringTokenizer(br.readLine());
			int docuNum = Integer.parseInt(st.nextToken());
			int target = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine()); 
			for(int j = 0; j < docuNum; j++) {
				int priority = Integer.parseInt(st.nextToken());
				queue.add(new Document(j,priority));
			}
		
			int cnt = 0;
			while(queue.size()>0) {
				Document now = queue.peek();
				
//				Document max = Collections.max(queue, new Comparator<Document>() {
//					  @Override
//					  public int compare(Document o1, Document o2) {
//					    return (o1.getImportance() > o2.getImportance()) ? 1 : -1;
//					  }
//					});
				Document max = Collections.max(queue);
				if(max.getPriority()>now.getPriority()){
					queue.add(queue.poll());
				}
				else {
					cnt++;
					queue.poll();
					if(target==now.getDocuNum()) {
					sb.append(cnt).append('\n');
					}
				}
			}
			queue.clear();
		}
		System.out.println(sb);
	}
}
