import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int k = n/4;
		String l = "long ";
		String i = "int";		
		
		System.out.println(l.repeat(k)+i);
	}
}