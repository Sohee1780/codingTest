import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String[] str = new String[n];
		int count = str.length;
		
		// 입력
		for(int i=0; i<n; i++) {
			str[i] = s.next();
		}
		
		
		for(int i=0; i<n; i++) {
			String test = "";
			char[] cArr = str[i].toCharArray();
			test+=cArr[0];
			
			for(int j=0; j<cArr.length-1;j++) {
				if(cArr[j]!=cArr[j+1]) {
					test+=cArr[j+1];
				}
			}
			char[] cArr2 = test.toCharArray();
			
			out:
			for(int j=0; j<cArr2.length-1;j++) {
				
				for(int k=j+1; k<cArr2.length; k++) {
					if(cArr2[j]==cArr2[k]) {
						count-=1;
						break out;
					}
				}
			}
		}
		
		// 그룹단어 개수
		System.out.println(count);
	}
}