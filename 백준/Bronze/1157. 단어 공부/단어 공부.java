import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine().toLowerCase();
		char[] cStr = str.toCharArray();
		
		int[] count = new int[26];
		
		for(int i=0; i<cStr.length; i++) {
			count[cStr[i]-97] +=1; 
		}
		
		int max=0;
		String t = "";
		
		for(int i=0; i<26; i++) {
			if(max<count[i]) {
				max = count[i];
				t= String.valueOf((char)(i+97)).toUpperCase();
			}else if(max==count[i]){
				t="?";
			}
		}
		System.out.println(t);
	}
}