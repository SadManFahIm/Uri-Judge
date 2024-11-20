package Ad-Hoc;

import java.io.IOException;
import java.util.Scanner;

public class URI 2444 {

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int V = leitor.nextInt();
		int T = leitor.nextInt();
		for (int i = 0; i < T; i++) {
			V += leitor.nextInt();
			if (V > 100) V = 100;
			if (V < 0)   V = 0;
		}
		System.out.println(V);
	}

}
