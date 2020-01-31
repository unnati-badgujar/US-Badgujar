import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class PrimeCheker {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n1=Integer.parseInt(br.readLine());
		int n2=br.read();
		String s1=br.readLine();
		
		System.out.println(n1 +" "+n2);
		System.out.println(s1);
	}
}
