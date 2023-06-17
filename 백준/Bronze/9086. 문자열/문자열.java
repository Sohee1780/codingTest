import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt(); // 테스트케이스
		String[] str = new String[t];
		
		for(int i=0; i<t; i++) {
			str[i] = scan.next();			
		}
		for(int i=0; i<t; i++) {
			System.out.println(str[i].substring(0, 1)+str[i].substring(str[i].length()-1));						
		}
	}

}