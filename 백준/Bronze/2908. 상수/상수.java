import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		// 입력
		String str = s.nextLine();
		StringBuilder sb = new StringBuilder();
		StringTokenizer stb = new StringTokenizer(str);
		
		String[] sArr = new String[2];
		
		// 토큰이 있는동안 실행
		int i=0;
		while(stb.hasMoreTokens()) {
			sArr[i]=String.valueOf(sb.append(stb.nextToken()).reverse());
			sb.delete(0, 4);
			i++;
		}
		
		int a = Integer.parseInt(sArr[0]);
		int b = Integer.parseInt(sArr[1]);
		
		if(a>b) System.out.println(a);
		else System.out.println(b);

	}
}