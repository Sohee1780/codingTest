import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		// 바구니 개수 n 바구니에는 1~n번까지 번호가 매겨져 있음
		// 1~n까지 번호가 적혀있는 공을 매우 많이 가지고있음
		// 바구니에는 공 1개만
		// 공을 넣을 횟수 m
		// 한번 넣을때 바구니 범위를 정하고 같은 범위의 바구니에는 같은 번호의 공을 넣음
		// 공이 이미 있는 경우에 공을 빼고 다시 넣음
		// 공을 넣을 바구니는 연속된 바구니
		
		int n = s.nextInt(); // 바구니 개수
		int m = s.nextInt(); // 공을 넣을 횟수
		int[] nArr = new int[n]; // 바구니
		StringBuilder sb = new StringBuilder();
		
		// 공넣기
		for(int r=0; r<m; r++) {
			// ex) 1 2 3 1번 바구니부터 2번바구니까지 3번 공을 넣는다
			int i = s.nextInt(); // start
			int j = s.nextInt(); // end
			int k = s.nextInt(); // 공 번호
			
			// 공 넣기
			for(int z=i-1;z<j; z++) {
				nArr[z]=k;
			}
		}
		
		for(int a=0;a<n;a++) {
			sb.append(nArr[a]+" ");
		}
		System.out.println(sb.toString());
	}
}