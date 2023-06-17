import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		// 영어와 공백으로 이루어진 문자열
		String str = s.nextLine();
		
		// 테스트 케이스 중 공백만 입려되는 경우가 존재함
		int count = 0;
		
		if(!" ".equals(str)) {
			count = str.trim().split(" ").length;
		}
		
		System.out.println(count);
	}
}