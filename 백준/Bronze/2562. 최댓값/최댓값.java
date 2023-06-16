import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
		int n = 9;
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		
		//최댓값
		int max = arr[0];
		for(int i=1; i<n; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
	
		// 몇 번째 수
		for(int i=0;i<n;i++) {
			if(max==arr[i]) {				
				System.out.println(max);
                System.out.println(i+1);
			}
		}
	}
}