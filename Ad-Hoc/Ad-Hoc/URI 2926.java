package Ad-Hoc;
import java.io.IOException;
import java.util.Scanner;

public class URI 2926 {
	
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int I = leitor.nextInt();
    	String a = "";
    	for (int i = 0; i < I; i++) {
    		a += "a";
    	}
    	System.out.println("Entao eh Natal!".replace("a", a));
    }
    
}
