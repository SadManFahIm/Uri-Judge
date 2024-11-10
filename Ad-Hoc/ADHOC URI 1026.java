package Ad-Hoc;

import java.io.IOException;
import java.util.Scanner;

public class URI 1026 {

    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	while (leitor.hasNext()) {
    		long u = leitor.nextLong();
    		long m = leitor.nextLong();
    		System.out.println(u ^ m);
    	}
    }
    
}
