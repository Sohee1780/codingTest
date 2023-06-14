import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] sum = new int[n];
		
		for(int i=0; i<n; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			sum[i] = a+b;
		}
		
		for(int i : sum) {
			System.out.println(i);
		}
	}
}