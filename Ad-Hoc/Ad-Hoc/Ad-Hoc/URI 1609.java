package Ad-Hoc;

import java.util.HashSet;
import java.util.Scanner;

public class URI 1609 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int T = leitor.nextInt();
		for (int i = 0; i < T; i++) {
			int N = leitor.nextInt();
			HashSet<Integer> numeros = new HashSet<>();
			for (int j = 0; j < N; j++) {
				numeros.add(leitor.nextInt());
			}
			System.out.println(numeros.size());
		}
    }
