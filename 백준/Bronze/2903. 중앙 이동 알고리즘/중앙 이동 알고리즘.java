import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);	
		int n = s.nextInt();
		// 저장해야하는 점의 개수 -> 제곱수
		// 한선에 점의 개수의 제곱
		// 2제곱 4 3제곱 9 5 제곱 25
		int[] cnt = new int[15];
		int jum=3;
		for(int i=0; i<cnt.length; i++) {
			cnt[i] = jum * jum;
			jum = jum+(jum-1);
		}
		
		System.out.println(cnt[n-1]);

	}
}