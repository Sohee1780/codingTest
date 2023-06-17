
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	
		
		// 문자열 단계에 들어있는 문제라서 문자열로
		// n의 입력은 필요없지만 문제가 입력받아야해서 씀
		int n = s.nextInt();
		s.nextLine();// 엔터제거
		String str = s.nextLine();

		int sum=0;
		for(int i=0; i<n; i++) {
			sum+=Integer.parseInt(str.substring(i,i+1)); 
		}
		
		System.out.println(sum);
	}

}