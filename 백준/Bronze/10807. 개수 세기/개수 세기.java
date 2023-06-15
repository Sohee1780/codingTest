import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		int v = scan.nextInt();
		int total = 0;
		for(int i=0; i<n;i++) {
			if(arr[i]==v) total++;
		}
		System.out.println(total);
		
		scan.close();
	}
}