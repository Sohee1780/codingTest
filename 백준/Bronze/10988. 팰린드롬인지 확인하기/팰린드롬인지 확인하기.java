import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		// 펠린드롬 확인하기
		String str = s.nextLine();
		int e=str.length();
		int res=1;
		// 체크
		for(int i=0; i<str.length()/2; i++) {
			if(str.substring(i,i+1).equalsIgnoreCase(str.substring(e-1,e))) {
				res = 1;
				e-=1;
			}else {
				res = 0;
				break;
			}	
		}
		System.out.println(res);
	}
}