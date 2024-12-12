package Strings;

import java.io.IOException;
import java.util.Scanner;

public class URI 1272 {

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();
		for (int i = 0; i < N; i++) {
			String input = leitor.nextLine();
			if (input.isEmpty()) input = leitor.nextLine();
			String[] linhas = input.split(" ");
			String codigo = "";
			for (String linha : linhas) {
				if (!linha.isEmpty()) {
					codigo += linha.substring(0, 1);
				}
			}
			System.out.println(codigo);
		}
	}

}
