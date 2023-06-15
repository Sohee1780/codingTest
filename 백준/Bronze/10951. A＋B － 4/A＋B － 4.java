import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		// hasNextInt()는 입력값이 생기기 전까지 실행을 유보시키는 역할을 함
		// 입력한 값이 int형이 아닐경우 false int로 표현할 수 있는 형식의 숫자형인 경우 true 리턴
		// 이클립스에서는 ctrl+z가 파일의 끝을 말하는 eof(윈도우의 경우)
		// System.in은 사용자가 ctrl+z를 입력하면 키 입력이 종료되는것으로 인식 
		
		List<Integer> list = new ArrayList<>();
		
		while(scan.hasNextInt()) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			list.add(a+b);
		}
		
		for(int sum : list) {
			System.out.println(sum);
		}
	}
}