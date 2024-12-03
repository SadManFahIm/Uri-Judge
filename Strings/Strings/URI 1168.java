package Strings;

import java.util.Scanner;

public class URI 1168 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();
		for (int i = 0; i < N; i++) {
			String V = leitor.next();
			int leds = 0;
			for (int j = 0; j < V.length(); j++) {
				char c =  V.charAt(j);
				switch (c) {
					case '0': leds += 6; break;
					case '1': leds += 2; break;
					case '2': leds += 5; break;
					case '3': leds += 5; break;
					case '4': leds += 4; break;
					case '5': leds += 5; break;
					case '6': leds += 6; break;
					case '7': leds += 3; break;
					case '8': leds += 7; break;
					case '9': leds += 6; break;
				}
			}
			System.out.println(leds + " leds");
		}
	}

}
