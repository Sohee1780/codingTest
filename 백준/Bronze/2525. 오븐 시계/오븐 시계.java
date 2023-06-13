import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int h = scan.nextInt();
		int m = scan.nextInt();
		int r = scan.nextInt();
		
		int mr = (m+r)/60;
		
		h+=mr; // 시간
		m=(m+r)-60*(mr); // 분
		
		if(h>=24) {
			h-=24;
		}
		
		System.out.printf("%d %d", h,m);
	} 
}