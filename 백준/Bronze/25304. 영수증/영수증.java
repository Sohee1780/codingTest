import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt(); // 영수증에 적힌 총 금액
		int n = scan.nextInt(); // 구매한 물건의 종류의 수
		int sum = 0;
		for(int i=1;i<=n;i++) {
			// 각 물건의 가격 a와 개수 b가 공백을 사이에 두고 입력
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			sum+=a*b;
		}
		
		// 영수증 금액과 총 금액이 같으면 Yes 아니면 No
		if(x==sum) {
			System.out.println("Yes");
		}else System.out.println("No");
	}
}