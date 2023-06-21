import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		char[] cArr = new char[26];
		for(int i=0; i<26; i++) {
			cArr[i]=(char)(97+i);
		}
		
		int[] count = new int[26];
		
		String str = s.nextLine().toLowerCase();
		char[] cStr = str.toCharArray();
		
		for(int i=0; i<cStr.length; i++) {
			for(int j=0; j<26; j++) {
				if(cStr[i]==cArr[j]) {
					count[j]+=1;
				}
			}
		}
		
		int max=0;
		String t = "";
		
		for(int i=0; i<26; i++) {
			if(max<count[i]) {
				max = count[i];
				t=String.valueOf(cArr[i]).toUpperCase();
			}
		}

		int maxC=0;
		for(int i=0; i<26; i++) {
			if(max==count[i]) {
				maxC+=1;
			}
		}
		if(maxC>1) {
			t="?";
		}
		System.out.println(t);
	}
}