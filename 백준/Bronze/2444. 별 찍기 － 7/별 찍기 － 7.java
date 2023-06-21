import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int e = n-1;
		int odd = 1;

		// 삼각형
		for(int i=0; i<n; i++) {
			System.out.println(" ".repeat(e--)+"*".repeat(odd));
			odd= odd+2;				
		}
		// 2n-1 : n=3 5
		// 역삼각형
		odd = 2*n-3;
		for(int i=0; i<n-1; i++) {
			System.out.println(" ".repeat(i+1)+"*".repeat(odd));
			odd-=2;
		}
	}
}