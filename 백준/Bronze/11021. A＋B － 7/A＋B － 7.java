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
			// 문자열을 정수로 변환 후 받음
			int num=Integer.parseInt(br.readLine());
			int[] sum = new int[num];
			
			for(int i=0; i<num; i++) {
				String str = br.readLine();
				String[] strArr = str.split(" ");
				sum[i] = Integer.parseInt(strArr[0])+Integer.parseInt(strArr[1]);
				bw.write("Case #"+(i+1)+": "+sum[i]);
				bw.newLine();
			}
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