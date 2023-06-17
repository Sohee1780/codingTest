
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int  t = s.nextInt();// 테스트 케이스 t
		int[] r = new int[t];// 반복횟수 r
		String[] str = new String[t];// 문자열 str
		
		// 테스트 케이스 입력
		for(int i=0;i<t;i++) {
			r[i] = s.nextInt();
			str[i] = s.next();
		}
		
		for(int i=0;i<t;i++) {
			for(int j=0; j<str[i].length(); j++) {
				System.out.print(String.valueOf(str[i].charAt(j)).repeat(r[i])); 
			}
			System.out.println();
		}
	}
}
