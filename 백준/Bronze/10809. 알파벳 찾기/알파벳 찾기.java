
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 알파벳에 대해서 단어에 포함되어있는 경우에는 
		// 처음 등장하는 위치 출력
		// 포함되어 있지 않은 경우 -1 출력
		// abcde쭉 검사
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine(); // 소문자로만 이루어진 단어S
		char[] str2 = str1.toCharArray();
		
		char[] alpabet = new char[26]; 		
		int[] arr = new int[26];
		
		for(int i=0; i<26; i++) {
			alpabet[i]=(char)(97+i);
			arr[i]=-1;
		}

		for(int i=0; i<str2.length; i++) {
			for(int j=0; j<alpabet.length; j++) {
								
				// 처음위치 출력하기 위해 배열의 값이 -1일때만 대입
				if(str2[i]==alpabet[j]) {
					if(arr[j]==-1) {
						arr[j]=i;
						break;		
					}
				}
			}
		}

		//출력
		for(int i=0;i<26; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
