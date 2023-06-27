import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);	
		int t = s.nextInt();
		
		String[] str = new String[t];
		
		for(int i=0; i<t; i++) {
			int c = s.nextInt();
			
			int q = c/25; // 쿼터
			c = (c%25);
			int d = c/10; // 다임
			c = (c%10);
			int n = c/5; // 니켈
			int p = c%5; // 페니
			str[i] = String.format("%d %d %d %d", q,d,n,p);
		}
		
		for(String ss : str) {
			System.out.println(ss);
		}
	}
}