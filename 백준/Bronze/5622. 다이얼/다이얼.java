import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		// 첫째 줄 에 알파벳대문자로 이루어진 단어가 주어짐
		String str = s.nextLine();
		
		char[] cArr = str.toCharArray();
		int time = 0;
		
		for(int i=0; i<cArr.length; i++) {
			switch(cArr[i]) {
				case 'A' : case 'B' : case 'C' :
					time+=2;
					break;
				case 'D' : case 'E' : case 'F' :
					time+=3;
					break;
				case 'G' : case 'H' : case 'I' :
					time+=4;
					break;
				case 'J' : case 'K' : case 'L' :
					time+=5;
					break;
				case 'M' : case 'N' : case 'O' :
					time+=6;
					break;
				case 'P' : case 'Q' : case 'R' : case 'S' :
					time+=7;
					break;
				case 'T' : case 'U' : case 'V' :
					time+=8;
					break;
				case 'W' : case 'X' : case 'Y' : case 'Z' :
					time+=9;
					break;
			}
			time+=1;
		}
		System.out.println(time);
	}
}