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
            String str = "";
 
            // 입력의 끝을 ctrl+z로 알려줘야함
            // readLine이 null이면 입력이 종료된것으로 간주
            // 버퍼에 담아놨다 한번에 출력하므로 플러쉬 마지막에 한번
            while((str = br.readLine()) != null) {            
            	bw.write(str);
            	bw.newLine();
            }
            
            bw.flush();
            br.close();
            bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}