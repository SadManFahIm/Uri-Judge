package Ad-Hoc;

import java.io.IOException;
import java.util.Scanner;

public class URI 2936 {
	
    public static final int[] porcoes = { 300, 1500, 600, 1000, 150 };

    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int total = 225;
    	for (int i = 0; i < 5; i++) {
    		total += leitor.nextInt() * porcoes[i];
		}
    	System.out.println(total);
    }
    
}
