package Strings;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class URI 1222 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		while (leitor.hasNext()) {
			int linhas = 0;
			int paginas = 0;
			int caracteres = 0;
			int numPalavras = leitor.nextInt();
			int maxLinhas = leitor.nextInt();
			int maxCarac = leitor.nextInt();
			for (int i = 1; i <= numPalavras; i++) {
				String palavra = leitor.next();
				caracteres += palavra.length();
				if (caracteres == maxCarac) {
					caracteres = 0;
					linhas++;
				} else if (caracteres > maxCarac) {
					caracteres = palavra.length() + 1;
					linhas++;
				}
				else if (i < numPalavras) {
					caracteres++;
					if (caracteres == maxCarac) {
						caracteres = 0;
						linhas++;
					}
				}
				if (linhas == maxLinhas) {
					linhas = 0;
					paginas++;
				}
			}
			if (linhas > 0 || caracteres > 0)
				paginas++;
			System.out.println(paginas);
		}
	}

}
