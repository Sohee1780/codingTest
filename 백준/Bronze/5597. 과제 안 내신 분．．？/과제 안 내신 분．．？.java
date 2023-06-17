import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		// 첫째 줄 에 알파벳대문자로 이루어진 단어가 주어짐
		int[] iArr = new int[30];
		
		// 입력
		for(int i=0; i<28; i++) {
			int n = s.nextInt();
			iArr[n-1]=1;
		}
		
		// 출력
		for(int i=0; i<30; i++) {
			if(iArr[i]==0) {
				System.out.println(i+1);
			}
		}
	}
}