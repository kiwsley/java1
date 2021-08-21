package application;
import java.util.*;

public class JavaOutputFormatting {

	public static void main(String[] args) {
		
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("================================");
		String[] vetor = new String[3];
		for(int i = 0; i<3; i++) {
			
			String s=sc.nextLine();
			String textoLimitado = s.length()<=10 ? s : s.substring(0, 10);
			textoLimitado = vetor[i];
			
		}
		
        for(int i = 0; i<3; i++) {
			
			
			System.out.println(vetor[i]); 
		
		
	}

	}}
