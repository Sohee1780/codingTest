import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int i = scan.nextInt();
		System.out.println(s.substring(i-1,i));
	}

}
