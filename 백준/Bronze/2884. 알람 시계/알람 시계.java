import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int h = scan.nextInt();
		int m = scan.nextInt();
	
		if(m>=45) {
			System.out.printf("%d %d",h, m-45);
		} else {
			if(h==0) {
				System.out.printf("%d %d",h+24-1, (m+60)-45);
			} else System.out.printf("%d %d",h-1, (m+60)-45);
		}
		System.out.println();
	} 
}