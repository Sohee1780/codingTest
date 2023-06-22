import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		// 크로아티아 알파벳 문자 배열 만들어서 replace
		String[] croatia = {"c=","c-","dz=","d-","lj","nj","s=","z="};

		for(int i=0; i<8; i++ ) {
			str = str.replace(croatia[i], "a");
		}
		
		System.out.println(str.length());
	}
}