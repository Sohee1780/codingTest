
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		
		// 바구니 n개 각각의 바구니는 1~n까지 번호가 순서대로 적혀있다
		// M번 바구의 순서를 역순으로 만들려고함
		// 한 번 바꿀때 범위를 정하고 그 범위에 들어있는 바구니의 순서를 역순으로 만듬
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			StringBuilder sb = new StringBuilder();
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken()); // 바구니 수 n
			int m = Integer.parseInt(st.nextToken()); // 바꿀 횟수 m
			
			// 바구니 생성
			int[] nArr= new int[n];
			for(int i=0; i<n; i++) {
				nArr[i]=i+1;
			}
			
			// m번 뒤집기
			int s = 0; // start : s
			int e = 0; // end : e
			for(int i=0; i<m; i++) {
				st = new StringTokenizer(br.readLine());
				s = Integer.parseInt(st.nextToken());
				e = Integer.parseInt(st.nextToken());
				
				int temp=0;
				int ee=e-1;
				int ss=s-1;
				
				for(int k=0; k<(int)Math.ceil((e-s)/2.0); k++) {
					temp = nArr[ee];
					nArr[ee] = nArr[ss];
					nArr[ss] = temp;
					ss+=1;
					ee-=1;
				}
			}
			// 출력
			for(int a:nArr) {
				sb.append(a+" ");
			}
			System.out.println(sb);	
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}