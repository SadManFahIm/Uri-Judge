package Matemática;

import java.io.IOException;
import java.util.Scanner;

public class URI 1161 {

    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	while (leitor.hasNext()) {
    		int M = leitor.nextInt();
    		int N = leitor.nextInt();
    		long fatorial = fatorial(M) + fatorial(N);
    		System.out.println(fatorial);
    	}
    }
    
    public static long fatorial(int j) {
    	long fatorial = 1;
    	for(int i = 2; i <= j; i++)
    		fatorial *= i;
    	return fatorial;
    }
    
}
