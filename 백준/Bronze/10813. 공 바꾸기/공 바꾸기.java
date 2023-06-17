import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		// 바구니 개수 n 바구니에는 1~n번까지 번호가 매겨져 있음
		// 처음에는 바구니 번호와 같은 공이 들어있음
		// 공을 바꿀 횟수 m
		// 바꿀 바구니 2개를  선택하고 두 바구니에 들어있는 공을 서로 교환
		
		int n = s.nextInt(); // 바구니 개수
		int m = s.nextInt(); // 공을 바꿀 횟수
		int[] nArr = new int[n]; // 바구니
		StringBuilder sb = new StringBuilder();
		
		// 공넣기
		for(int k=0; k<n; k++) {
			nArr[k]=k+1;
		}
		
		int i=0;
		int j=0;
		int temp=0;
		
		for(int k=0; k<m; k++) {
			i = s.nextInt()-1;
			j = s.nextInt()-1;
			// 공 바꾸기
			temp = nArr[i];
			nArr[i]=nArr[j];
			nArr[j]=temp;	
		}
		
		for(int a : nArr) sb.append(a+" ");
		System.out.println(sb.toString());
	}
}
