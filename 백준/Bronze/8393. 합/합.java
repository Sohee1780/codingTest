import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int sum=0;
		int i=0;
		do{
			i++;
			sum+=i;
		}while(i<n);
		System.out.println(sum);
	}
}