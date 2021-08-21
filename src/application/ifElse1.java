package application;
import java.io.*;


public class ifElse1 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        
        for(int i = 1; i<=10;i++) {
        	
        	int resultado = N * i;
        	
        	System.out.print(N);
        	System.out.print(" x ");
        	System.out.print(i);
        	System.out.print(" = ");
        	System.out.println(resultado);
        }

        bufferedReader.close();

	}

}
