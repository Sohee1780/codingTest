import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // 수열 A를 이루는 정수 n개
		int x = scan.nextInt(); // x보다 작은 수 
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int i=0; i<n;i++) {
			if(arr[i]<x) {
				System.out.printf("%d ",arr[i]);
			}
		}
		scan.close();
	}
}