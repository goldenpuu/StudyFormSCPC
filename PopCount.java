// 주어진 수를 이진수로 표현 했을 때 1의 갯수는?
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PopCount {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int test, answer;
		int pop;
		
		test = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= test; i++) {
			pop=Integer.parseInt(br.readLine());
			answer = 0;
			
			while(pop != 0) {
				if(pop % 2 != 0) {
					answer++;
					pop = pop>>1;
				}else {pop = pop>>1;}
			}
			
			sb.append("Case #"+i+"\n"+answer+"\n");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
