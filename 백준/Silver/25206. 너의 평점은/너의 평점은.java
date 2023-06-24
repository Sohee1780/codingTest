import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {

			double cl = 0.0;
			double hak = 0.0;
			
			Map<String, Double> jumsu = new HashMap<>();
			jumsu.put("A+", 4.5);
			jumsu.put("A0", 4.0);
			jumsu.put("B+", 3.5);
			jumsu.put("B0", 3.0);
			jumsu.put("C+", 2.5);
			jumsu.put("C0", 2.0);
			jumsu.put("D+", 1.5);
			jumsu.put("D0", 1.0);
			jumsu.put("F", 0.0);
			
			for(int i=0; i<20; i++) {
				String str = br.readLine();
				String[] s = str.split(" ");
				
				if(!"P".equals(s[2])) {
					hak+=Double.parseDouble(s[1]);
					cl+= Double.parseDouble(s[1])*jumsu.get(s[2]);
				}
			}
			
			System.out.printf("%.6f",cl/hak);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}