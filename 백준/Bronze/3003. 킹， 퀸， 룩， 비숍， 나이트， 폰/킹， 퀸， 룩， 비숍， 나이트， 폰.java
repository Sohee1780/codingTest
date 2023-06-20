import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
			StringTokenizer st = new StringTokenizer(br.readLine());
			StringBuilder sb = new StringBuilder();
			
			int king = 1-Integer.parseInt(st.nextToken());
			int queen = 1-Integer.parseInt(st.nextToken());;
			int look = 2-Integer.parseInt(st.nextToken());;
			int bi = 2-Integer.parseInt(st.nextToken());;
			int night = 2-Integer.parseInt(st.nextToken());;
			int phone = 8-Integer.parseInt(st.nextToken());;
			
			System.out.printf("%d %d %d %d %d %d",king,queen,look,bi,night,phone);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}