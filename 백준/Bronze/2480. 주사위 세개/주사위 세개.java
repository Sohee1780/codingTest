import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int max=0;
		
		// 최대값
		if(a>=b) {
			max=a;
			if(max<=c) max=c;
		}else {
			max=b;
			if(max<=c) max=c;
		}
				
		if(a==b && b==c) {
			System.out.println(10000+(max*1000));
		}else if(a==b || a==c) {
			System.out.println(1000+(a*100));
		}else if(b==c) {
			System.out.println(1000+(c*100));
		}else {
			System.out.println(max*100);
		}
	}
}