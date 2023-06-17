import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// 두 자연수 A, B A%B = 7%3 = 1
		// 수 10개를 입력받고 42로 나눈 나머지를 구한다음 서로 다른 값이 몇개 있는지 출력
		// 나머지 구해서 다르면 +1 같으면 +0 
		int[] nArr = new int[10];
		
		// 배열에 나머지 넣을때 중복을 제거해서 넣으면
		for(int i=0; i<10; i++) {
			nArr[i]=s.nextInt()%42; // 값을 넣고
			
			// i=0일때 안돌아 i=1일때 1번, i=2일때 2번
			for(int j=0; j<i; j++) {
				// 1 2 1을 입력한다고 가정
				// i=0일때 nArr[0]=1
				
				// i=1일때 nArr[1]=2
				// i=1일때 nArr[1]==nArr[j]
				// nArr[1]==nArr[0] -> 2==1
				
				// i=2일때 nArr[2]=1
				// i=2일때 nArr[2]==nArr[j]
				// nArr[2]==nArr[0] -> 1==1 true
				// nArr[2]=-1
				if(nArr[i]==nArr[j]) {
					nArr[i]=-1; // 중복이면 -1 입력
					break;
				}
			}
		}
		
		int count=0;
		for(int a : nArr) {
			if(a!=-1) {
				count+=1;
			}
		}
		
		System.out.println(count);
	}
}