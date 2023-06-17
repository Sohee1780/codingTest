import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			StringBuilder sb = new StringBuilder();
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken()); // 시험 본 과목의 개수 N
			
			// 성적입력
			st = new StringTokenizer(br.readLine());
			double[] nArr = new double[n];
			int i=0;
			while(st.hasMoreTokens()) {
				nArr[i]=Double.parseDouble(st.nextToken());
				i++;
			}
			// 제일 높은점수
			double max=0;
			for(int l=0; l<n; l++) {
				if(max<nArr[l]) {
					max=nArr[l];			
				}
			}
			// 모든 점수를 점수/M*100으로 고치고 평균 구하기
			double total = 0;
			for(int l=0; l<n; l++) {
				total += nArr[l]/max*100.0;
			}
			// 평균
			System.out.println(total/n);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}