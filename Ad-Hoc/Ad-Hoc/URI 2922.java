package Ad-Hoc;
import java.io.IOException;
import java.util.Scanner;

public class URI 2922 {

    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	while (leitor.hasNext()) {
    		int a = leitor.nextInt();
    		int b = leitor.nextInt();
    		if (a > b) {
    			int aux = a;
    			a = b;
    			b = aux;
    		}
    		if (a == b)
    			System.out.println(b - a);
    		else
    			System.out.println(b - a - 1);
    	}
    }
    
}
