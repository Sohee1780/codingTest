import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int a=0;
			int b=0;
			/*
			 * readLine()은 System.out.println 메서드랑은 조금 다름
			 * BufferedWriter는 버퍼에 데이터를 모아둔 후, 버퍼가 넘치거나 자체적으로 내보내는 명령어(flush) 를 사용해야 출력이됨
			 * 
			 * bw.write(str+"\n");
			 * bw.flush();를 실행하면 출력 후 flush()를 한번 해주면 입력을 한번 받은 후 출력 하고 다시 입력받고 출력함
			 *
			 * bw.flush();를 마지막에 실행하면 한번에 출력함
			 * */
			do {
				String str = br.readLine();
				a = Integer.parseInt(str.split(" ")[0]);
				b = Integer.parseInt(str.split(" ")[1]);
				if(a!=0&&b!=0) {					
					bw.write(""+(a+b)+"\n");
				}
			}while(a!=0&&b!=0);
			bw.flush();
			br.close();
			bw.close();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}