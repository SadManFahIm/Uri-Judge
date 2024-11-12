import java.util.Scanner;

public class URI 1129 {
	
	public static String[] alternatvas = {"A", "B", "C", "D", "E" };

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		while (leitor.hasNext()) {
			int N = leitor.nextInt(); if (N == 0) break;
			for (int i = 0; i < N; i++) {
				int[] respostas = new int[5];
				int respostaMarcada = -1;
				boolean valida = false;
				for (int j = 0; j < 5; j++) {
					respostas[j] = leitor.nextInt();
					if (respostas[j] <= 127) {
						if (respostaMarcada == -1) {
							respostaMarcada = j;
							valida = true;
						} else {
							valida = false;
						}
					}
				}
				if (valida)
					System.out.println(alternatvas[respostaMarcada]);
				else
					System.out.println("*");
			}
		}
	}

}
