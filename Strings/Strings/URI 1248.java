package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class URI 1248 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();
		leitor.nextLine();
		for (int i = 0; i < N; i++) {
			boolean cheater = false;
			String dieta  = leitor.nextLine();
			String cafe   = leitor.nextLine();
			String almoco = leitor.nextLine();
			
			for (char c : cafe.toCharArray()) {
				String str = String.valueOf(c);
				if (dieta.contains(str)) {
					dieta = dieta.replace(str, "");
				} else {
					cheater = true;
				}
			}
			
			for (Character c : almoco.toCharArray()) {
				String str = String.valueOf(c);
				if (dieta.contains(str)) {
					dieta = dieta.replace(str, "");
				} else {
					cheater = true;
				}
			}
			
			if (cheater) {
				System.out.println("CHEATER");
			} else {
				char[] string = dieta.toCharArray();
				Arrays.sort(string);
				System.out.println(new String(string));
			}
		}
	}

}
